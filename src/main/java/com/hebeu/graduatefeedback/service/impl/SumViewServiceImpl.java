package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;

import com.hebeu.graduatefeedback.pojo.SumView;
import com.hebeu.graduatefeedback.pojo.SumViewExample;
import com.hebeu.graduatefeedback.service.SumViewService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/*统计视图
 * 5-20Vanilla
 * */
@Service
@Primary
public class SumViewServiceImpl implements SumViewService {
    @Resource
    com.hebeu.graduatefeedback.dao.SumViewMapper SumViewMapper;
    @Override
    public List<SumView> getSumViews(SumView sumView) {

        PageHelper.startPage(sumView.getPageNo(), sumView.getPageSize());
        System.out.println("paperId"+sumView.getPaperId());
        SumViewExample SumViewExample = new SumViewExample();
        SumViewExample.Criteria criteria = SumViewExample.createCriteria();
        if (StringUtils.isNotBlank(sumView.getPaperId())) {
            criteria.andPaperIdEqualTo( sumView.getPaperId());
        }
        SumViewExample.setGroupByClause("long_id");
        SumViewExample.setOrderByClause("create_date desc");
//        if(SumView.getActive()!=null)
//            criteria.andActiveEqualTo(SumView.getActive());
        List<SumView> sumViewList=SumViewMapper.selectByExample(SumViewExample);
//        List<SumView> sumViewList1 =new ArrayList<>();
//        Integer i = 0 ;
//        for(SumView sumView1 : sumViewList){
//            sumView1.setLongNum(sumViewList.size()-1);
//            i++;
//            sumViewList1.add(sumView1);
//        }
        return sumViewList;
//        return SumViewMapper.Sum_SelectByPaperId(sumView.getPaperId());
    }

    /*获取试卷的所有题目信息*/
    @Override
    public List<Map<String, Object>> getAnswerViewByLongId(String longId) {
        List<Map<String, Object>> listResult = new ArrayList<>();
        SumViewExample sumViewExample = new SumViewExample();
        SumViewExample.Criteria criteria = sumViewExample.createCriteria();
//        System.out.println("用户名Service"+paper.getTitle());
        if (StringUtils.isNotBlank(longId)) {
            criteria.andLongIdEqualTo(longId);
        }
        sumViewExample.setOrderByClause("que_num asc");
        List<SumView> sumViewList = SumViewMapper.selectByExample(sumViewExample);
        for (SumView sumView : sumViewList){
            Map<String, Object> map = new HashMap<>();
            /*试卷信息*/
            map.put("paperId",sumView.getPaperId());
            map.put("title",sumView.getTitle());
            map.put("content",sumView.getContent());
            map.put("remarks",sumView.getRemarks());

            /*条目信息*/
            map.put("singleContent",sumView.getSingleContent());
            map.put("queType",sumView.getQueType());
            map.put("queNum",sumView.getQueNum());
            map.put("queId",sumView.getQueId());
            map.put("answer",sumView.getAnswer());

            List<Map<String, String>> optionsList = new ArrayList<>();
            Map<String, String> optionA = new HashMap<>();
            optionA.put("label",sumView.getChoiceA());
            optionA.put("value","A");
            optionsList.add(optionA);
            System.out.println("choiceA"+sumView.getChoiceA());
            Map<String, String> optionB = new HashMap<>();
            optionB.put("label",sumView.getChoiceB());
            optionB.put("value","B");
            optionsList.add(optionB);
            Map<String, String> optionC = new HashMap<>();
            optionC.put("label",sumView.getChoiceC());
            optionC.put("value","C");
            optionsList.add(optionC);
            Map<String, String> optionD = new HashMap<>();
            optionD.put("label",sumView.getChoiceD());
            optionD.put("value","D");
            optionsList.add(optionD);
            Map<String, String> optionE = new HashMap<>();
            optionE.put("label",sumView.getChoiceE());
            optionE.put("value","E");
            optionsList.add(optionE);
            Map<String, String> optionF = new HashMap<>();
            optionF.put("label",sumView.getChoiceF());
            optionF.put("value","F");
            optionsList.add(optionF);
            Map<String, String> optionG = new HashMap<>();
            optionG.put("label",sumView.getChoiceG());
            optionG.put("value","G");
            optionsList.add(optionG);
            map.put("options",optionsList);
            List<Map<String, String>> answerList = new ArrayList<>();

            Map<String, String> answerA = new HashMap<>();
            answerA.put("label",sumView.getChoiceA());
            if(sumView.getAnswer().contains("A")){
                answerA.put("value","1");
            }
            else{
                answerA.put("value","A");
            }
            answerList.add(answerA);
            Map<String, String> answerB = new HashMap<>();
            answerB.put("label",sumView.getChoiceB());
            if(sumView.getAnswer().contains("B")){
                answerB.put("value","1");
            }else{
                answerB.put("value","B");
            }
            answerList.add(answerB);
            Map<String, String> answerC = new HashMap<>();
            answerC.put("label",sumView.getChoiceC());
            if(sumView.getAnswer().contains("C")){
                answerC.put("value","1");
            }else{
                answerC.put("value","C");
            }
            answerList.add(answerC);

            map.put("answers",answerList);


            listResult.add(map);
        }

        return listResult;
    } /*获取试卷的所有题目信息*/
    @Override
    public List<Map<String, Object>> GetAllAnswers(String paperId) {
        List<Map<String, Object>> listResult = new ArrayList<>();
        /*通过paperid获取各个试卷的longid*/
        SumViewExample SumViewExample = new SumViewExample();
        SumViewExample.Criteria criteria = SumViewExample.createCriteria();
        if (StringUtils.isNotBlank(paperId)) {
            criteria.andPaperIdEqualTo(paperId);
        }
        SumViewExample.setGroupByClause("long_id");
        SumViewExample.setOrderByClause("create_date desc");
//        if(SumView.getActive()!=null)
//            criteria.andActiveEqualTo(SumView.getActive());
        List<SumView> sumViewListByPaperId=SumViewMapper.selectByExample(SumViewExample);
        /*从通过遍历paperid查找的语句中找到longid*/
        for(SumView sumViewByPaperId : sumViewListByPaperId){
            Map<String, Object> map = new HashMap<>();
            SumViewExample sumViewExample1 = new SumViewExample();
            SumViewExample.Criteria criteria1 = sumViewExample1.createCriteria();
//        System.out.println("用户名Service"+paper.getTitle());
            if (StringUtils.isNotBlank(sumViewByPaperId.getLongId())) {
                criteria1.andLongIdEqualTo(sumViewByPaperId.getLongId());
            }
            sumViewExample1.setOrderByClause("que_num asc");
            List<SumView> sumViewList = SumViewMapper.selectByExample(sumViewExample1);
            List<Map<String, String>> answerList = new ArrayList<>();
            System.out.println("sumViewListByPaperId:"+sumViewListByPaperId);
            for (int i=0;i<sumViewList.size();i++){
                System.out.println("sumViewList:"+sumViewList.get(i).getAnswer());
                Map<String, String> answers = new HashMap<>();
                String AnswerChoice ="";
                if(sumViewList.get(i).getAnswer().contains("A")){
                    AnswerChoice=AnswerChoice+"A:"+sumViewByPaperId.getChoiceA();
                    answers.put("answer"+i,AnswerChoice);
                }
                if(sumViewList.get(i).getAnswer().contains("B")){
                    AnswerChoice=AnswerChoice+"B:"+sumViewByPaperId.getChoiceB();
                    answers.put("answer"+i,AnswerChoice);
                }
                if(sumViewList.get(i).getAnswer().contains("C")){
                    AnswerChoice=AnswerChoice+"C:"+sumViewByPaperId.getChoiceC();
                    answers.put("answer"+i,AnswerChoice);
                }
                if(sumViewList.get(i).getAnswer().contains("D")){
                    AnswerChoice=AnswerChoice+"D:"+sumViewByPaperId.getChoiceD();
                    answers.put("answer"+i,AnswerChoice);
                }
                if(sumViewList.get(i).getAnswer().contains("E")){
                    AnswerChoice=AnswerChoice+"E:"+sumViewByPaperId.getChoiceE();
                    answers.put("answer"+i,AnswerChoice);
                } if(sumViewList.get(i).getAnswer().contains("F")){
                    AnswerChoice=AnswerChoice+"F:"+sumViewByPaperId.getChoiceE();
                    answers.put("answer"+i,AnswerChoice);
                } if(sumViewList.get(i).getAnswer().contains("G")){
                    AnswerChoice=AnswerChoice+"G:"+sumViewByPaperId.getChoiceE();
                    answers.put("answer"+i,AnswerChoice);
                }else{
                    AnswerChoice=sumViewList.get(i).getAnswer();
                    answers.put("answer"+i,AnswerChoice);
                }
                System.out.println("answer:"+i+answers.get("answer"+i));
                answerList.add(answers);
            }
            map.put("answerList",answerList);
            System.out.println("answerList"+map.get("answerList"));
            listResult.add(map);
        }


        return listResult;
    }

}
