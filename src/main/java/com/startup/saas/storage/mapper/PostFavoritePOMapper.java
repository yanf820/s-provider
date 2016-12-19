package com.startup.saas.storage.mapper;

import com.startup.saas.storage.model.PostFavoritePO;
import com.startup.saas.storage.model.PostFavoritePOExample;
import com.startup.saas.storage.model.PostFavoritePOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostFavoritePOMapper {
    int countByExample(PostFavoritePOExample example);

    int deleteByExample(PostFavoritePOExample example);

    int deleteByPrimaryKey(PostFavoritePOKey key);

    int insert(PostFavoritePO record);

    int insertSelective(PostFavoritePO record);

    List<PostFavoritePO> selectByExample(PostFavoritePOExample example);

    PostFavoritePO selectByPrimaryKey(PostFavoritePOKey key);

    int updateByExampleSelective(@Param("record") PostFavoritePO record, @Param("example") PostFavoritePOExample example);

    int updateByExample(@Param("record") PostFavoritePO record, @Param("example") PostFavoritePOExample example);

    int updateByPrimaryKeySelective(PostFavoritePO record);

    int updateByPrimaryKey(PostFavoritePO record);
}