package com.itguigu.crud.test;

import com.itguigu.crud.bean.Department;
import com.itguigu.crud.bean.DepartmentExample;
import com.itguigu.crud.bean.Employee;
import com.itguigu.crud.dao.DepartmentMapper;
import com.itguigu.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @author majunbo
 * @date 2020-11-19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;
   @Test
    public void testCRUD(){
//       ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//       DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);
//       System.out.println(departmentMapper);

//       departmentMapper.insertSelective(new Department(null,"开发部"));
//       departmentMapper.insertSelective(new Department(null,"测试部"));

//        employeeMapper.insertSelective(new Employee(null,"jerry","M","jerry@itguigu.com",1));

//       EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//       for(int i=0;i<1000;i++){
//          String uid = UUID.randomUUID().toString().substring(0,5)+i;
//           mapper.insertSelective(new Employee(null,uid,"M",uid+"@itguigu.com",1));
//       }
//       System.out.println("complete");
   }

}
