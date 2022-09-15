package com.xiaoliu.mapper;

import com.xiaoliu.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author:小刘
 * @date:2022/7/13-07-22:10
 * @Description: boottest
 * @version:部门Dao
 */
@Mapper
@Repository  //交给springboot整合
public interface DepartmentMapper {
    //模拟数据库中的数据
  /*  private static Map<Integer, Department>  departments =null;
    static {
        *//**创建一个部门表*//*
        departments =new HashMap<Integer, Department>();
        departments.put(101,new Department(101,"教学部"));
        departments.put(102,new Department(102,"市场部"));
        departments.put(103,new Department(103,"教研部"));
        departments.put(104,new Department(104,"运营部"));
        departments.put(105,new Department(105,"后勤部"));
    }*/
    //获得所有部门信息
    public List<Department> getDepartmentsList();/*{

        return departments.values();
    }*/

    //通过id得到部门
    public Department getDepartmentById(Integer id);/*{
        return  departments.get(id);
    }*/
}
