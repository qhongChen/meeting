package xin.qhongchen.meeting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.qhongchen.meeting.entity.Department;
import xin.qhongchen.meeting.mapper.DepartmentMapper;
import xin.qhongchen.meeting.service.DepartmentService;
import xin.qhongchen.meeting.util.ResultUtil;

import java.util.List;
import java.util.Map;

@Service("DepartmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public Map queryDepartmentList() {

        List<Department> departments = departmentMapper.list();

        return ResultUtil.success("查询成功").setData(departments).toMap();
    }
}
