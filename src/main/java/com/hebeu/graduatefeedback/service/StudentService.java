package com.hebeu.graduatefeedback.service;



import com.hebeu.graduatefeedback.pojo.Student;

import java.util.List;
import java.util.Map;

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
    /*4-13学生信息的批量导入*/
    public Map<String, Object> insertStudentInfoList(List<Map<String, Object>> studentList);
//    /*19-12-29用户登录*/
//    Student getByNameAndPwd(String name, String password);
}
