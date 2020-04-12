package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*学生管理
* 4-12Vanilla
* */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    com.hebeu.graduatefeedback.service.StudentService StudentService;
    @GetMapping("/list")
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
    }
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
