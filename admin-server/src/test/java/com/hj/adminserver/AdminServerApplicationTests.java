package com.hj.adminserver;

import com.hj.adminserver.config.wxconfig;
import com.hj.adminserver.service.Userservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

@SpringBootTest(classes = AdminServerApplication.class)
class AdminServerApplicationTests {

    @Autowired
    Userservice userservice;

    @Test
    void contextLoads() {
        userservice.findAll();
    }


    @Autowired
    wxconfig wxconfi;

    @Test
    void contextLoads1() {

        System.out.printf(wxconfi.getName());


    }

}
