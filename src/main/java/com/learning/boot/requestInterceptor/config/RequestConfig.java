package com.learning.boot.requestInterceptor.config;

import com.learning.boot.requestInterceptor.interceptors.RequestHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RequestConfig implements WebMvcConfigurer {

    @Autowired
    private RequestHandlerInterceptor requestHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestHandlerInterceptor);
    }
}
