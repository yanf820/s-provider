package com.startup.saas.service;

import com.startup.saas.common.ServiceResult;
import com.startup.saas.storage.model.UserPO;
import com.startup.saas.storage.query.Query;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 */
public interface UserService {


    ServiceResult login(UserPO user);


    ServiceResult registerUser(UserPO user);


    List<UserPO> findAll();


    List<UserPO> find(Query query);


    ServiceResult deleteUser(Query query);

    ServiceResult updateUser(UserPO record,Query query);

}

