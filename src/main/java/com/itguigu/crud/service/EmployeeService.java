package com.itguigu.crud.service;

import com.itguigu.crud.bean.Employee;
import com.itguigu.crud.bean.EmployeeExample;
import com.itguigu.crud.bean.EmployeeExample.Criteria;
import com.itguigu.crud.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author majunbo
 * @date 2020-11-19
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;


    public List<Employee> getAll() {
        return employeeMapper.selectByExampleWithDept(null);
    }

    public void saveEmp(Employee employee) {
        employeeMapper.insertSelective(employee);
    }

    public boolean checkUser(String empName) {
        EmployeeExample example = new EmployeeExample();
        Criteria criteria =  example.createCriteria();
        criteria.andEmpNameEqualTo(empName);
       long count = employeeMapper.countByExample(example);
       return count == 0;
    }



    public Employee getEmp( Integer id) {
       Employee employee = employeeMapper.selectByPrimaryKey(id);
       return employee;
    }

    public void updateEmp(Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }

    public void deleteEmp(Integer id) {
        employeeMapper.deleteByPrimaryKey(id);
    }
}
