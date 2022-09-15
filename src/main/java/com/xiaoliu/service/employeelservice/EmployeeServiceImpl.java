package com.xiaoliu.service.employeelservice;

import com.xiaoliu.mapper.EmployeeMapper;
import com.xiaoliu.pojo.Employee;
import com.xiaoliu.service.employeelservice.EmployeelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:小刘
 * @date:2022/7/16-07-16:38
 * @Description: boot-test-01
 * @version:
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeelService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int save(Employee employee) {
        return employeeMapper.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public Employee getEmployeeBYId(Integer id) {
        return employeeMapper.getEmployeeBYId(id);
    }

    @Override
    public Employee delete(Integer id) {
        return employeeMapper.delete(id);
    }
}
