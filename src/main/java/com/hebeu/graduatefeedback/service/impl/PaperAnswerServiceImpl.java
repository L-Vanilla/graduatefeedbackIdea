package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;
import com.hebeu.graduatefeedback.dao.PaperMapper;
import com.hebeu.graduatefeedback.pojo.Paper;
import com.hebeu.graduatefeedback.pojo.PaperAnswer;
import com.hebeu.graduatefeedback.pojo.PaperAnswerExample;
import com.hebeu.graduatefeedback.service.PaperAnswerService;
import com.hebeu.graduatefeedback.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/*学生答案
 * 5-12Vanilla
 * */
@Service
@Primary
public class PaperAnswerServiceImpl implements PaperAnswerService {
    @Resource
    com.hebeu.graduatefeedback.dao.PaperAnswerMapper PaperAnswerMapper;
    @Resource
    com.hebeu.graduatefeedback.dao.PaperMapper PaperMapper;
    @Override
    public List<PaperAnswer> getPaperAnswers(PaperAnswer paperAnswer) {
        PageHelper.startPage(paperAnswer.getPageNo(), paperAnswer.getPageSize());
        PaperAnswerExample PaperAnswerExample = new PaperAnswerExample();
        PaperAnswerExample.Criteria criteria = PaperAnswerExample.createCriteria();
       /* if (StringUtils.isNotBlank(paperAnswer.getName())) {
            criteria.andNameLike("%" + paperAnswer.getName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }*/
        PaperAnswerExample.setOrderByClause("id desc");
//        if(PaperAnswer.getActive()!=null)
//            criteria.andActiveEqualTo(PaperAnswer.getActive());

        return PaperAnswerMapper.selectByExample(PaperAnswerExample);
    }

    @Override
    public List<PaperAnswer> getAll(PaperAnswer paperAnswer) {
        PaperAnswerExample PaperAnswerExample = new PaperAnswerExample();
        PaperAnswerExample.Criteria criteria = PaperAnswerExample.createCriteria();
//        System.out.println("用户名Service"+paperAnswer.getName());
//        if (StringUtils.isNotBlank(paperAnswer.getName())) {
//            criteria.andNameEqualTo(paperAnswer.getName()).andActiveEqualTo(1);
//        }
//        else {
//            criteria.andActiveEqualTo(1);
//        }
        return PaperAnswerMapper.selectByExample(PaperAnswerExample);
    }

    @Override
    public PaperAnswer getPaperAnswerById(String id) {
        return PaperAnswerMapper.selectByPrimaryKey(id);
    }

    @Override
    public Map<String, Object> insertPaperAnswerList(Map<String, Object> obj) {
        List<Map<String, Object>> PaperAnswerQueList = (List<Map<String, Object>>) obj.get("PaperAnswerQueList");
        String paperId= (String) obj.get("paperId");
        String longId= (String) obj.get("longId");

        System.out.println("paperId:"+paperId);
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> responseList = new ArrayList<>();
        for (Map<String, Object> PaperAnswerQue : PaperAnswerQueList){
            Map<String, Object> responsePaperAnswerQue = new HashMap<>();
//            Integer id = Integer.parseInt(bankSingleChoiceQueSingle.get("id").toString());
            String answer = String.valueOf(PaperAnswerQue.get("answer"));
            String queId = String.valueOf(PaperAnswerQue.get("queId"));

//            Integer queType = Integer.parseInt(bankSingleChoiceQueSingle.get("queType").toString());
//            responseBankSingleChoiceQue.put("学号", id);
            responsePaperAnswerQue.put("卷子id", paperId);
            responsePaperAnswerQue.put("答案",answer);
            responsePaperAnswerQue.put("条目id", queId);

            /*插入PaperAnswer条目表---------------0*/
            PaperAnswer paperAnswer = new PaperAnswer();
            String id= UUIDUtil.getUUID();
            paperAnswer.setId(id);
            paperAnswer.setAnswer(answer);
            paperAnswer.setPaperId(paperId);
            paperAnswer.setQueId(queId);
            paperAnswer.setLongId(longId);
            paperAnswer.setCreateDate(new Date());

            int insertResult = PaperAnswerMapper.insertSelective(paperAnswer);
            System.out.println("result "+insertResult);
            responsePaperAnswerQue.put("上传状态", "成功");

            responseList.add(responsePaperAnswerQue);
        }
        Paper  paper = PaperMapper.selectByPrimaryKey(paperId);
        System.out.println("paperAnswer"+paper.getJoinNumber());
        paper.setJoinNumber(paper.getJoinNumber()+1);
        int res=PaperMapper.updateByPrimaryKey(paper);

        map.put("responseList", responseList);
        return map;
    }

    @Override
    public int del(PaperAnswer paperAnswer) {
        return PaperAnswerMapper.updateByPrimaryKeySelective(paperAnswer);
    }

    @Override
    public int update(PaperAnswer paperAnswer) {
        return PaperAnswerMapper.updateByPrimaryKeySelective(paperAnswer);
    }
//    /*19-12-29用户登录*/
//    public PaperAnswer getByNameAndPwd(String name, String password) {
//        return PaperAnswerMapper.selectByNameAndPwd(name,password);
//    }

}
