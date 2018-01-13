package com.helpserver.service.impl;

import com.helpserver.dao.UserDao;
import com.helpserver.pojo.UserExample;
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
    public List<User> getUserList(User user) {

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        if (user.getName() != null) {
            criteria.andNameEqualTo(user.getName());
        }
        if (user.getAge()!=null){
            criteria.andAgeEqualTo(user.getAge());
        }
        userExample.setOrderByClause("age desc");
        return userDao.selectByExample(userExample);
    }
}
