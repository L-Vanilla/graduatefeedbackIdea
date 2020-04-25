package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;
import com.hebeu.graduatefeedback.pojo.BankMultipleChoiceQue;
import com.hebeu.graduatefeedback.pojo.BankMultipleChoiceQueExample;
import com.hebeu.graduatefeedback.service.BankMultipleChoiceQueService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/*双选题
 * 4-24Vanilla
 * */
@Service
@Primary
public class BankMultipleChoiceQueServiceImpl implements BankMultipleChoiceQueService {
    @Resource
    com.hebeu.graduatefeedback.dao.BankMultipleChoiceQueMapper BankMultipleChoiceQueMapper;
    /*双选题信息的批量导入*/
    @Override
    public Map<String, Object> insertBankMultipleChoiceQueInfoList(List<Map<String, Object>> bankMultipleChoiceQueList) {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> responseList = new ArrayList<>();
        int successItemCount = 0;
        for (Map<String, Object> bankMultipleChoiceQueSingle : bankMultipleChoiceQueList){
            Map<String, Object> responseBankMultipleChoiceQue = new HashMap<>();
//            Integer id = Integer.parseInt(bankMultipleChoiceQueSingle.get("id").toString());
            String multipleContent = String.valueOf(bankMultipleChoiceQueSingle.get("multipleContent"));

            String choiceA = String.valueOf(bankMultipleChoiceQueSingle.get("choiceA"));

            String choiceB = String.valueOf(bankMultipleChoiceQueSingle.get("choiceB"));
            String choiceC = String.valueOf(bankMultipleChoiceQueSingle.get("choiceC"));
            String choiceD = String.valueOf(bankMultipleChoiceQueSingle.get("choiceD"));
            String choiceE = String.valueOf(bankMultipleChoiceQueSingle.get("choiceE"));
            String choiceF = String.valueOf(bankMultipleChoiceQueSingle.get("choiceF"));
            String choiceG = String.valueOf(bankMultipleChoiceQueSingle.get("choiceG"));
            String multipleType = String.valueOf(bankMultipleChoiceQueSingle.get("multipleype"));

//            responseBankMultipleChoiceQue.put("学号", id);
            responseBankMultipleChoiceQue.put("题目内容", multipleContent);
            responseBankMultipleChoiceQue.put("选项A",choiceA);
            responseBankMultipleChoiceQue.put("选项B", choiceB);
            responseBankMultipleChoiceQue.put("选项C", choiceC);
            responseBankMultipleChoiceQue.put("选项D", choiceD);
            responseBankMultipleChoiceQue.put("选项E", choiceE);
            responseBankMultipleChoiceQue.put("选项F", choiceF);
            responseBankMultipleChoiceQue.put("选项G", choiceG);
            responseBankMultipleChoiceQue.put("所属类型", multipleType);
            /*判断是否存在此学生*/
//            BankMultipleChoiceQue stu = BankMultipleChoiceQueMapper.selectByPrimaryKey(id);
            if(multipleContent.equals("null")||multipleContent==null){
                responseBankMultipleChoiceQue.put("上传状态", "失败，按照模板要求下载");
            }
            /*if (stu!=null) {
                responseBankMultipleChoiceQue.put("上传状态", "失败，该学号已被注册");
//            }*/ else {
                responseBankMultipleChoiceQue.put("上传状态", "成功");
                successItemCount++;
                BankMultipleChoiceQue bankMultipleChoiceQue = new BankMultipleChoiceQue();
//                bankMultipleChoiceQue.setId(id);
                bankMultipleChoiceQue.setMultipleContent(multipleContent);
                bankMultipleChoiceQue.setChoiceA(choiceA);
                bankMultipleChoiceQue.setChoiceB(choiceB);
                bankMultipleChoiceQue.setChoiceC(choiceC);
                bankMultipleChoiceQue.setChoiceD(choiceD);
                bankMultipleChoiceQue.setChoiceE(choiceE);
                bankMultipleChoiceQue.setChoiceF(choiceF);
                bankMultipleChoiceQue.setChoiceG(choiceG);
                bankMultipleChoiceQue.setMultipleType(multipleType);
                bankMultipleChoiceQue.setCreateDate(new Date());
                int insertResult = BankMultipleChoiceQueMapper.insertSelective(bankMultipleChoiceQue);
            }
            responseList.add(responseBankMultipleChoiceQue);
        }
        map.put("responseList", responseList);
        map.put("allItemCount", bankMultipleChoiceQueList.size());
        map.put("successItemCount", successItemCount);
        map.put("failItemCount", bankMultipleChoiceQueList.size() - successItemCount);
        return map;
    }
    @Override
    public List<BankMultipleChoiceQue> getBankMultipleChoiceQues(BankMultipleChoiceQue bankMultipleChoiceQue) {

        PageHelper.startPage(bankMultipleChoiceQue.getPageNo(), bankMultipleChoiceQue.getPageSize());
        BankMultipleChoiceQueExample BankMultipleChoiceQueExample = new BankMultipleChoiceQueExample();
        BankMultipleChoiceQueExample.Criteria criteria = BankMultipleChoiceQueExample.createCriteria();
        if (StringUtils.isNotBlank(bankMultipleChoiceQue.getMultipleContent())) {
            criteria.andMultipleContentLike("%" + bankMultipleChoiceQue.getMultipleContent() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        BankMultipleChoiceQueExample.setOrderByClause("id desc");
//        if(BankMultipleChoiceQue.getActive()!=null)
//            criteria.andActiveEqualTo(BankMultipleChoiceQue.getActive());

        return BankMultipleChoiceQueMapper.selectByExample(BankMultipleChoiceQueExample);
    }

    @Override
    public List<BankMultipleChoiceQue> getAll(BankMultipleChoiceQue bankMultipleChoiceQue) {
        BankMultipleChoiceQueExample BankMultipleChoiceQueExample = new BankMultipleChoiceQueExample();
        BankMultipleChoiceQueExample.Criteria criteria = BankMultipleChoiceQueExample.createCriteria();
//        System.out.println("用户名Service"+bankMultipleChoiceQue.getName());
        if (StringUtils.isNotBlank(bankMultipleChoiceQue.getMultipleContent())) {
            criteria.andMultipleContentLike("%" + bankMultipleChoiceQue.getMultipleContent() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        return BankMultipleChoiceQueMapper.selectByExample(BankMultipleChoiceQueExample);
    }

    @Override
    public BankMultipleChoiceQue getBankMultipleChoiceQueById(int id) {
        return BankMultipleChoiceQueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(BankMultipleChoiceQue bankMultipleChoiceQue) {
        /*判断学号是否存在*/
//        BankMultipleChoiceQue stu=BankMultipleChoiceQueMapper.selectByPrimaryKey(bankMultipleChoiceQue.getId());
//        if(stu!=null){
//            return 0;
//        }else {
        bankMultipleChoiceQue.setCreateDate(new Date());
        return BankMultipleChoiceQueMapper.insertSelective(bankMultipleChoiceQue);
//        }
    }

    @Override
    public int del(BankMultipleChoiceQue bankMultipleChoiceQue) {
        return BankMultipleChoiceQueMapper.updateByPrimaryKeySelective(bankMultipleChoiceQue);
    }

    @Override
    public int update(BankMultipleChoiceQue bankMultipleChoiceQue) {
        return BankMultipleChoiceQueMapper.updateByPrimaryKeySelective(bankMultipleChoiceQue);
    }


//    /*19-12-29用户登录*/
//    public BankMultipleChoiceQue getByNameAndPwd(String name, String password) {
//        return BankMultipleChoiceQueMapper.selectByNameAndPwd(name,password);
//    }

}
