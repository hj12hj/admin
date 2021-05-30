package com.hj.adminserver.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@Slf4j
//@WebFilter(filterName="secondFilter", urlPatterns="/*")
public class LogFillter extends AbstractRequestLoggingFilter {

    Long CurrentMillins;

    @Override
    protected void beforeRequest(HttpServletRequest httpServletRequest, String s) {
        log.info(httpServletRequest.getMethod());
        CurrentMillins=System.currentTimeMillis();
    }

    @Override
    protected void afterRequest(HttpServletRequest httpServletRequest, String s) {
             log.info("耗时为" +(System.currentTimeMillis()-CurrentMillins));
             httpServletRequest.getRemoteHost();
    }
}
