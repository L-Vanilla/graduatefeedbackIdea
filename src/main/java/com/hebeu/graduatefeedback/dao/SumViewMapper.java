package com.hebeu.graduatefeedback.dao;

import com.hebeu.graduatefeedback.pojo.SumView;
import com.hebeu.graduatefeedback.pojo.SumViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SumViewMapper {
    long countByExample(SumViewExample example);

    int deleteByExample(SumViewExample example);

    int insert(SumView record);

    int insertSelective(SumView record);

    List<SumView> selectByExample(SumViewExample example);

    int updateByExampleSelective(@Param("record") SumView record, @Param("example") SumViewExample example);

    int updateByExample(@Param("record") SumView record, @Param("example") SumViewExample example);
}