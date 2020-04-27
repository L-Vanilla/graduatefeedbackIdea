package com.hebeu.graduatefeedback.service.impl;

import com.github.pagehelper.PageHelper;
import com.hebeu.graduatefeedback.pojo.Paper;
import com.hebeu.graduatefeedback.pojo.PaperExample;
import com.hebeu.graduatefeedback.service.PaperService;
import com.hebeu.graduatefeedback.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*试卷
 * 4-25Vanilla
 * */
@Service
@Primary
public class PaperServiceImpl implements PaperService {
    @Resource
    com.hebeu.graduatefeedback.dao.PaperMapper PaperMapper;
    @Override
    public List<Paper> getPapers(Paper paper) {

        PageHelper.startPage(paper.getPageNo(), paper.getPageSize());
        PaperExample PaperExample = new PaperExample();
        PaperExample.Criteria criteria = PaperExample.createCriteria();
        if (StringUtils.isNotBlank(paper.getTitle())) {
            criteria.andTitleLike("%" + paper.getTitle() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        PaperExample.setOrderByClause("id desc");
//        if(Paper.getActive()!=null)
//            criteria.andActiveEqualTo(Paper.getActive());

        return PaperMapper.selectByExample(PaperExample);
    }

    @Override
    public List<Paper> getAll(Paper paper) {
        PaperExample PaperExample = new PaperExample();
        PaperExample.Criteria criteria = PaperExample.createCriteria();
        System.out.println("用户名Service"+paper.getTitle());
        if (StringUtils.isNotBlank(paper.getTitle())) {
            criteria.andTitleEqualTo(paper.getTitle()).andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        return PaperMapper.selectByExample(PaperExample);
    }

    @Override
    public Paper getPaperById(String id) {
        return PaperMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Paper paper) {
        paper.setId(UUIDUtil.getUUID());
        paper.setCreateDate(new Date());
        return PaperMapper.insertSelective(paper);
    }

    @Override
    public int del(Paper paper) {
        return PaperMapper.updateByPrimaryKeySelective(paper);
    }

    @Override
    public int update(Paper paper) {
        return PaperMapper.updateByPrimaryKeySelective(paper);
    }
//    /*19-12-29用户登录*/
//    public Paper getByNameAndPwd(String name, String password) {
//        return PaperMapper.selectByNameAndPwd(name,password);
//    }

}
