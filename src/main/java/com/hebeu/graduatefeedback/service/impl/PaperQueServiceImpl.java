package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;
import com.hebeu.graduatefeedback.pojo.PaperQue;
import com.hebeu.graduatefeedback.pojo.PaperQueExample;
import com.hebeu.graduatefeedback.service.PaperQueService;
import com.hebeu.graduatefeedback.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*试卷条目
 * 4-27Vanilla
 * */
@Service
@Primary
public class PaperQueServiceImpl implements PaperQueService {
    @Resource
    com.hebeu.graduatefeedback.dao.PaperQueMapper PaperQueMapper;
    @Override
    public List<PaperQue> getPaperQues(PaperQue paperQue) {

        PageHelper.startPage(paperQue.getPageNo(), paperQue.getPageSize());
        PaperQueExample PaperQueExample = new PaperQueExample();
        PaperQueExample.Criteria criteria = PaperQueExample.createCriteria();
//        if (StringUtils.isNotBlank(paperQue.getTitle())) {
//            criteria.andTitleLike("%" + paperQue.getTitle() + "%").andActiveEqualTo(1);
//        }
//        else {
//            criteria.andActiveEqualTo(1);
//        }
        PaperQueExample.setOrderByClause("id desc");
//        if(PaperQue.getActive()!=null)
//            criteria.andActiveEqualTo(PaperQue.getActive());

        return PaperQueMapper.selectByExample(PaperQueExample);
    }

    @Override
    public List<PaperQue> getAll(PaperQue paperQue) {
        PaperQueExample PaperQueExample = new PaperQueExample();
        PaperQueExample.Criteria criteria = PaperQueExample.createCriteria();
//        System.out.println("用户名Service"+paperQue.getTitle());
//        if (StringUtils.isNotBlank(paperQue.getTitle())) {
//            criteria.andTitleEqualTo(paperQue.getTitle()).andActiveEqualTo(1);
//        }
//        else {
//            criteria.andActiveEqualTo(1);
//        }
        return PaperQueMapper.selectByExample(PaperQueExample);
    }

    @Override
    public PaperQue getPaperQueById(String id) {
        return PaperQueMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(PaperQue paperQue) {
        paperQue.setId(UUIDUtil.getUUID());
//        paperQue.setCreateDate(new Date());
        return PaperQueMapper.insertSelective(paperQue);
    }

    @Override
    public int del(PaperQue paperQue) {
        return PaperQueMapper.updateByPrimaryKeySelective(paperQue);
    }

    @Override
    public int update(PaperQue paperQue) {
        return PaperQueMapper.updateByPrimaryKeySelective(paperQue);
    }
//    /*19-12-29用户登录*/
//    public PaperQue getByNameAndPwd(String name, String password) {
//        return PaperQueMapper.selectByNameAndPwd(name,password);
//    }

}
