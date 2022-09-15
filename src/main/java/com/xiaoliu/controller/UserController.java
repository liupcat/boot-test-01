package com.xiaoliu.controller;

import com.xiaoliu.mapper.UserMapper;
import com.xiaoliu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:小刘
 * @date:2022/7/18-07-20:19
 * @Description: boot-test-01
 * @version:
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/User")
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

}
