package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;
import com.hebeu.graduatefeedback.dao.PaperViewMapper;
import com.hebeu.graduatefeedback.pojo.*;
import com.hebeu.graduatefeedback.service.PaperService;
import com.hebeu.graduatefeedback.utils.MailUtils;
import com.hebeu.graduatefeedback.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.util.*;

/*试卷
 * 4-25Vanilla
 * */
@Service
@Primary
public class PaperServiceImpl implements PaperService {
    @Resource
    com.hebeu.graduatefeedback.dao.PaperMapper PaperMapper;
    @Resource
    com.hebeu.graduatefeedback.dao.PaperViewMapper PaperViewMapper;
    /*选择同学发放问卷*/
    @Override
    public Map<String, Object> insertPublishStudentList(Map<String, Object> obj) {
        List<Map<String, Object>> StudentList = (List<Map<String, Object>>) obj.get("StudentList");

//        System.out.println("title"+title);
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> responseList = new ArrayList<>();
        for (Map<String, Object> Student : StudentList){
            Integer provideNumber=0;//发放试卷数
            Map<String, Object> responsePaperAnswerQue = new HashMap<>();
            Integer studentId = Integer.parseInt(Student.get("studentId").toString());
            String mail = String.valueOf(Student.get("mail"));
            String paperId = String.valueOf(Student.get("paperId"));
            Paper paper = PaperMapper.selectByPrimaryKey(paperId);
            try {
                MailUtils.sendMail(mail,"这是学校的一份调查问卷" +
                        "<br><a href='http://127.0.0.1:8080/paperDetails/"+paperId+"'>点击</a>");
            } catch (MessagingException e) {
                e.printStackTrace();
            }
            provideNumber++;
            paper.setProvideNumber(paper.getProvideNumber()+provideNumber);
            PaperMapper.updateByPrimaryKeySelective(paper);
        }

        map.put("responseList", responseList);
        return map;
    }
    /*根据paper_id获取所有试卷的条目信息*/
    @Override
    public List<PaperView> getPaperByPaperId(String paper_id) {
        PaperViewExample paperViewExample = new PaperViewExample();
        PaperViewExample.Criteria criteria = paperViewExample.createCriteria();
//        System.out.println("用户名Service"+paper.getTitle());
        if (StringUtils.isNotBlank(paper_id)) {
            criteria.andPaperIdEqualTo(paper_id);
        }
        paperViewExample.setOrderByClause("que_num asc");
        return PaperViewMapper.selectByExample(paperViewExample);
    }

    /*获取试卷的所有题目信息*/
    @Override
    public List<Map<String, Object>> getPaperAnswerQueList(String paper_id) {
        List<Map<String, Object>> listResult = new ArrayList<>();
        PaperViewExample paperViewExample = new PaperViewExample();
        PaperViewExample.Criteria criteria = paperViewExample.createCriteria();
//        System.out.println("用户名Service"+paper.getTitle());
        if (StringUtils.isNotBlank(paper_id)) {
            criteria.andPaperIdEqualTo(paper_id);
        }
        paperViewExample.setOrderByClause("que_num asc");
        List<PaperView> paperViewList = PaperViewMapper.selectByExample(paperViewExample);
        for (PaperView paperView : paperViewList){
            Map<String, Object> map = new HashMap<>();
            /*试卷信息*/
            map.put("paperId",paperView.getPaperId());
            map.put("title",paperView.getTitle());
            map.put("content",paperView.getContent());
            map.put("remarks",paperView.getRemarks());

            /*条目信息*/
            map.put("singleContent",paperView.getSingleContent());
            map.put("queType",paperView.getQueType());
            map.put("queNum",paperView.getQueNum());
            map.put("queId",paperView.getQueId());

            List<Map<String, String>> optionsList = new ArrayList<>();
            Map<String, String> optionA = new HashMap<>();
            optionA.put("label",paperView.getChoiceA());
            optionA.put("value","A");
            optionsList.add(optionA);
            Map<String, String> optionB = new HashMap<>();
            optionB.put("label",paperView.getChoiceB());
            optionB.put("value","B");
            optionsList.add(optionB);
            Map<String, String> optionC = new HashMap<>();
            optionC.put("label",paperView.getChoiceC());
            optionC.put("value","C");
            optionsList.add(optionC);
            Map<String, String> optionD = new HashMap<>();
            optionD.put("label",paperView.getChoiceD());
            optionD.put("value","D");
            optionsList.add(optionD);
            Map<String, String> optionE = new HashMap<>();
            optionE.put("label",paperView.getChoiceE());
            optionE.put("value","E");
            optionsList.add(optionE);
            Map<String, String> optionF = new HashMap<>();
            optionF.put("label",paperView.getChoiceF());
            optionF.put("value","F");
            optionsList.add(optionF);
            Map<String, String> optionG = new HashMap<>();
            optionG.put("label",paperView.getChoiceG());
            optionG.put("value","G");
            optionsList.add(optionG);
            map.put("options",optionsList);

            listResult.add(map);
        }

        return listResult;
    }


    @Override
    public List<Paper> getPapers(Paper paper) {

        PageHelper.startPage(paper.getPageNo(), paper.getPageSize());
        PaperExample PaperExample = new PaperExample();
        PaperExample.Criteria criteria = PaperExample.createCriteria();
        if (StringUtils.isNotBlank(paper.getTitle())) {
            criteria.andTitleLike("%" + paper.getTitle() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        PaperExample.setOrderByClause("create_date desc");
//        if(Paper.getActive()!=null)
//            criteria.andActiveEqualTo(Paper.getActive());

        return PaperMapper.selectByExample(PaperExample);
    }

    @Override
    public List<Paper> getAll(Paper paper) {
        PaperExample PaperExample = new PaperExample();
        PaperExample.Criteria criteria = PaperExample.createCriteria();
        System.out.println("用户名Service"+paper.getTitle());
        if (StringUtils.isNotBlank(paper.getTitle())) {
            criteria.andTitleEqualTo(paper.getTitle()).andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        return PaperMapper.selectByExample(PaperExample);
    }

    @Override
    public Paper getPaperById(String id) {
        return PaperMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Paper paper) {
        paper.setId(UUIDUtil.getUUID());
        paper.setCreateDate(new Date());
        return PaperMapper.insertSelective(paper);
    }

    @Override
    public int del(Paper paper) {
        return PaperMapper.updateByPrimaryKeySelective(paper);
    }

    @Override
    public int update(Paper paper) {
        return PaperMapper.updateByPrimaryKeySelective(paper);
    }


//    /*19-12-29用户登录*/
//    public Paper getByNameAndPwd(String name, String password) {
//        return PaperMapper.selectByNameAndPwd(name,password);
//    }

}
