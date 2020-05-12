package com.hebeu.graduatefeedback.dao;

import com.hebeu.graduatefeedback.pojo.PaperAnswer;
import com.hebeu.graduatefeedback.pojo.PaperAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperAnswerMapper {
    long countByExample(PaperAnswerExample example);

    int deleteByExample(PaperAnswerExample example);

    int deleteByPrimaryKey(String id);

    int insert(PaperAnswer record);

    int insertSelective(PaperAnswer record);

    List<PaperAnswer> selectByExample(PaperAnswerExample example);

    PaperAnswer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PaperAnswer record, @Param("example") PaperAnswerExample example);

    int updateByExample(@Param("record") PaperAnswer record, @Param("example") PaperAnswerExample example);

    int updateByPrimaryKeySelective(PaperAnswer record);

    int updateByPrimaryKey(PaperAnswer record);
}