package com.hebeu.graduatefeedback.dao;

import com.hebeu.graduatefeedback.pojo.PaperView;
import com.hebeu.graduatefeedback.pojo.PaperViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperViewMapper {
    long countByExample(PaperViewExample example);

    int deleteByExample(PaperViewExample example);

    int insert(PaperView record);

    int insertSelective(PaperView record);

    List<PaperView> selectByExample(PaperViewExample example);

    int updateByExampleSelective(@Param("record") PaperView record, @Param("example") PaperViewExample example);

    int updateByExample(@Param("record") PaperView record, @Param("example") PaperViewExample example);
}