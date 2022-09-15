package com.xiaoliu.service.employeelservice;

import com.xiaoliu.pojo.Employee;

import java.util.List;

/**
 * @author:小刘
 * @date:2022/7/18-07-22:12
 * @Description: boot-test-01
 * @version:
 */
public interface EmployeelService {

    /*增加一个员工*/
    int save(Employee employee);

    List<Employee> getAll();

    //通过id查询员工
    Employee getEmployeeBYId( Integer id);

   //删除员工
   Employee delete(Integer id);


}
