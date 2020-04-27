package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.Paper;
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
    /*初始的*/
   /* @GetMapping("/list")
    public PageInfo<Paper> getPaper(Paper paper){
        List<Paper> papers =PaperService.getPapers(paper);
        PageInfo<Paper> pageInfo = new PageInfo<>(papers);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Paper> getAll(Paper paper){
        System.out.println("用户名"+paper.getName());
//        Paper.setActive(1);
        return PaperService.getAll(paper);
    }
    @PostMapping("/add")
    public int add(Paper paper){
        return PaperService.add(paper);
    }
    @GetMapping("/del")
    public int del(Paper paper){
        return PaperService.update(paper);
    }

    @PostMapping("/update")
    public int update(Paper paper){
        return PaperService.update(paper);
    }
    @GetMapping("/getOne")
    public Paper getOne(Integer id){
        return PaperService.getPaperById(id);
    }*/
//    /*19-12-29管理员登录*/
//    @CrossOrigin(allowCredentials = "true")
//    @PostMapping("/login")
//    public Paper login(@Param("name") String name, @Param("password") String password, HttpServletResponse response) {
//        Paper paper = PaperService.getByNameAndPwd(name, password);
//        Cookie cookie = new Cookie("paperName", paper.getName());
//        cookie.setMaxAge(24 * 60 * 60); //存活期为1天
//        cookie.setPath("/");
//        response.addCookie(cookie);
//        System.out.println("cookie" + cookie.getValue());
//        return paper;
//    }
//    /*19-12-29管理员退出
//    * */
//    @GetMapping("/logout")
//    public Integer logout(HttpServletRequest request,
//                          HttpServletResponse response) {
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (int i = 0; i < cookies.length; i++) {
//                Cookie cookie = cookies[i];
//                cookie.setMaxAge(0);//销毁cookie
//                response.addCookie(cookie);
//            }
//        }
//        return 1;
//    }


}
