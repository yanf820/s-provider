package com.startup.saas.service.impl;

import com.startup.saas.common.ServiceResult;
import com.startup.saas.service.UserService;
import com.startup.saas.storage.mapper.UserPOMapper;
import com.startup.saas.storage.model.UserPO;
import com.startup.saas.storage.model.UserPOExample;
import com.startup.saas.storage.query.MybatisModelExample;
import com.startup.saas.storage.query.Query;
import com.startup.saas.utils.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
    UserPOMapper userMapper;

    @Override
    public ServiceResult login(UserPO user) {
        UserPOExample example = new UserPOExample();
        String pwd = EncryptUtil.encodeMD5(user.getPassword());
        pwd = EncryptUtil.encodeSHA(pwd);
        example.createCriteria().andPhoneEqualTo(user.getPhone()).andPasswordEqualTo(pwd);
        List<UserPO> users = userMapper.selectByExample(example);
        return users != null && users.size() == 1 ? ServiceResult.withSuccess("获取用户成功",users.get(0)) : ServiceResult.withFailed("登录失败");
    }

    @Override
    public ServiceResult registerUser(UserPO user) {
        int insert = userMapper.insert(user);
        return insert != 0 ? ServiceResult.withSuccess("添加用户成功") : ServiceResult.withFailed("添加用户失败");
    }

    @Override
    public List<UserPO> findAll() {
        List<UserPO> users = userMapper.selectByExample(null);
        return users;
    }


    @Override
    public List<UserPO> find(Query query) {
        try {
            return userMapper.selectByExample(MybatisModelExample.with(query).create(UserPOExample.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ServiceResult deleteUser(Query query) {
        int i = 0;
        try {
            i = userMapper.deleteByExample(MybatisModelExample.with(query).create(UserPOExample.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i != 0 ? ServiceResult.withSuccess("删除用户成功") : ServiceResult.withFailed("删除用户失败");
    }

    @Override
    public ServiceResult updateUser(UserPO record,Query query) {
        int i = 0;
        try {
            i = userMapper.updateByExample(record, MybatisModelExample.with(query).create(UserPOExample.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i!=0?ServiceResult.withSuccess("更新用户成功"):ServiceResult.withFailed("更新用户失败");
    }


}
