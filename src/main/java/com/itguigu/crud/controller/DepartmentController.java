package com.itguigu.crud.controller;

import com.itguigu.crud.bean.Department;
import com.itguigu.crud.bean.Employee;
import com.itguigu.crud.bean.Msg;
import com.itguigu.crud.dao.EmployeeMapper;
import com.itguigu.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author majunbo
 * @date 2020-11-23
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;



    /**
     * 返回所有的部门信息
     */
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        //查出的所有部门信息
        List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts", list);
    }


}
