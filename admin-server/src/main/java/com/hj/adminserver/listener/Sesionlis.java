package com.hj.adminserver.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
@Slf4j
public class Sesionlis implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
       log.error(">>>>>>>>>>>>>>>>");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.error("<<<<<<<<<<<<<<<");
    }
}
