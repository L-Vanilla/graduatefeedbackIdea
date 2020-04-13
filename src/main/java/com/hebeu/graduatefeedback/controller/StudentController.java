package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.Student;
import com.hebeu.graduatefeedback.service.StudentService;
import com.hebeu.graduatefeedback.utils.ServerResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/*管理员
 * 4-10Vanilla
 * */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    com.hebeu.graduatefeedback.service.StudentService StudentService;
    @GetMapping("/list")
    public ServerResponse getStudent(Student student){
        List<Student> students =StudentService.getStudents(student);
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        return ServerResponse.createBySuccess("查询成功！",pageInfo);
    }
    @GetMapping("/getAll")
    public ServerResponse getAll(Student student){
        System.out.println("用户名"+student.getName());
//        Student.setActive(1);
        return ServerResponse.createBySuccess("查询成功！",StudentService.getAll(student));
    }
    @PostMapping("/add")
    public ServerResponse add(Student student){
        int result =StudentService.add(student);
        if(result>0){
            return ServerResponse.createBySuccess("添加成功！",null);
        }
        else{
            return ServerResponse.createByError("添加失败，该学号已存在！请重新输入...");
        }

    }
    @GetMapping("/del")
    public ServerResponse del(Student student){
        int result = StudentService.update(student);
        if(result>0){
            return ServerResponse.createBySuccess("删除成功！",null);
        }
        else
            return ServerResponse.createByError("删除失败！");
    }

    @PostMapping("/update")
    public ServerResponse update(Student student){
        int result = StudentService.update(student);
        if(result>0){
            return ServerResponse.createBySuccess("更新成功！",null);
        }
        else
            return ServerResponse.createByError("更新失败！");
    }
    @GetMapping("/getOne")
    public ServerResponse getOne(Integer id){
        Student student = StudentService.getStudentById(id);
        return ServerResponse.createBySuccess("获取成功！",student);
    }
    /*初始的*/
   /* @GetMapping("/list")
    public PageInfo<Student> getStudent(Student student){
        List<Student> students =StudentService.getStudents(student);
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Student> getAll(Student student){
        System.out.println("用户名"+student.getName());
//        Student.setActive(1);
        return StudentService.getAll(student);
    }
    @PostMapping("/add")
    public int add(Student student){
        return StudentService.add(student);
    }
    @GetMapping("/del")
    public int del(Student student){
        return StudentService.update(student);
    }

    @PostMapping("/update")
    public int update(Student student){
        return StudentService.update(student);
    }
    @GetMapping("/getOne")
    public Student getOne(Integer id){
        return StudentService.getStudentById(id);
    }*/
//    /*19-12-29管理员登录*/
//    @CrossOrigin(allowCredentials = "true")
//    @PostMapping("/login")
//    public Student login(@Param("name") String name, @Param("password") String password, HttpServletResponse response) {
//        Student student = StudentService.getByNameAndPwd(name, password);
//        Cookie cookie = new Cookie("studentName", student.getName());
//        cookie.setMaxAge(24 * 60 * 60); //存活期为1天
//        cookie.setPath("/");
//        response.addCookie(cookie);
//        System.out.println("cookie" + cookie.getValue());
//        return student;
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
