package com.hebeu.graduatefeedback.service;



import com.hebeu.graduatefeedback.pojo.SumView;

import java.util.List;
import java.util.Map;

/*统计视图
 * 5-10Vanilla
 * */
public interface SumViewService {
    List<SumView> getSumViews(SumView sumView);
    List<Map<String, Object>> getAnswerViewByLongId(String longId);
    List<Map<String, Object>> GetAllAnswers(String paperId);

}
