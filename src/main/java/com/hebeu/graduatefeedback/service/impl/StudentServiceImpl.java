package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;
import com.hebeu.graduatefeedback.pojo.Student;
import com.hebeu.graduatefeedback.pojo.StudentExample;
import com.hebeu.graduatefeedback.service.StudentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*学生管理
 * 4-12Vanilla
 * */
@Service
@Primary
public class StudentServiceImpl implements StudentService {
    @Resource
    com.hebeu.graduatefeedback.dao.StudentMapper StudentMapper;
    @Override
    public List<Student> getStudents(Student student) {

        PageHelper.startPage(student.getPageNo(), student.getPageSize());
        StudentExample StudentExample = new StudentExample();
        StudentExample.Criteria criteria = StudentExample.createCriteria();
        if (StringUtils.isNotBlank(student.getName())) {
            criteria.andNameLike("%" + student.getName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        StudentExample.setOrderByClause("id desc");
//        if(Student.getActive()!=null)
//            criteria.andActiveEqualTo(Student.getActive());

        return StudentMapper.selectByExample(StudentExample);
    }

    @Override
    public List<Student> getAll(Student student) {
        StudentExample StudentExample = new StudentExample();
        StudentExample.Criteria criteria = StudentExample.createCriteria();
        System.out.println("用户名Service"+student.getName());
        if (StringUtils.isNotBlank(student.getName())) {
            criteria.andNameEqualTo(student.getName()).andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        return StudentMapper.selectByExample(StudentExample);
    }

    @Override
    public Student getStudentById(int id) {
        return StudentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Student student) {
        /*判断学号是否存在*/
        Student stu=StudentMapper.selectByPrimaryKey(student.getId());
        if(stu!=null){
            return 0;
        }else {
            student.setCreateDate(new Date());
            return StudentMapper.insertSelective(student);
        }
    }

    @Override
    public int del(Student student) {
        return StudentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public int update(Student student) {
        return StudentMapper.updateByPrimaryKeySelective(student);
    }
//    /*19-12-29用户登录*/
//    public Student getByNameAndPwd(String name, String password) {
//        return StudentMapper.selectByNameAndPwd(name,password);
//    }

}
