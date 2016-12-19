package com.startup.saas.service;

import com.startup.saas.api.model.Follow;
import com.startup.saas.common.ServiceResult;
import com.startup.saas.storage.model.PostPO;
import com.startup.saas.storage.model.TopicPO;
import com.startup.saas.storage.model.UserPO;
import com.startup.saas.storage.query.Query;

import java.util.List;

/**
 * Created by Administrator on 2016/12/12.
 */
public interface TopicService {

    /**
     * 添加Topic
     */
    ServiceResult createTopic(TopicPO topicPo);

    /**
     * 修改Topic
     */
    ServiceResult updateTopic(TopicPO topicPo);

    /**
     * 删除Topic
     */
    ServiceResult deleteTopic(Long topicId);

    /**
     * 根据topicId查询Topic
     */
    TopicPO findTopicById(Long topicId);

    /**
     * 根据Keyword查询Topic
     */
    List<TopicPO> findTopicsByKeyword(String Keyword);

    /**
     * 根据topicID查询publisher
     */
    UserPO findPublisherByTopicId(Long topicId);

    /**
     * 根据topicID查询Fans
     */
    List<UserPO> findFansByTopicId(Long topicId);

    /**
     * 根据topicID查询Posts
     */
    List<UserPO> findPostsByTopicId(Long topicId);

    /**
     * 为当前话题添加帖子
     */
    ServiceResult addPostForTopicId(Long topicId, PostPO post);

    /**
     * 为当前话题添加关注
     */
    ServiceResult addFollowForTopicId(Long topicId, Follow follow);
}
