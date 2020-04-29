package com.hebeu.graduatefeedback.service;



import com.hebeu.graduatefeedback.pojo.PaperQue;

import java.util.List;

/*试卷条目
 * 4-27Vanilla
 * */
public interface PaperQueService {
    List<PaperQue> getPaperQues(PaperQue paperQue);
    List<PaperQue> getAll(PaperQue paperQue);
    PaperQue getPaperQueById(String id);
    int add(PaperQue paperQue);
    int del(PaperQue paperQue);
    //    int del(Integer id);
    int update(PaperQue paperQue);
//    /*19-12-29用户登录*/
//    PaperQue getByNameAndPwd(String name, String password);
}
