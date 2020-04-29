package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.PaperQue;
import com.hebeu.graduatefeedback.utils.ServerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*试卷条目控制层
* 4-27Vanilla
* */
@RestController
@RequestMapping("/paperQue")
public class PaperQueController {
    @Resource
    com.hebeu.graduatefeedback.service.PaperQueService PaperQueService;
    @GetMapping("/list")
    public ServerResponse getPaperQue(PaperQue paperQue){
        List<PaperQue> paperQues =PaperQueService.getPaperQues(paperQue);
        PageInfo<PaperQue> pageInfo = new PageInfo<>(paperQues);
        return ServerResponse.createBySuccess("查询成功！",pageInfo);
    }
    @GetMapping("/getAll")
    public ServerResponse getAll(PaperQue paperQue){
//        System.out.println("用户名"+paperQueQue.getName());
//        PaperQue.setActive(1);
        return ServerResponse.createBySuccess("查询成功！",PaperQueService.getAll(paperQue));
    }
    @PostMapping("/add")
    public ServerResponse add(PaperQue paperQue){
        int result =PaperQueService.add(paperQue);
        if(result>0){
            return ServerResponse.createBySuccess("添加成功！",null);
        }
        else{
            return ServerResponse.createByError("添加失败！");
        }

    }
    @GetMapping("/del")
    public ServerResponse del(PaperQue paperQue){
        int result = PaperQueService.update(paperQue);
        if(result>0){
            return ServerResponse.createBySuccess("删除成功！",null);
        }
        else
            return ServerResponse.createByError("删除失败！");
    }

    @PostMapping("/update")
    public ServerResponse update(PaperQue paperQue){
        int result = PaperQueService.update(paperQue);
        if(result>0){
            return ServerResponse.createBySuccess("更新成功！",null);
        }
        else
            return ServerResponse.createByError("更新失败！");
    }
    @GetMapping("/getOne")
    public ServerResponse getOne(String id){
        PaperQue paperQue = PaperQueService.getPaperQueById(id);
        return ServerResponse.createBySuccess("获取成功！",paperQue);
    }
    /*初始的*/
   /* @GetMapping("/list")
    public PageInfo<PaperQue> getPaperQue(PaperQue paperQue){
        List<PaperQue> paperQues =PaperQueService.getPaperQues(paperQue);
        PageInfo<PaperQue> pageInfo = new PageInfo<>(paperQues);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<PaperQue> getAll(PaperQue paperQue){
        System.out.println("用户名"+paperQue.getName());
//        PaperQue.setActive(1);
        return PaperQueService.getAll(paperQue);
    }
    @PostMapping("/add")
    public int add(PaperQue paperQue){
        return PaperQueService.add(paperQue);
    }
    @GetMapping("/del")
    public int del(PaperQue paperQue){
        return PaperQueService.update(paperQue);
    }

    @PostMapping("/update")
    public int update(PaperQue paperQue){
        return PaperQueService.update(paperQue);
    }
    @GetMapping("/getOne")
    public PaperQue getOne(Integer id){
        return PaperQueService.getPaperQueById(id);
    }*/
//    /*19-12-29管理员登录*/
//    @CrossOrigin(allowCredentials = "true")
//    @PostMapping("/login")
//    public PaperQue login(@Param("name") String name, @Param("password") String password, HttpServletResponse response) {
//        PaperQue paperQue = PaperQueService.getByNameAndPwd(name, password);
//        Cookie cookie = new Cookie("paperQueName", paperQue.getName());
//        cookie.setMaxAge(24 * 60 * 60); //存活期为1天
//        cookie.setPath("/");
//        response.addCookie(cookie);
//        System.out.println("cookie" + cookie.getValue());
//        return paperQue;
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
