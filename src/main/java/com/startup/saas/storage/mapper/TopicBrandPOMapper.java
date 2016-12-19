package com.startup.saas.storage.mapper;

import com.startup.saas.storage.model.TopicBrandPO;
import com.startup.saas.storage.model.TopicBrandPOExample;
import com.startup.saas.storage.model.TopicBrandPOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicBrandPOMapper {
    int countByExample(TopicBrandPOExample example);

    int deleteByExample(TopicBrandPOExample example);

    int deleteByPrimaryKey(TopicBrandPOKey key);

    int insert(TopicBrandPO record);

    int insertSelective(TopicBrandPO record);

    List<TopicBrandPO> selectByExample(TopicBrandPOExample example);

    TopicBrandPO selectByPrimaryKey(TopicBrandPOKey key);

    int updateByExampleSelective(@Param("record") TopicBrandPO record, @Param("example") TopicBrandPOExample example);

    int updateByExample(@Param("record") TopicBrandPO record, @Param("example") TopicBrandPOExample example);

    int updateByPrimaryKeySelective(TopicBrandPO record);

    int updateByPrimaryKey(TopicBrandPO record);
}