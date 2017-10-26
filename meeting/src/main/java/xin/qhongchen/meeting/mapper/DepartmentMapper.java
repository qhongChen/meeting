package xin.qhongchen.meeting.mapper;

import xin.qhongchen.meeting.entity.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentMapper {

    void save(Department department);
    List<Department> list();
    Map getPdeptInfo(String pcode);
    void delete(String id);
    Department get(String id);
}