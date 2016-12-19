package com.startup.saas.mapper;

import com.startup.saas.boot.SpringBootStarter;
import com.startup.saas.service.TopicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootStarter.class)
@WebAppConfiguration
public class UserTest {


    @Autowired
    TopicService topicService;

    @Test
    public void test(){
//        List<TopicPO> topics = topicService.();
//        Assert.assertNotNull(topics);
    }
}
