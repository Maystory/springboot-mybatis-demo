package com.mf.mybatisdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mf.mybatisdemo.bean.Employee;
import com.mf.mybatisdemo.bean.UserInfo;
import com.mf.mybatisdemo.mapper.EmployeeMapper;
import com.mf.mybatisdemo.mapper.UserInfoMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.Random;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebRunTests {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private EmployeeMapper employeeMapper;
    private EmployeeMapper employeeMapper1;


    @Test
    // @Ignore
    public void contextLoads() {
        // QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<UserInfo>()
        //         .gt("id", 900)
        //         .like("user_mark", "mark");
        // List<UserInfo> userInfos = userInfoMapper.selectList(queryWrapper);
        // System.out.println(userInfos);

        QueryWrapper<UserInfo> wrapper = new QueryWrapper<UserInfo>()
                .gt("id", 950)
                .lt("id", 1000);

        int deleteCount = userInfoMapper.delete(wrapper);
        System.out.println("删除了【" + deleteCount + "】条数据");


    }

    @Test
    @Ignore
    public void testEmp() {
        Employee employee = new Employee();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            employee.setEmail(i+"mf@qq.com");
            employee.setGender(random.nextInt(2));
            employee.setLastName(UUID.randomUUID().toString().substring(0,4));
            employee.setdId(random.nextInt(5));
            employeeMapper.insert(employee);
        }

    }

    public void testPostFix() {

    }


}
