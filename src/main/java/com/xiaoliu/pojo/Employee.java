package com.xiaoliu.pojo;

/**
 * @author:小刘
 * @date:2022/7/13-07-22:04
 * @Description: boottest
 * @version:员工表
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**员工表 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    /**表示性别 0代表女  1代表男*/
    private Integer gender;
    private Department department;
    private Date birth;

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        //默认得创建日期!!!
        this.birth = new Date();
    }
}
