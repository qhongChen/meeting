package xin.qhongchen.meeting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.qhongchen.meeting.entity.Department;
import xin.qhongchen.meeting.mapper.DepartmentMapper;
import xin.qhongchen.meeting.service.DepartmentService;
import xin.qhongchen.meeting.util.JsonUtil;
import xin.qhongchen.meeting.util.ResultUtil;

import java.util.Date;
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

    @Override
    public Map saveDepartment(String param) {

        String name = JsonUtil.getAttrValueByName(param, "name");
        String pdept = JsonUtil.getAttrValueByName(param, "pdept");
        Map pdeptInfo = departmentMapper.getPdeptInfo(pdept + "%");

        Department dept = new Department();
        String countEquativeDept = pdeptInfo.get("count").toString();
        switch (countEquativeDept.length()) {
            case 1:
                dept.setDepartrmentCode(pdept + "00" + countEquativeDept);
                break;
            case 2:
                dept.setDepartrmentCode(pdept + "0" + countEquativeDept);
                break;
            case 3:
                dept.setDepartrmentCode(pdept + countEquativeDept);
                break;
        }
        dept.setPid(pdeptInfo.get("departrment_id").toString());
        dept.setDepartrmentName(name);
        dept.setCreateTime(new Date());

        departmentMapper.save(dept);
        return ResultUtil.success("新增成功").toMap();
    }

    @Override
    public Map deleteDepartment(String id) {

        Department departmentTemp = departmentMapper.get(id);
        if (departmentTemp != null) {

            departmentMapper.delete(id);

            return ResultUtil.success("删除成功").toMap();
        }

        return ResultUtil.error("删除失败").toMap();
    }
}
