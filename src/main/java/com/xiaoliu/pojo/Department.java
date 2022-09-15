package com.xiaoliu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author:小刘
 * @date:2022/7/13-07-21:32
 * @Description: boottest
 * @version:
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private  Integer id;
    private  String departmentName;
}
