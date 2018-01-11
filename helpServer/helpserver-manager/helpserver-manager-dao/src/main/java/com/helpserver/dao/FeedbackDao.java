package com.helpserver.dao;

import com.helpserver.pojo.Feedback;
import com.helpserver.pojo.FeedbackQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackDao {
    int countByExample(FeedbackQuery example);

    int deleteByExample(FeedbackQuery example);

    int deleteByPrimaryKey(Integer feedbackid);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    List<Feedback> selectByExampleWithBLOBs(FeedbackQuery example);

    List<Feedback> selectByExample(FeedbackQuery example);

    Feedback selectByPrimaryKey(Integer feedbackid);

    int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackQuery example);

    int updateByExampleWithBLOBs(@Param("record") Feedback record, @Param("example") FeedbackQuery example);

    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackQuery example);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKeyWithBLOBs(Feedback record);

    int updateByPrimaryKey(Feedback record);
}