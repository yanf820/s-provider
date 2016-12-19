package com.startup.saas.storage.mapper;

import com.startup.saas.storage.model.PostLikesPO;
import com.startup.saas.storage.model.PostLikesPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostLikesPOMapper {
    int countByExample(PostLikesPOExample example);

    int deleteByExample(PostLikesPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostLikesPO record);

    int insertSelective(PostLikesPO record);

    List<PostLikesPO> selectByExample(PostLikesPOExample example);

    PostLikesPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostLikesPO record, @Param("example") PostLikesPOExample example);

    int updateByExample(@Param("record") PostLikesPO record, @Param("example") PostLikesPOExample example);

    int updateByPrimaryKeySelective(PostLikesPO record);

    int updateByPrimaryKey(PostLikesPO record);
}