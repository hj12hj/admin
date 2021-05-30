package com.hj.adminserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.hj.adminserver.intercepter.my;

@Configuration
public class webconfig implements WebMvcConfigurer {



    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(getMy()).addPathPatterns("/user/*");

        WebMvcConfigurer.super.addInterceptors(registry);
    }



    @Bean
    public my getMy()
    {
        return new my();
    }
}
