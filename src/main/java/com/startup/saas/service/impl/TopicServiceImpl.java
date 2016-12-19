package com.startup.saas.service.impl;

import com.startup.saas.api.model.Follow;
import com.startup.saas.common.ServiceResult;
import com.startup.saas.service.TopicService;
import com.startup.saas.storage.mapper.TopicPOMapper;
import com.startup.saas.storage.model.PostPO;
import com.startup.saas.storage.model.TopicPO;
import com.startup.saas.storage.model.TopicPOExample;
import com.startup.saas.storage.model.UserPO;
import com.startup.saas.storage.query.MybatisModelExample;
import com.startup.saas.storage.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/12.
 */
@Service
public class TopicServiceImpl implements TopicService {


//    @Autowired
    TopicPOMapper topicMapper;


    public List<TopicPO> findAll() {
        List<TopicPO> topics = topicMapper.selectByExample(null);
        System.out.println(topics);
        return topics;
    }

    public TopicPO findById(int id) {
        return topicMapper.selectByPrimaryKey(id);
    }

    public List<TopicPO> find(Query query) {
        try {
            return topicMapper.selectByExample(MybatisModelExample.with(query).create(TopicPOExample.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ServiceResult createTopic(TopicPO topic) {
        return topicMapper.insert(topic) != 0 ? ServiceResult.withSuccess("创建话题成功"): ServiceResult.withFailed("创建话题失败");
    }

    @Override
    public ServiceResult updateTopic(TopicPO topicPo) {
        return null;
    }

    @Override
    public ServiceResult deleteTopic(Long topicId) {
        return null;
    }

    @Override
    public TopicPO findTopicById(Long topicId) {
        return null;
    }

    @Override
    public List<TopicPO> findTopicsByKeyword(String Keyword) {
        return null;
    }

    @Override
    public UserPO findPublisherByTopicId(Long topicId) {
        return null;
    }

    @Override
    public List<UserPO> findFansByTopicId(Long topicId) {
        return null;
    }

    @Override
    public List<UserPO> findPostsByTopicId(Long topicId) {
        return null;
    }

    @Override
    public ServiceResult addPostForTopicId(Long topicId, PostPO post) {
        return null;
    }

    @Override
    public ServiceResult addFollowForTopicId(Long topicId, Follow follow) {
        return null;
    }


}
