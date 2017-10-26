package xin.qhongchen.meeting.service;

import java.util.Map;

public interface DepartmentService {

    Map queryDepartmentList();
    Map saveDepartment(String param);
    Map deleteDepartment(String id);
}
