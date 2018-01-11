package com.helpserver.service.impl;

import com.helpserver.dao.UserDao;
import com.helpserver.pojo.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.helpserver.pojo.User;
import com.helpserver.service.UserService;

import java.util.List;

/**
 * Created by wunaifu on 2018/1/11.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUserList() {
        UserQuery userQuery = new UserQuery();
        userQuery.setPageSize(1);
        return userDao.selectByExample(userQuery);
    }
}
