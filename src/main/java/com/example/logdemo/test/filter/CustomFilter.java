package com.example.logdemo.test.filter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@WebFilter(filterName = "customFilter", urlPatterns = "/*")
public class CustomFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(CustomFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 添加过滤器响应报文中的跨域支持
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        String origin = httpRequest.getHeader("Origin");
        logger.info("origin:{}", origin);
        httpResponse.setHeader("Access-Control-Allow-Origin", origin);
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.setHeader("Access-Control-Allow-Methods","GET,POST,PUT,PATCH,OPTIONS");
        httpResponse.setHeader("Access-Control-Allow-Headers",
                "Content-Type,Content-Length, Authorization, Accept,X-Requested-With, Access-Control");
        httpResponse.setHeader("Allow","POST,GET,OPTIONS");
        if (httpRequest.getMethod().equalsIgnoreCase("options")) {
            return;
        }
        filterChain.doFilter(httpRequest, httpResponse);
        logger.info("链接1111");
//        try {
//
//        } catch (Exception e){
//            logger.warn(e.getMessage() + " 可能原因：客户端已关闭连接。");
//        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
