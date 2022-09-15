package com.xiaoliu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author:小刘
 * @date:2022/7/18-07-19:40
 * @Description: boot-test-01
 * @version:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int id;
    private String username;
    private String password;
}
