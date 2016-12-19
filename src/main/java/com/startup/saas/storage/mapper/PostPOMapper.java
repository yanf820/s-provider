package com.startup.saas.storage.mapper;

import com.startup.saas.storage.model.PostPO;
import com.startup.saas.storage.model.PostPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostPOMapper {
    int countByExample(PostPOExample example);

    int deleteByExample(PostPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostPO record);

    int insertSelective(PostPO record);

    List<PostPO> selectByExampleWithBLOBs(PostPOExample example);

    List<PostPO> selectByExample(PostPOExample example);

    PostPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostPO record, @Param("example") PostPOExample example);

    int updateByExampleWithBLOBs(@Param("record") PostPO record, @Param("example") PostPOExample example);

    int updateByExample(@Param("record") PostPO record, @Param("example") PostPOExample example);

    int updateByPrimaryKeySelective(PostPO record);

    int updateByPrimaryKeyWithBLOBs(PostPO record);

    int updateByPrimaryKey(PostPO record);
}