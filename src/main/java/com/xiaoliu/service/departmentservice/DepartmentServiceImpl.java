package com.xiaoliu.service.departmentservice;

import com.xiaoliu.mapper.DepartmentMapper;
import com.xiaoliu.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:小刘
 * @date:2022/7/18-07-22:26
 * @Description: boot-test-01
 * @version:
 */
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> getDepartmentsList() {
        return departmentMapper.getDepartmentsList();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentMapper.getDepartmentById(id);
    }
}
