package xin.qhongchen.meeting.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.qhongchen.meeting.service.DepartmentService;
import xin.qhongchen.meeting.util.JsonUtil;

import java.util.Map;

@RestController
@RequestMapping("DepartmentController")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("list")
    public String list() {

        Map result = departmentService.queryDepartmentList();

        return JsonUtil.toJSONString(result);
    }

    @RequestMapping("save")
    public String save(String param) {

        Map result = departmentService.saveDepartment(param);
        return JsonUtil.toJSONString(result);
    }

    @RequestMapping("delete")
    public String delete(String param) {

        String id = JsonUtil.getAttrValueByName(param, "id");

        Map result = departmentService.deleteDepartment(id);

        return JsonUtil.toJSONString(result);
    }
}
