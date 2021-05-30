package com.hj.adminserver.service.Impl;

import com.hj.adminserver.dao.UserMapper;
import com.hj.adminserver.pojo.User;
import com.hj.adminserver.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userservice")
public class UserserviceImpl implements Userservice {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
