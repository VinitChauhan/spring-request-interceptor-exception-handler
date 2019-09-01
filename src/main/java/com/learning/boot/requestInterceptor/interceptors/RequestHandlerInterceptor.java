package com.learning.boot.requestInterceptor.interceptors;

import com.learning.boot.requestInterceptor.exception.InvalidHeaderFieldException;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (StringUtils.isEmpty(request.getHeader("auth-key"))){
            throw new InvalidHeaderFieldException("Invalid Request");
        }
        return super.preHandle(request, response, handler);
    }
}
