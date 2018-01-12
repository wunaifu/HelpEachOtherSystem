package com.helpserver.dao;

import com.helpserver.pojo.Identity;
import com.helpserver.pojo.IdentityExample;
import com.helpserver.pojo.IdentityWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdentityDao {
    int countByExample(IdentityExample example);

    int deleteByExample(IdentityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IdentityWithBLOBs record);

    int insertSelective(IdentityWithBLOBs record);

    List<IdentityWithBLOBs> selectByExampleWithBLOBs(IdentityExample example);

    List<Identity> selectByExample(IdentityExample example);

    IdentityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IdentityWithBLOBs record, @Param("example") IdentityExample example);

    int updateByExampleWithBLOBs(@Param("record") IdentityWithBLOBs record, @Param("example") IdentityExample example);

    int updateByExample(@Param("record") Identity record, @Param("example") IdentityExample example);

    int updateByPrimaryKeySelective(IdentityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(IdentityWithBLOBs record);

    int updateByPrimaryKey(Identity record);
}