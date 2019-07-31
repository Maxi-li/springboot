/**
 * FileName: MyInterceptor
 * Author:   Max
 * Description:
 */
package com.qianfeng.springboothello.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("MyInterceptor preHandle.....");
        return true;
    }
}

