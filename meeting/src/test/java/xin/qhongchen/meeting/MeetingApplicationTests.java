package xin.qhongchen.meeting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.qhongchen.meeting.entity.Department;
import xin.qhongchen.meeting.entity.User;
import xin.qhongchen.meeting.mapper.DepartmentMapper;
import xin.qhongchen.meeting.mapper.UserMapper;

import java.text.DecimalFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MeetingApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void contextLoads() {

//		List<User> list = userMapper.getall();
//		System.out.println(list);

//        Department department = new Department();
//        department.setDepartrmentName("销售");
//        department.setDepartrmentCode("001004");
//        department.setCreateTime(new Date());
//        department.setCreateUser("c1016effb0ff11e78650448a5bf0e513");
//
//        departmentMapper.save(department);
        System.out.println(departmentMapper.list());
    }

}
