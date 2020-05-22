package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.SumView;
import com.hebeu.graduatefeedback.utils.ServerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/*统计试卷
* 5-20Vanilla
* */
@RestController
@RequestMapping("/sumView")
public class SumViewController {
    @Resource
    com.hebeu.graduatefeedback.service.SumViewService SumViewService;
    @GetMapping("/list")
    public ServerResponse getSumView(SumView sumView){
        List<SumView> sumViews =SumViewService.getSumViews(sumView);
        PageInfo<SumView> pageInfo = new PageInfo<>(sumViews);
        System.out.println(pageInfo.getList());
        return ServerResponse.createBySuccess("查询成功！",pageInfo);
    }
    /*5-5获取试卷的所有信息
     * @Param 问卷id
     * AnswerView使用
     * */
    @GetMapping("/getAnswerView")
    public ServerResponse getAnswerView(String longId){

//        List<PaperView> paper = PaperService.getPaperByPaperId(paper_id);
        System.out.println("longId"+longId);
        List<Map<String, Object>> map = SumViewService.getAnswerViewByLongId(longId);
        if(map != null){
            return ServerResponse.createBySuccess("通过paper_id获取信息成功",map);
        }
        else {
            return ServerResponse.createByError("通过paper_id获取信息失败");
        }
    }
    /*导出试卷所有信息
     * @Param 问卷id
     * AnswerView使用
     * */
    @GetMapping("/getAllAnswersToExcel")
    public ServerResponse getAllAnswersToExcel(String paperId){

//        List<PaperView> paper = PaperService.getPaperByPaperId(paper_id);
//        System.out.println("longId"+longId);
        List<Map<String, Object>> map = SumViewService.GetAllAnswers(paperId);
        System.out.println("map"+map.get(0).get("answers"));
        if(map != null){
            return ServerResponse.createBySuccess("通过paper_id获取信息成功",map);
        }
        else {
            return ServerResponse.createByError("通过paper_id获取信息失败");
        }
    }


}
