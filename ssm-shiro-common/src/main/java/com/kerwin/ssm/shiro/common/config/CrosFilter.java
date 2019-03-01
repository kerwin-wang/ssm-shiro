package com.kerwin.ssm.shiro.common.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: CrosFilter
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-06 11:31
 */
@Component
public class CrosFilter implements Filter
{
    static Logger LOGGER = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String origin = request.getHeader("Origin");
        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        LOGGER.info("使用filter处理跨域问题");
        String method = request.getMethod();
        if (method.equalsIgnoreCase("OPTIONS"))
        {
            servletResponse.getOutputStream().write("Success".getBytes("utf-8"));
        }
        else
        {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy()
    {

    }
}