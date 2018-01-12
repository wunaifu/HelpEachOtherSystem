package com.helpserver.dao;

import com.helpserver.pojo.Feedback;
import com.helpserver.pojo.FeedbackExample;
import com.helpserver.pojo.FeedbackWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackDao {
    int countByExample(FeedbackExample example);

    int deleteByExample(FeedbackExample example);

    int deleteByPrimaryKey(Integer feedbackid);

    int insert(FeedbackWithBLOBs record);

    int insertSelective(FeedbackWithBLOBs record);

    List<FeedbackWithBLOBs> selectByExampleWithBLOBs(FeedbackExample example);

    List<Feedback> selectByExample(FeedbackExample example);

    FeedbackWithBLOBs selectByPrimaryKey(Integer feedbackid);

    int updateByExampleSelective(@Param("record") FeedbackWithBLOBs record, @Param("example") FeedbackExample example);

    int updateByExampleWithBLOBs(@Param("record") FeedbackWithBLOBs record, @Param("example") FeedbackExample example);

    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByPrimaryKeySelective(FeedbackWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FeedbackWithBLOBs record);

    int updateByPrimaryKey(Feedback record);
}