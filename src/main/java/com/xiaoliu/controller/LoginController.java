package com.xiaoliu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @author:小刘
 * @date:2022/7/15-07-16:38
 * @Description: boot-test-01
 * @version: @RequestParam("username")表示请求接收的参数
 *         @ResponseBody  这个注解是把 返回的内容转换为 字符串对象 在转发或者返回页面时必须去掉
 *
 *         @RestController 是 @Controller 与@ResponseBody 的集合注解  故在转发或返回页面时不能使用
 */
@Slf4j
@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String userLogin(@RequestParam("username")  String username ,
                            @RequestParam("password")  String password ,
                            Model model , HttpSession session){
        log.info("登录请求被执行!!!");
        //下面就是具体业务:
            if(!StringUtils.isEmpty(username) &&"123456".equals(password)){
                //登录成功放进去一个用户session
                session.setAttribute("loginUser",username);
                return  "redirect:/main.html";
            }else {//告诉用户登录失败
                model.addAttribute("msg","用户名或者密码错误");
                return "index";
            }
    }

    /**注销,退出 销毁session对象*/
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return  "redirect:/";
    }


}
