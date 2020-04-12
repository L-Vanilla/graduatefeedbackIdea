package com.hebeu.graduatefeedback.service;



import com.hebeu.graduatefeedback.pojo.Student;

import java.util.List;

/*管理员
 * 4-12Vanilla
 * */
public interface StudentService {
    List<Student> getStudents(Student student);
    List<Student> getAll(Student student);
    Student getStudentById(int id);
    int add(Student student);
    int del(Student student);
    //    int del(Integer id);
    int update(Student student);
//    /*19-12-29用户登录*/
//    Student getByNameAndPwd(String name, String password);
}
