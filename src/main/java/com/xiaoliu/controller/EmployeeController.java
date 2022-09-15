package com.xiaoliu.controller;


import com.xiaoliu.pojo.Department;
import com.xiaoliu.pojo.Employee;
import com.xiaoliu.service.departmentservice.DepartmentService;
import com.xiaoliu.service.employeelservice.EmployeelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author:小刘
 * @date:2022/7/16-07-16:36
 * @Description: boot-test-01
 * @version:
 *
 */
@Slf4j
@Controller
public class EmployeeController  {

    @Autowired
    EmployeelService employeelService;

    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeelService.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
    @GetMapping("/emp")
    public String toAddPage( Model model){
            //查出所有部门信息
        Collection<Department> departments = departmentService.getDepartmentsList();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee ){
        employeelService.save(employee);//调用底层业务方法保存员工信息
        log.info("增加员工方法被执行");
        System.out.println(employee);

        return "redirect:/emps";
    }


    //去到员工的修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id ,Model model){
        //查出原来的数据
        Employee employeeBYId = employeelService.getEmployeeBYId(id);
        model.addAttribute("emp",employeeBYId);
        //查出所有部门信息
        Collection<Department> departments = departmentService.getDepartmentsList();
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee ){
        employeelService.save(employee);
        return "redirect:/emps";
    }
        //删除员工
    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id ){
        employeelService.delete(id);
        return "redirect:/emps";
    }

}
