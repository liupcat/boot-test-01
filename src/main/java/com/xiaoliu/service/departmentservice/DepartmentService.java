package com.xiaoliu.service.departmentservice;

import com.xiaoliu.pojo.Department;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:小刘
 * @date:2022/7/18-07-22:25
 * @Description: boot-test-01
 * @version:
 */
@Service("DepartmentService")
public interface DepartmentService {
    //获得所有部门信息
    public List<Department> getDepartmentsList();


    //通过id得到部门
    public Department getDepartmentById(Integer id);
}
