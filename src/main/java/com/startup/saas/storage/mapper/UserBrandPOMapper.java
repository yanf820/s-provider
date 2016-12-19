package com.startup.saas.storage.mapper;

import com.startup.saas.storage.model.UserBrandPO;
import com.startup.saas.storage.model.UserBrandPOExample;
import com.startup.saas.storage.model.UserBrandPOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBrandPOMapper {
    int countByExample(UserBrandPOExample example);

    int deleteByExample(UserBrandPOExample example);

    int deleteByPrimaryKey(UserBrandPOKey key);

    int insert(UserBrandPO record);

    int insertSelective(UserBrandPO record);

    List<UserBrandPO> selectByExample(UserBrandPOExample example);

    UserBrandPO selectByPrimaryKey(UserBrandPOKey key);

    int updateByExampleSelective(@Param("record") UserBrandPO record, @Param("example") UserBrandPOExample example);

    int updateByExample(@Param("record") UserBrandPO record, @Param("example") UserBrandPOExample example);

    int updateByPrimaryKeySelective(UserBrandPO record);

    int updateByPrimaryKey(UserBrandPO record);
}