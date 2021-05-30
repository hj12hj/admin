package com.hj.adminserver.service;

import com.hj.adminserver.pojo.User;

import java.util.List;


public interface Userservice {
    List<User> findAll();
}
