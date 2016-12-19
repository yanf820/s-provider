package com.startup.saas.service;

import com.startup.saas.api.model.Like;
import com.startup.saas.api.model.Review;
import com.startup.saas.common.ServiceResult;
import com.startup.saas.storage.model.PostPO;
import com.startup.saas.storage.query.Query;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */
public interface PostService {

    /**
     * 修改Post
     */
    ServiceResult updatePost(PostPO postPo);

    /**
     * 删除Post
     */
    ServiceResult deletePost(Long postId);


    /**
     * 根据postId查询Post
     */
    PostPO findPostById(Long postId);

    /**
     * 根据TopicID和Keyword查询Post
     */
    List<PostPO> findPostsByTopicIdAndKeyword(Long topicId, String keyword);

    /**
     * 为当前贴子添加点赞
     */
    List<PostPO> addLikeForPost(Long postId, Like like);

    /**
     * 为当前贴子添加评论
     */
    List<PostPO> addReviewForPost(Long postId, Review review);


    /**
     * 删除当前贴子的评论
     */
    ServiceResult deleteReviewForPost(Long postId, Long reviewId);

}
