package com.hebeu.graduatefeedback.dao;

import com.hebeu.graduatefeedback.pojo.BankMultipleChoiceQue;
import com.hebeu.graduatefeedback.pojo.BankMultipleChoiceQueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankMultipleChoiceQueMapper {
    long countByExample(BankMultipleChoiceQueExample example);

    int deleteByExample(BankMultipleChoiceQueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankMultipleChoiceQue record);

    int insertSelective(BankMultipleChoiceQue record);

    List<BankMultipleChoiceQue> selectByExample(BankMultipleChoiceQueExample example);

    BankMultipleChoiceQue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankMultipleChoiceQue record, @Param("example") BankMultipleChoiceQueExample example);

    int updateByExample(@Param("record") BankMultipleChoiceQue record, @Param("example") BankMultipleChoiceQueExample example);

    int updateByPrimaryKeySelective(BankMultipleChoiceQue record);

    int updateByPrimaryKey(BankMultipleChoiceQue record);
}