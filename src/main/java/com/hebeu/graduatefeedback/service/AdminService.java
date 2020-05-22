package com.hebeu.graduatefeedback.service;



import com.hebeu.graduatefeedback.pojo.Admin;

import java.util.List;

/*管理员
 * 4-10Vanilla
 * */
public interface AdminService {
    List<Admin> getAdmins(Admin admin);
    List<Admin> getAll(Admin admin);
    Admin getAdminById(int id);
    int add(Admin admin);
    int del(Admin admin);
    //    int del(Integer id);
    int update(Admin admin);
//    /*19-12-29用户登录*/
    Admin getByIdAndPwd(Integer id, String password);
}
