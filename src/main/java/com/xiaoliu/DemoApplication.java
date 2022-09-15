package com.xiaoliu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan("com.xiaoliu.mapper") 表示扫描所有的mapper文件
@SpringBootApplication(scanBasePackages="com.xiaoliu") //扫描地址下的所有包文件
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
