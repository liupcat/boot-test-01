package com.xiaoliu.mapper;

import com.xiaoliu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:小刘
 * @date:2022/7/18-07-19:43
 * @Description: boot-test-01
 * @version:   mybatis与springboot的整合用 @Mapper 注解
 */
//这个注解表示了这是一个mybatis的mapper类;
@Mapper
@Repository  //交给springboot整合
public interface UserMapper {
    List<User> queryUserList();

    User queryUserById(int id);

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

}
