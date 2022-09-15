package com.xiaoliu.mapper;

import com.xiaoliu.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:小刘
 * @date:2022/7/13-07-22:25
 * @Description: boottest
 * @version:
 */
@Mapper
@Repository  //交给springboot整合
public interface EmployeeMapper {
    //模拟数据库操作
    //员工有所属得部门
   /* @Autowired
   DepartmentDao departmentDao;
     static Map<Integer, Employee> employees =null;
    static {
        *//**创建一个部门表*//*
        employees =new HashMap<Integer, Employee>();
        employees.put(1001,new Employee(1001,"AA","A1377979387@qq.com",1,new Department(101,"教学部")));
        employees.put(1002,new Employee(1002,"BB","B1377979387@qq.com",0,new Department(102,"市场部")));
        employees.put(1003,new Employee(1003,"CC","C1377979387@qq.com",1,new Department(103,"教研部")));
        employees.put(1004,new Employee(1004,"DD","D1377979387@qq.com",0,new Department(104,"运营部")));
        employees.put(1005,new Employee(1005,"EE","E1377979387@qq.com",1,new Department(105,"后勤部")));
    }*/

    //增加一个员工!!!
    /*private  static  Integer ininid=1006;*/
    //增加一个员工
    public int save(Employee employee);/*{
        if (employee.getId()==null){
            employee.setId(ininid++);
        }
        employee.setDep artment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }*/

    //查询全部员工信息
    public List<Employee> getAll();/*{

        return employees.values();
    }*/

    //通过id查询员工
    public Employee getEmployeeBYId( Integer id);/*{
        return employees.get(id);
    }*/

    //删除员工 通过id
    public Employee delete(Integer id);/*{
        return employees.remove(id);
    }*/



}

