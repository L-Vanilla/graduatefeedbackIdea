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

//            Map<String, String> answerD = new HashMap<>();
//            answerD.put("label",sumView.getChoiceD());
//            if(sumView.getAnswer().contains("D")){
//                answerD.put("value","1");
//            }else{
//                answerD.put("value","D");
//            }
//            answerList.add(answerD);
//
//            Map<String, String> answerE = new HashMap<>();
//            answerE.put("label",sumView.getChoiceE());
//            if(sumView.getAnswer().contains("E")){
//                answerE.put("value","1");
//            }else{
//                answerE.put("value","E");
//            }
//            answerList.add(answerE);
//
//            Map<String, String> answerF = new HashMap<>();
//            answerE.put("label",sumView.getChoiceF());
//            if(sumView.getAnswer().contains("F")){
//                answerF.put("value","1");
//            }else{
//                answerF.put("value","F");
//            }
//            answerList.add(answerE);
//
//            Map<String, String> answerG = new HashMap<>();
//            answerG.put("label",sumView.getChoiceG());
//            if(sumView.getAnswer().contains("G")){
//                answerG.put("value","1");
//            }else{
//                answerG.put("value","G");
//            }
//            answerList.add(answerG);

            map.put("answers",answerList);


            listResult.add(map);
        }

        return listResult;
    }

    /*获取试卷的所有题目信息*/
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
//        SumViewExample.setGroupByClause("long_id");
//        if(SumView.getActive()!=null)
//            criteria.andActiveEqualTo(SumView.getActive());
        List<SumView> sumViewListByPaperId=SumViewMapper.selectByExample(SumViewExample);

        List<Map<String, String>> answerList = new ArrayList<>();
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
//            System.out.println("sumViewListByPaperId:"+sumViewListByPaperId.size());
//            System.out.println("sumViewListByPaperId:"+sumViewListByPaperId.size());
            Map<String, String> answers = new HashMap<>();
            for (int i=0;i<sumViewList.size();i++){
//                System.out.println("sumViewList:"+sumViewList.size());
                String AnswerChoice ="";

                if(sumViewList.get(i).getAnswer().indexOf("A")>-1){
                    System.out.println("Aif");
                    AnswerChoice=AnswerChoice+"A:"+sumViewList.get(i).getChoiceA();
                }
                else{
                    System.out.println("A:"+sumViewList.get(i).getAnswer());
                }
                if(sumViewList.get(i).getAnswer().contains("B")){
                    System.out.println("Bif");
                    AnswerChoice=AnswerChoice+"B:"+sumViewList.get(i).getChoiceB();
                }else{
                    System.out.println("B:"+sumViewList.get(i).getAnswer());
                }
                if(sumViewList.get(i).getAnswer().contains("C")){
                    System.out.println("Cif");
                    AnswerChoice=AnswerChoice+"C:"+sumViewList.get(i).getChoiceC();
                }
                else{

                }
                if(sumViewList.get(i).getAnswer().equals("null")){
                    AnswerChoice="未作答";
                }

                if(sumViewList.get(i).getAnswer().contains("D")){
                    AnswerChoice=AnswerChoice+"D:"+sumViewList.get(i).getChoiceD();
                }
                if(sumViewList.get(i).getAnswer().contains("E")){
                    AnswerChoice=AnswerChoice+"E:"+sumViewList.get(i).getChoiceE();
                }
                if(sumViewList.get(i).getAnswer().contains("F")){
                    AnswerChoice=AnswerChoice+"F:"+sumViewList.get(i).getChoiceF();
                }
                if(sumViewList.get(i).getAnswer().contains("G")){
                    AnswerChoice=AnswerChoice+"G:"+sumViewList.get(i).getChoiceG();
                }
                if(StringUtils.isBlank(AnswerChoice)){
                    AnswerChoice=sumViewList.get(i).getAnswer();
                }
                map.put("answer"+i,AnswerChoice);
                System.out.println("answer:"+i+map.get("answer"+i));
            }
//            answerList.add(answers);
//            map.put("answers",answers);
//            System.out.println("answers"+map.get("answers"));
            listResult.add(map);
        }


        return listResult;
    }

    /*通过que_id查询统单选题的指标信息*/
    @Override
    public List<Map<String, String>> SumSingleAnswerByQueId(String queId) {

        return SumViewMapper.SumSingleAnswerByQueId(queId);
    }
}
