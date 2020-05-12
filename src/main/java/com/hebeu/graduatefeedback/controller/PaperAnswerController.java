package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.PaperAnswer;
import com.hebeu.graduatefeedback.utils.ServerResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/*学生问卷
* 5-12Vanilla
* */
@RestController
@RequestMapping("/paperAnswer")
public class PaperAnswerController {
    @Resource
    com.hebeu.graduatefeedback.service.PaperAnswerService PaperAnswerService;

    /*插入多条学生问答条目*/
    @RequestMapping(value = "/insertAnswerList",method = RequestMethod.POST)
    public ServerResponse insertAnswerList(@RequestBody Map<String, Object> obj){
//        System.out.println("学生导入");
//            List<Map<String, Object>> bankSingleChoiceQueList = (List<Map<String, Object>>) obj.get("bankSingleChoiceQueList");
//            String title= (String) obj.get("title");
//            System.out.println("title"+title);
        Map<String, Object> result = PaperAnswerService.insertPaperAnswerList(obj);
        return ServerResponse.createBySuccess("发布成功！",result);

    }

    @GetMapping("/list")
    public ServerResponse getPaperAnswer(PaperAnswer paperAnswer){
        List<PaperAnswer> paperAnswers =PaperAnswerService.getPaperAnswers(paperAnswer);
        PageInfo<PaperAnswer> pageInfo = new PageInfo<>(paperAnswers);
        return ServerResponse.createBySuccess("查询成功！",pageInfo);
    }
    @GetMapping("/getAll")
    public ServerResponse getAll(PaperAnswer paperAnswer){
//        System.out.println("用户名"+paperAnswer.getName());
//        PaperAnswer.setActive(1);
        return ServerResponse.createBySuccess("查询成功！",PaperAnswerService.getAll(paperAnswer));
    }
    @GetMapping("/del")
    public ServerResponse del(PaperAnswer paperAnswer){
        int result = PaperAnswerService.update(paperAnswer);
        if(result>0){
            return ServerResponse.createBySuccess("删除成功！",null);
        }
        else
            return ServerResponse.createByError("删除失败！");
    }

    @PostMapping("/update")
    public ServerResponse update(PaperAnswer paperAnswer){
        int result = PaperAnswerService.update(paperAnswer);
        if(result>0){
            return ServerResponse.createBySuccess("更新成功！",null);
        }
        else
            return ServerResponse.createByError("更新失败！");
    }
    @GetMapping("/getOne")
    public ServerResponse getOne(String id){
        PaperAnswer paperAnswer = PaperAnswerService.getPaperAnswerById(id);
        return ServerResponse.createBySuccess("获取成功！",paperAnswer);
    }
    /*初始的*/
   /* @GetMapping("/list")
    public PageInfo<PaperAnswer> getPaperAnswer(PaperAnswer paperAnswer){
        List<PaperAnswer> paperAnswers =PaperAnswerService.getPaperAnswers(paperAnswer);
        PageInfo<PaperAnswer> pageInfo = new PageInfo<>(paperAnswers);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<PaperAnswer> getAll(PaperAnswer paperAnswer){
        System.out.println("用户名"+paperAnswer.getName());
//        PaperAnswer.setActive(1);
        return PaperAnswerService.getAll(paperAnswer);
    }
    @PostMapping("/add")
    public int add(PaperAnswer paperAnswer){
        return PaperAnswerService.add(paperAnswer);
    }
    @GetMapping("/del")
    public int del(PaperAnswer paperAnswer){
        return PaperAnswerService.update(paperAnswer);
    }

    @PostMapping("/update")
    public int update(PaperAnswer paperAnswer){
        return PaperAnswerService.update(paperAnswer);
    }
    @GetMapping("/getOne")
    public PaperAnswer getOne(Integer id){
        return PaperAnswerService.getPaperAnswerById(id);
    }*/
//    /*19-12-29管理员登录*/
//    @CrossOrigin(allowCredentials = "true")
//    @PostMapping("/login")
//    public PaperAnswer login(@Param("name") String name, @Param("password") String password, HttpServletResponse response) {
//        PaperAnswer paperAnswer = PaperAnswerService.getByNameAndPwd(name, password);
//        Cookie cookie = new Cookie("paperAnswerName", paperAnswer.getName());
//        cookie.setMaxAge(24 * 60 * 60); //存活期为1天
//        cookie.setPath("/");
//        response.addCookie(cookie);
//        System.out.println("cookie" + cookie.getValue());
//        return paperAnswer;
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
