package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;
import com.hebeu.graduatefeedback.pojo.Student;
import com.hebeu.graduatefeedback.pojo.StudentExample;
import com.hebeu.graduatefeedback.service.StudentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/*学生管理
 * 4-12Vanilla
 * */
@Service
@Primary
public class StudentServiceImpl implements StudentService {
    @Resource
    com.hebeu.graduatefeedback.dao.StudentMapper StudentMapper;
    /*4-13学生信息的批量导入*/
    @Override
    public Map<String, Object> insertStudentInfoList(List<Map<String, Object>> studentList) {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> responseList = new ArrayList<>();
        int successItemCount = 0;
        System.out.println("学生列表"+studentList.size());
        for (Map<String, Object> studentSingle : studentList){
            Map<String, Object> responseStudent = new HashMap<>();
            Integer id = Integer.parseInt(studentSingle.get("id").toString());
            String name = (String) studentSingle.get("name");
            Integer sex;
            if ( studentSingle.get("sex").equals('男')){
                sex=0;
            }else {
                sex=1;
            }
            String sex1 = String.valueOf(studentSingle.get("sex"));
            String college = String.valueOf(studentSingle.get("college"));
            String specialty = String.valueOf(studentSingle.get("specialty"));
            String grade = String.valueOf(studentSingle.get("grade"));
            String mail = String.valueOf(studentSingle.get("mail"));
            String phone = String.valueOf(studentSingle.get("phone"));

            responseStudent.put("学号", id);
            responseStudent.put("姓名", name);
            responseStudent.put("性别",sex1);
            responseStudent.put("学院", college);
            responseStudent.put("专业", specialty);
            responseStudent.put("班级", grade);
            responseStudent.put("邮箱", mail);
            responseStudent.put("手机号", phone);
            /*判断是否存在此学生*/
            Student stu = StudentMapper.selectByPrimaryKey(id);
            if (stu!=null) {
                responseStudent.put("上传状态", "失败，该学号已被注册");
            } else {
                responseStudent.put("上传状态", "成功");
                successItemCount++;
                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setSex(sex);
                student.setCollege(college);
                student.setSpecialty(specialty);
                student.setGrade(grade);
                student.setMail(mail);
                student.setPhone(phone);
                student.setCreateDate(new Date());
                int insertResult = StudentMapper.insertSelective(student);
            }
            responseList.add(responseStudent);
        }
        map.put("responseList", responseList);
        map.put("allItemCount", studentList.size());
        map.put("successItemCount", successItemCount);
        map.put("failItemCount", studentList.size() - successItemCount);
        return map;
    }
    @Override
    public List<Student> getStudents(Student student) {

        PageHelper.startPage(student.getPageNo(), student.getPageSize());
        StudentExample StudentExample = new StudentExample();
        StudentExample.Criteria criteria = StudentExample.createCriteria();
        if (StringUtils.isNotBlank(student.getName())) {
            criteria.andNameLike("%" + student.getName() + "%").andActiveEqualTo(1);
        }
        if (StringUtils.isNotBlank(student.getCollege())) {
            criteria.andCollegeLike("%" + student.getCollege() + "%").andActiveEqualTo(1);
        }
        if (StringUtils.isNotBlank(student.getSpecialty())) {
            criteria.andSpecialtyLike("%" + student.getSpecialty() + "%").andActiveEqualTo(1);
        }
        if (StringUtils.isNotBlank(student.getGrade())) {
            criteria.andGradeLike("%" + student.getGrade() + "%").andActiveEqualTo(1);
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
