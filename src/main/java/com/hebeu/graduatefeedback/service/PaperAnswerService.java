package com.hebeu.graduatefeedback.service;



import com.hebeu.graduatefeedback.pojo.PaperAnswer;

import java.util.List;
import java.util.Map;

/*问卷答案
 * 5-12Vanilla
 * */
public interface PaperAnswerService {
    List<PaperAnswer> getPaperAnswers(PaperAnswer paperAnswer);
    List<PaperAnswer> getAll(PaperAnswer paperAnswer);
    PaperAnswer getPaperAnswerById(String id);
    Map<String, Object> insertPaperAnswerList(Map<String, Object> obj);
    int del(PaperAnswer paperAnswer);
    //    int del(Integer id);
    int update(PaperAnswer paperAnswer);
//    /*19-12-29用户登录*/
//    PaperAnswer getByNameAndPwd(String name, String password);
}
