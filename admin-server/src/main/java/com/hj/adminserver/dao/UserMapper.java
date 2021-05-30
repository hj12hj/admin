package com.hj.adminserver.dao;

import com.hj.adminserver.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from USER")
    List<User> findAll();

}
