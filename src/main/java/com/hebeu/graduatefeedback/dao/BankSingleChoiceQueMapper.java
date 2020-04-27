package com.hebeu.graduatefeedback.dao;

import com.hebeu.graduatefeedback.pojo.BankSingleChoiceQue;
import com.hebeu.graduatefeedback.pojo.BankSingleChoiceQueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankSingleChoiceQueMapper {
    long countByExample(BankSingleChoiceQueExample example);

    int deleteByExample(BankSingleChoiceQueExample example);

    int deleteByPrimaryKey(String id);

    int insert(BankSingleChoiceQue record);

    int insertSelective(BankSingleChoiceQue record);

    List<BankSingleChoiceQue> selectByExample(BankSingleChoiceQueExample example);

    BankSingleChoiceQue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BankSingleChoiceQue record, @Param("example") BankSingleChoiceQueExample example);

    int updateByExample(@Param("record") BankSingleChoiceQue record, @Param("example") BankSingleChoiceQueExample example);

    int updateByPrimaryKeySelective(BankSingleChoiceQue record);

    int updateByPrimaryKey(BankSingleChoiceQue record);
}