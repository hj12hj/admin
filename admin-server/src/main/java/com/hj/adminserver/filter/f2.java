package com.hj.adminserver.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@Slf4j
//@WebFilter(filterName="secondFilter2", urlPatterns="/*")
public class f2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {



    }
}
