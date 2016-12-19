package com.startup.saas.storage.mapper;

import com.startup.saas.storage.model.UserFollowerPO;
import com.startup.saas.storage.model.UserFollowerPOExample;
import com.startup.saas.storage.model.UserFollowerPOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFollowerPOMapper {
    int countByExample(UserFollowerPOExample example);

    int deleteByExample(UserFollowerPOExample example);

    int deleteByPrimaryKey(UserFollowerPOKey key);

    int insert(UserFollowerPO record);

    int insertSelective(UserFollowerPO record);

    List<UserFollowerPO> selectByExample(UserFollowerPOExample example);

    UserFollowerPO selectByPrimaryKey(UserFollowerPOKey key);

    int updateByExampleSelective(@Param("record") UserFollowerPO record, @Param("example") UserFollowerPOExample example);

    int updateByExample(@Param("record") UserFollowerPO record, @Param("example") UserFollowerPOExample example);

    int updateByPrimaryKeySelective(UserFollowerPO record);

    int updateByPrimaryKey(UserFollowerPO record);
}