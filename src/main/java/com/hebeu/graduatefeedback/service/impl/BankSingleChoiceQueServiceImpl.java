package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;
import com.hebeu.graduatefeedback.pojo.BankSingleChoiceQue;
import com.hebeu.graduatefeedback.pojo.BankSingleChoiceQueExample;
import com.hebeu.graduatefeedback.pojo.Paper;
import com.hebeu.graduatefeedback.pojo.PaperQue;
import com.hebeu.graduatefeedback.service.BankSingleChoiceQueService;
import com.hebeu.graduatefeedback.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/*单选题
 * 4-14Vanilla
 * */
@Service
@Primary
public class BankSingleChoiceQueServiceImpl implements BankSingleChoiceQueService {
    @Resource
    com.hebeu.graduatefeedback.dao.BankSingleChoiceQueMapper BankSingleChoiceQueMapper;
    @Resource
    com.hebeu.graduatefeedback.dao.PaperMapper paperMapper;
    @Resource
    com.hebeu.graduatefeedback.dao.PaperQueMapper paperQueMapper;
    /*单选题信息的批量导入*/
    @Override
    public Map<String, Object> insertBankSingleChoiceQueInfoList(List<Map<String, Object>> bankSingleChoiceQueList) {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> responseList = new ArrayList<>();
        int successItemCount = 0;
        System.out.println("学生列表"+bankSingleChoiceQueList.size());
        for (Map<String, Object> bankSingleChoiceQueSingle : bankSingleChoiceQueList){
            Map<String, Object> responseBankSingleChoiceQue = new HashMap<>();
//            Integer id = Integer.parseInt(bankSingleChoiceQueSingle.get("id").toString());
            String singleContent = String.valueOf(bankSingleChoiceQueSingle.get("singleContent"));

            String choiceA = String.valueOf(bankSingleChoiceQueSingle.get("choiceA"));

            String choiceB = String.valueOf(bankSingleChoiceQueSingle.get("choiceB"));
            String choiceC = String.valueOf(bankSingleChoiceQueSingle.get("choiceC"));
            String choiceD = String.valueOf(bankSingleChoiceQueSingle.get("choiceD"));
            String choiceE = String.valueOf(bankSingleChoiceQueSingle.get("choiceE"));
            String choiceF = String.valueOf(bankSingleChoiceQueSingle.get("choiceF"));
            String choiceG = String.valueOf(bankSingleChoiceQueSingle.get("choiceG"));
            String singeType = String.valueOf(bankSingleChoiceQueSingle.get("singeType"));

//            responseBankSingleChoiceQue.put("学号", id);
            responseBankSingleChoiceQue.put("题目内容", singleContent);
            responseBankSingleChoiceQue.put("选项A",choiceA);
            responseBankSingleChoiceQue.put("选项B", choiceB);
            responseBankSingleChoiceQue.put("选项C", choiceC);
            responseBankSingleChoiceQue.put("选项D", choiceD);
            responseBankSingleChoiceQue.put("选项E", choiceE);
            responseBankSingleChoiceQue.put("选项F", choiceF);
            responseBankSingleChoiceQue.put("选项G", choiceG);
            responseBankSingleChoiceQue.put("所属类型", singeType);
            /*判断是否存在此学生*/
//            BankSingleChoiceQue stu = BankSingleChoiceQueMapper.selectByPrimaryKey(id);
            if(singleContent.equals("null")||singleContent==null){
                responseBankSingleChoiceQue.put("上传状态", "失败，按照模板要求下载");
            }
            /*if (stu!=null) {
                responseBankSingleChoiceQue.put("上传状态", "失败，该学号已被注册");
//            }*/ else {

                successItemCount++;
                BankSingleChoiceQue bankSingleChoiceQue = new BankSingleChoiceQue();
                bankSingleChoiceQue.setId(UUIDUtil.getUUID());
                bankSingleChoiceQue.setSingleContent(singleContent);
                System.out.println("biaoti "+bankSingleChoiceQue.getSingleContent());
                bankSingleChoiceQue.setChoiceA(choiceA);
                bankSingleChoiceQue.setChoiceB(choiceB);
                bankSingleChoiceQue.setChoiceC(choiceC);
                bankSingleChoiceQue.setChoiceD(choiceD);
                bankSingleChoiceQue.setChoiceE(choiceE);
                bankSingleChoiceQue.setChoiceF(choiceF);
                bankSingleChoiceQue.setChoiceG(choiceG);
                bankSingleChoiceQue.setSingeType(singeType);
                bankSingleChoiceQue.setCreateDate(new Date());
                int insertResult = BankSingleChoiceQueMapper.insertSelective(bankSingleChoiceQue);
                System.out.println("result "+insertResult);

                responseBankSingleChoiceQue.put("上传状态", "成功");
            }
            responseList.add(responseBankSingleChoiceQue);
        }
        map.put("responseList", responseList);
        map.put("allItemCount", bankSingleChoiceQueList.size());
        map.put("successItemCount", successItemCount);
        map.put("failItemCount", bankSingleChoiceQueList.size() - successItemCount);
        return map;
    }

    /*试卷信息的条目插入*/
    @Override
    public Map<String, Object> insertBankSingleChoiceQueList(Map<String, Object> obj) {
        List<Map<String, Object>> bankSingleChoiceQueList = (List<Map<String, Object>>) obj.get("bankSingleChoiceQueList");
       /*试卷表的一些数据字段--------------0*/

        String paper_id= UUIDUtil.getUUID();
        String title= (String) obj.get("title");
        System.out.println("title"+title);
        String content= (String) obj.get("content");
        String remarks= (String) obj.get("remarks");
        Paper paper=new Paper();
        paper.setId(paper_id);
        paper.setTitle(title);
        paper.setContent(content);
        paper.setRemarks(remarks);
        paper.setCreateDate(new Date());
        System.out.println("paper"+paper);
        paperMapper.insertSelective(paper);

        /*-------------试卷表的一些数据字段1-----------------*/

//        System.out.println("title"+title);
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> responseList = new ArrayList<>();
        for (Map<String, Object> bankSingleChoiceQueSingle : bankSingleChoiceQueList){
            Map<String, Object> responseBankSingleChoiceQue = new HashMap<>();
//            Integer id = Integer.parseInt(bankSingleChoiceQueSingle.get("id").toString());
            String singleContent = String.valueOf(bankSingleChoiceQueSingle.get("singleContent"));
            String choiceA = String.valueOf(bankSingleChoiceQueSingle.get("choiceA"));
            String choiceB = String.valueOf(bankSingleChoiceQueSingle.get("choiceB"));
            String choiceC = String.valueOf(bankSingleChoiceQueSingle.get("choiceC"));
            String choiceD = String.valueOf(bankSingleChoiceQueSingle.get("choiceD"));
            String choiceE = String.valueOf(bankSingleChoiceQueSingle.get("choiceE"));
            String choiceF = String.valueOf(bankSingleChoiceQueSingle.get("choiceF"));
            String choiceG = String.valueOf(bankSingleChoiceQueSingle.get("choiceG"));
            String singeType = String.valueOf(bankSingleChoiceQueSingle.get("singeType"));

//            String Qt=String.valueOf(bankSingleChoiceQueSingle.get("queType"));

            Integer queType = Integer.parseInt(bankSingleChoiceQueSingle.get("queType").toString());
            System.out.println("queType"+queType);
//            responseBankSingleChoiceQue.put("学号", id);
            responseBankSingleChoiceQue.put("题目内容", singleContent);
            responseBankSingleChoiceQue.put("选项A",choiceA);
            responseBankSingleChoiceQue.put("选项B", choiceB);
            responseBankSingleChoiceQue.put("选项C", choiceC);
            responseBankSingleChoiceQue.put("选项D", choiceD);
            responseBankSingleChoiceQue.put("选项E", choiceE);
            responseBankSingleChoiceQue.put("选项F", choiceF);
            responseBankSingleChoiceQue.put("选项G", choiceG);
            responseBankSingleChoiceQue.put("所属类型", singeType);
            /*判断是否存在此学生*/
//            BankSingleChoiceQue stu = BankSingleChoiceQueMapper.selectByPrimaryKey(id);
            if(singleContent.equals("null")||singleContent==null){
                responseBankSingleChoiceQue.put("上传状态", "失败，按照模板要求下载");
            }
            /*if (stu!=null) {
                responseBankSingleChoiceQue.put("上传状态", "失败，该学号已被注册");
//            }*/
            else {
                /*插入BankSingleChoice条目表---------------0*/
                BankSingleChoiceQue bankSingleChoiceQue = new BankSingleChoiceQue();
                String que_id=UUIDUtil.getUUID();
                bankSingleChoiceQue.setId(que_id);
                bankSingleChoiceQue.setSingleContent(singleContent);
                System.out.println("biaoti "+bankSingleChoiceQue.getSingleContent());
                bankSingleChoiceQue.setChoiceA(choiceA);
                bankSingleChoiceQue.setChoiceB(choiceB);
                bankSingleChoiceQue.setChoiceC(choiceC);
                bankSingleChoiceQue.setChoiceD(choiceD);
                bankSingleChoiceQue.setChoiceE(choiceE);
                bankSingleChoiceQue.setChoiceF(choiceF);
                bankSingleChoiceQue.setChoiceG(choiceG);
                bankSingleChoiceQue.setSingeType(singeType);
                bankSingleChoiceQue.setQueType(queType);
                bankSingleChoiceQue.setCreateDate(new Date());
                int insertResult = BankSingleChoiceQueMapper.insertSelective(bankSingleChoiceQue);
                System.out.println("result "+insertResult);
                /*-插入BankSingleChoice条目表---------------1*/
                /*插入试卷条目表----------0*/
                PaperQue paperQue=new PaperQue();
                paperQue.setId(UUIDUtil.getUUID());
                paperQue.setQueId(que_id);
                paperQue.setPaperId(paper_id);
                paperQue.setQueType(queType);
                paperQueMapper.insertSelective(paperQue);
                /*插入试卷条目表----------1*/
                responseBankSingleChoiceQue.put("上传状态", "成功");
            }
            responseList.add(responseBankSingleChoiceQue);
        }
        map.put("responseList", responseList);
        return map;
    }

    /**/
    @Override
    public List<BankSingleChoiceQue> getBankSingleChoiceQues(BankSingleChoiceQue bankSingleChoiceQue) {

        PageHelper.startPage(bankSingleChoiceQue.getPageNo(), bankSingleChoiceQue.getPageSize());
        BankSingleChoiceQueExample BankSingleChoiceQueExample = new BankSingleChoiceQueExample();
        BankSingleChoiceQueExample.Criteria criteria = BankSingleChoiceQueExample.createCriteria();
        if (StringUtils.isNotBlank(bankSingleChoiceQue.getSingleContent())) {
            criteria.andSingleContentLike("%" + bankSingleChoiceQue.getSingleContent() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        BankSingleChoiceQueExample.setOrderByClause("create_date desc");
//        if(BankSingleChoiceQue.getActive()!=null)
//            criteria.andActiveEqualTo(BankSingleChoiceQue.getActive());

        return BankSingleChoiceQueMapper.selectByExample(BankSingleChoiceQueExample);
    }

    @Override
    public List<BankSingleChoiceQue> getAll(BankSingleChoiceQue bankSingleChoiceQue) {
        BankSingleChoiceQueExample BankSingleChoiceQueExample = new BankSingleChoiceQueExample();
        BankSingleChoiceQueExample.Criteria criteria = BankSingleChoiceQueExample.createCriteria();
//        System.out.println("用户名Service"+bankSingleChoiceQue.getName());
        if (StringUtils.isNotBlank(bankSingleChoiceQue.getSingleContent())) {
            criteria.andSingleContentLike("%" + bankSingleChoiceQue.getSingleContent() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        return BankSingleChoiceQueMapper.selectByExample(BankSingleChoiceQueExample);
    }

    @Override
    public BankSingleChoiceQue getBankSingleChoiceQueById(String id) {
        return BankSingleChoiceQueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(BankSingleChoiceQue bankSingleChoiceQue) {
        /*判断学号是否存在*/
//        BankSingleChoiceQue stu=BankSingleChoiceQueMapper.selectByPrimaryKey(bankSingleChoiceQue.getId());
//        if(stu!=null){
//            return 0;
//        }else {

        bankSingleChoiceQue.setId(UUIDUtil.getUUID());

        bankSingleChoiceQue.setCreateDate(new Date());
        return BankSingleChoiceQueMapper.insertSelective(bankSingleChoiceQue);
//        }
    }

    @Override
    public int del(BankSingleChoiceQue bankSingleChoiceQue) {
        return BankSingleChoiceQueMapper.updateByPrimaryKeySelective(bankSingleChoiceQue);
    }

    @Override
    public int update(BankSingleChoiceQue bankSingleChoiceQue) {
        return BankSingleChoiceQueMapper.updateByPrimaryKeySelective(bankSingleChoiceQue);
    }


//    /*19-12-29用户登录*/
//    public BankSingleChoiceQue getByNameAndPwd(String name, String password) {
//        return BankSingleChoiceQueMapper.selectByNameAndPwd(name,password);
//    }

}
