package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.Paper;
import com.hebeu.graduatefeedback.pojo.PaperView;
import com.hebeu.graduatefeedback.utils.ServerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*试卷
* 4-25Vanilla
* */
@RestController
@RequestMapping("/paper")
public class PaperController {
    @Resource
    com.hebeu.graduatefeedback.service.PaperService PaperService;

    /*5-5获取试卷的所有信息
    * @Param 问卷id
     * */
    @GetMapping("/getPaperQueList")
    public ServerResponse getPaperQueList(String paper_id){

        List<PaperView> paper = PaperService.getPaperByPaperId(paper_id);
        System.out.println("paper_id"+paper_id);
        return ServerResponse.createBySuccess("获取成功！",paper);
    }

    @GetMapping("/list")
    public ServerResponse getPaper(Paper paper){
        List<Paper> papers =PaperService.getPapers(paper);
        PageInfo<Paper> pageInfo = new PageInfo<>(papers);
        return ServerResponse.createBySuccess("查询成功！",pageInfo);
    }
    @GetMapping("/getAll")
    public ServerResponse getAll(Paper paper){
//        System.out.println("用户名"+paper.getName());
//        Paper.setActive(1);
        return ServerResponse.createBySuccess("查询成功！",PaperService.getAll(paper));
    }
    @PostMapping("/add")
    public ServerResponse add(Paper paper){
        int result =PaperService.add(paper);
        if(result>0){
            return ServerResponse.createBySuccess("添加成功！",null);
        }
        else{
            return ServerResponse.createByError("添加失败！");
        }

    }
    @GetMapping("/del")
    public ServerResponse del(Paper paper){
        int result = PaperService.update(paper);
        if(result>0){
            return ServerResponse.createBySuccess("删除成功！",null);
        }
        else
            return ServerResponse.createByError("删除失败！");
    }

    @PostMapping("/update")
    public ServerResponse update(Paper paper){
        int result = PaperService.update(paper);
        if(result>0){
            return ServerResponse.createBySuccess("更新成功！",null);
        }
        else
            return ServerResponse.createByError("更新失败！");
    }
    @GetMapping("/getOne")
    public ServerResponse getOne(String id){
        Paper paper = PaperService.getPaperById(id);
        return ServerResponse.createBySuccess("获取成功！",paper);
    }


}
