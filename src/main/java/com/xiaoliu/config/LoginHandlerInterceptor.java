package com.xiaoliu.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author:小刘
 * @date:2022/7/16-07-15:28
 * @Description: boot-test-01
 * @version:  登录拦截器类  preHandle三个方法中的放行前方法
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录成功之后,应该有用户的session;
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser==null){ //没有登录
            request.setAttribute("msg","没有权限,请先登录");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else{
            return true;
        }


    }


}