package com.hebeu.graduatefeedback.service;



import com.hebeu.graduatefeedback.pojo.BankMultipleChoiceQue;

import java.util.List;
import java.util.Map;

/*双选题
 * 4-24Vanilla
 * */
public interface BankMultipleChoiceQueService {
    List<BankMultipleChoiceQue> getBankMultipleChoiceQues(BankMultipleChoiceQue bankMultipleChoiceQue);
    List<BankMultipleChoiceQue> getAll(BankMultipleChoiceQue bankMultipleChoiceQue);
    BankMultipleChoiceQue getBankMultipleChoiceQueById(int id);
    int add(BankMultipleChoiceQue bankMultipleChoiceQue);
    int del(BankMultipleChoiceQue bankMultipleChoiceQue);
    //    int del(Integer id);
    int update(BankMultipleChoiceQue bankMultipleChoiceQue);
    /*4-13学生信息的批量导入*/
    public Map<String, Object> insertBankMultipleChoiceQueInfoList(List<Map<String, Object>> bankMultipleChoiceQueList);
//    /*19-12-29用户登录*/
//    BankMultipleChoiceQue getByNameAndPwd(String name, String password);
}
