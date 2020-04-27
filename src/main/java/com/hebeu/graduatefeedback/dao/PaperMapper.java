package com.hebeu.graduatefeedback.dao;

import com.hebeu.graduatefeedback.pojo.Paper;
import com.hebeu.graduatefeedback.pojo.PaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperMapper {
    long countByExample(PaperExample example);

    int deleteByExample(PaperExample example);

    int deleteByPrimaryKey(String id);

    int insert(Paper record);

    int insertSelective(Paper record);

    List<Paper> selectByExample(PaperExample example);

    Paper selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByExample(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);
}