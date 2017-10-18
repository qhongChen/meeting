package xin.qhongchen.meeting.controller;


import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.qhongchen.meeting.entity.Department;
import xin.qhongchen.meeting.mapper.DepartmentMapper;
import xin.qhongchen.meeting.service.DepartmentService;
import xin.qhongchen.meeting.util.ResultUtil;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("DepartmentController")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("list")
    public String list(){

        Map result = departmentService.queryDepartmentList();

        return JSON.toJSONString(result);
    }
}
