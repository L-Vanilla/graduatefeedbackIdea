package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;
import com.hebeu.graduatefeedback.pojo.Admin;
import com.hebeu.graduatefeedback.pojo.AdminExample;
import com.hebeu.graduatefeedback.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*管理员
 * 4-10Vanilla
 * */
@Service
@Primary
public class AdminServiceImpl implements AdminService {
    @Resource
    com.hebeu.graduatefeedback.dao.AdminMapper AdminMapper;
    @Override
    public List<Admin> getAdmins(Admin admin) {

        PageHelper.startPage(admin.getPageNo(), admin.getPageSize());
        AdminExample AdminExample = new AdminExample();
        AdminExample.Criteria criteria = AdminExample.createCriteria();
        if (StringUtils.isNotBlank(admin.getName())) {
            criteria.andNameLike("%" + admin.getName() + "%").andActiveEqualTo(1).andRoleEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1).andRoleEqualTo(1);
        }
        AdminExample.setOrderByClause("id desc");
        return AdminMapper.selectByExample(AdminExample);
    }

    @Override
    public List<Admin> getAll(Admin admin) {
        AdminExample AdminExample = new AdminExample();
        AdminExample.Criteria criteria = AdminExample.createCriteria();
        System.out.println("用户名Service"+admin.getName());
        if (StringUtils.isNotBlank(admin.getName())) {
            criteria.andNameEqualTo(admin.getName()).andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        return AdminMapper.selectByExample(AdminExample);
    }

    @Override
    public Admin getAdminById(int id) {
        return AdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Admin admin) {
        admin.setCreateDate(new Date());
        return AdminMapper.insertSelective(admin);
    }

    @Override
    public int del(Admin admin) {
        return AdminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public int update(Admin admin) {
        return AdminMapper.updateByPrimaryKeySelective(admin);
    }
    /*19-12-29用户登录*/
    public Admin getByIdAndPwd(Integer id, String password) {
        return AdminMapper.getByIdAndPwd(id,password);
    }

}
