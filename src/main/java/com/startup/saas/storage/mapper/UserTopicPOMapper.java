package com.startup.saas.storage.mapper;

import com.startup.saas.storage.model.UserTopicPO;
import com.startup.saas.storage.model.UserTopicPOExample;
import com.startup.saas.storage.model.UserTopicPOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTopicPOMapper {
    int countByExample(UserTopicPOExample example);

    int deleteByExample(UserTopicPOExample example);

    int deleteByPrimaryKey(UserTopicPOKey key);

    int insert(UserTopicPO record);

    int insertSelective(UserTopicPO record);

    List<UserTopicPO> selectByExample(UserTopicPOExample example);

    UserTopicPO selectByPrimaryKey(UserTopicPOKey key);

    int updateByExampleSelective(@Param("record") UserTopicPO record, @Param("example") UserTopicPOExample example);

    int updateByExample(@Param("record") UserTopicPO record, @Param("example") UserTopicPOExample example);

    int updateByPrimaryKeySelective(UserTopicPO record);

    int updateByPrimaryKey(UserTopicPO record);
}