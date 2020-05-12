package com.hebeu.graduatefeedback.service;



import com.hebeu.graduatefeedback.pojo.Paper;
import com.hebeu.graduatefeedback.pojo.PaperView;

import java.util.List;

/*试卷
 * 4-25Vanilla
 * */
public interface PaperService {
    List<Paper> getPapers(Paper paper);
    List<Paper> getAll(Paper paper);
    Paper getPaperById(String id);
    int add(Paper paper);
    int del(Paper paper);
    //    int del(Integer id);
    int update(Paper paper);

    List<PaperView> getPaperByPaperId(String paper_id);
//    /*19-12-29用户登录*/
//    Paper getByNameAndPwd(String name, String password);
}
