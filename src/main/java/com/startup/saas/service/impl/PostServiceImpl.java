package com.startup.saas.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.startup.saas.api.model.Like;
import com.startup.saas.api.model.Review;
import com.startup.saas.common.ServiceResult;
import com.startup.saas.service.PostService;
import com.startup.saas.storage.mapper.PostPOMapper;
import com.startup.saas.storage.model.PostPO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */
@Service
public class PostServiceImpl implements PostService{

//    @Autowired
    PostPOMapper postMapper;


    @Override
    public ServiceResult updatePost(PostPO postPo) {
        return null;
    }

    @Override
    public ServiceResult deletePost(Long postId) {
        return null;
    }

    @Override
    public PostPO findPostById(Long postId) {
        return null;
    }

    @Override
    public List<PostPO> findPostsByTopicIdAndKeyword(Long topicId, String keyword) {
        return null;
    }

    @Override
    public List<PostPO> addLikeForPost(Long postId, Like like) {
        return null;
    }

    @Override
    public List<PostPO> addReviewForPost(Long postId, Review review) {
        return null;
    }

    @Override
    public ServiceResult deleteReviewForPost(Long postId, Long reviewId) {
        return null;
    }
}
