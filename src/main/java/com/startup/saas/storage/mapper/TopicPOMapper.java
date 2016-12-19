package com.startup.saas.storage.mapper;

import com.startup.saas.storage.model.TopicPO;
import com.startup.saas.storage.model.TopicPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicPOMapper {
    int countByExample(TopicPOExample example);

    int deleteByExample(TopicPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TopicPO record);

    int insertSelective(TopicPO record);

    List<TopicPO> selectByExample(TopicPOExample example);

    TopicPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TopicPO record, @Param("example") TopicPOExample example);

    int updateByExample(@Param("record") TopicPO record, @Param("example") TopicPOExample example);

    int updateByPrimaryKeySelective(TopicPO record);

    int updateByPrimaryKey(TopicPO record);
}