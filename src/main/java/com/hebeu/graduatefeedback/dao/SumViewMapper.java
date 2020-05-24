package com.hebeu.graduatefeedback.dao;

import com.hebeu.graduatefeedback.pojo.SumView;
import com.hebeu.graduatefeedback.pojo.SumViewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SumViewMapper {
    long countByExample(SumViewExample example);

    int deleteByExample(SumViewExample example);

    int insert(SumView record);

    int insertSelective(SumView record);

    List<SumView> selectByExample(SumViewExample example);

    int updateByExampleSelective(@Param("record") SumView record, @Param("example") SumViewExample example);

    int updateByExample(@Param("record") SumView record, @Param("example") SumViewExample example);
    /*通过que_id查询统单选题的指标信息*/
    @Select("SELECT answer,count(*) as count  from  sum_view where que_id=#{queId} GROUP BY answer")
    List<Map<String,String>> SumSingleAnswerByQueId(String queId);
}