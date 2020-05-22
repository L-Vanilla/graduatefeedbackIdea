package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.Admin;
import com.hebeu.graduatefeedback.service.AdminService;
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
@RequestMapping("/admin")
public class AdminController {
    @Resource
    com.hebeu.graduatefeedback.service.AdminService AdminService;
    @GetMapping("/list")
    public ServerResponse getAdmin(Admin admin){
        List<Admin> admins =AdminService.getAdmins(admin);
        PageInfo<Admin> pageInfo = new PageInfo<>(admins);
        return ServerResponse.createBySuccess("查询成功！",pageInfo);
    }
    @GetMapping("/getAll")
    public ServerResponse getAll(Admin admin){
        System.out.println("用户名"+admin.getName());
//        Admin.setActive(1);
        return ServerResponse.createBySuccess("查询成功！",AdminService.getAll(admin));
    }
    @PostMapping("/add")
    public ServerResponse add(Admin admin){
        int result =AdminService.add(admin);
        if(result>0){
            return ServerResponse.createBySuccess("添加成功！",null);
        }
        else{
            return ServerResponse.createByError("添加失败！");
        }

    }
    @GetMapping("/del")
    public ServerResponse del(Admin admin){
        int result = AdminService.update(admin);
        if(result>0){
            return ServerResponse.createBySuccess("删除成功！",null);
        }
        else
            return ServerResponse.createByError("删除失败！");
    }

    @PostMapping("/update")
    public ServerResponse update(Admin admin){
        int result = AdminService.update(admin);
        if(result>0){
            return ServerResponse.createBySuccess("更新成功！",null);
        }
        else
            return ServerResponse.createByError("更新失败！");
    }
    @GetMapping("/getOne")
    public ServerResponse getOne(Integer id){
        Admin admin = AdminService.getAdminById(id);
        return ServerResponse.createBySuccess("获取成功！",admin);
    }
    //    /*19-12-29管理员登录*/
    @CrossOrigin(allowCredentials = "true")
    @PostMapping("/login")
    public Admin login(@Param("id") Integer id, @Param("password") String password, HttpServletResponse response) {
        Admin admin = AdminService.getByIdAndPwd(id, password);
        Cookie cookie = new Cookie("adminName", admin.getName());
        cookie.setMaxAge(24 * 60 * 60); //存活期为1天
        cookie.setPath("/");
        response.addCookie(cookie);
        System.out.println("cookie" + cookie.getValue());
        return admin;
    }
    /*19-12-29管理员退出
    * */
    @GetMapping("/logout")
    public Integer logout(HttpServletRequest request,
                          HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                cookie.setMaxAge(0);//销毁cookie
                response.addCookie(cookie);
            }
        }
        return 1;
    }
    /*初始的*/
   /* @GetMapping("/list")
    public PageInfo<Admin> getAdmin(Admin admin){
        List<Admin> admins =AdminService.getAdmins(admin);
        PageInfo<Admin> pageInfo = new PageInfo<>(admins);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Admin> getAll(Admin admin){
        System.out.println("用户名"+admin.getName());
//        Admin.setActive(1);
        return AdminService.getAll(admin);
    }
    @PostMapping("/add")
    public int add(Admin admin){
        return AdminService.add(admin);
    }
    @GetMapping("/del")
    public int del(Admin admin){
        return AdminService.update(admin);
    }

    @PostMapping("/update")
    public int update(Admin admin){
        return AdminService.update(admin);
    }
    @GetMapping("/getOne")
    public Admin getOne(Integer id){
        return AdminService.getAdminById(id);
    }*/
//    /*19-12-29管理员登录*/
//    @CrossOrigin(allowCredentials = "true")
//    @PostMapping("/login")
//    public Admin login(@Param("name") String name, @Param("password") String password, HttpServletResponse response) {
//        Admin admin = AdminService.getByNameAndPwd(name, password);
//        Cookie cookie = new Cookie("adminName", admin.getName());
//        cookie.setMaxAge(24 * 60 * 60); //存活期为1天
//        cookie.setPath("/");
//        response.addCookie(cookie);
//        System.out.println("cookie" + cookie.getValue());
//        return admin;
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
