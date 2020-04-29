package com.hebeu.graduatefeedback.dao;

import com.hebeu.graduatefeedback.pojo.PaperQue;
import com.hebeu.graduatefeedback.pojo.PaperQueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperQueMapper {
    long countByExample(PaperQueExample example);

    int deleteByExample(PaperQueExample example);

    int deleteByPrimaryKey(String id);

    int insert(PaperQue record);

    int insertSelective(PaperQue record);

    List<PaperQue> selectByExample(PaperQueExample example);

    PaperQue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PaperQue record, @Param("example") PaperQueExample example);

    int updateByExample(@Param("record") PaperQue record, @Param("example") PaperQueExample example);

    int updateByPrimaryKeySelective(PaperQue record);

    int updateByPrimaryKey(PaperQue record);
}