package com.hebeu.graduatefeedback.service;



import com.hebeu.graduatefeedback.pojo.BankSingleChoiceQue;

import java.util.List;
import java.util.Map;

/*单选题
 * 4-12Vanilla
 * */
public interface BankSingleChoiceQueService {
    List<BankSingleChoiceQue> getBankSingleChoiceQues(BankSingleChoiceQue bankSingleChoiceQue);
    List<BankSingleChoiceQue> getAll(BankSingleChoiceQue bankSingleChoiceQue);
    BankSingleChoiceQue getBankSingleChoiceQueById(int id);
    int add(BankSingleChoiceQue bankSingleChoiceQue);
    int del(BankSingleChoiceQue bankSingleChoiceQue);
    //    int del(Integer id);
    int update(BankSingleChoiceQue bankSingleChoiceQue);
    /*4-13学生信息的批量导入*/
    public Map<String, Object> insertBankSingleChoiceQueInfoList(List<Map<String, Object>> bankSingleChoiceQueList);
//    /*19-12-29用户登录*/
//    BankSingleChoiceQue getByNameAndPwd(String name, String password);
}
