package com.hj.adminserver.intercepter;

import com.hj.adminserver.exceptions.NoLoginException;
import com.hj.adminserver.ss;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class my implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        if(handler  instanceof HandlerMethod){
//            boolean annotationPresent = ((HandlerMethod) handler).getMethod().isAnnotationPresent(ss.class);
//          if(annotationPresent)
//              return true;
//        }
//
//        throw new NoLoginException("Nologin...");
        return  true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
