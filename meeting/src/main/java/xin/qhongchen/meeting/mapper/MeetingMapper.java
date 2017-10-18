package xin.qhongchen.meeting.mapper;

import org.apache.ibatis.annotations.Mapper;
import xin.qhongchen.meeting.entity.Meeting;

import java.util.List;
import java.util.Map;

public interface MeetingMapper {

    List<Meeting> list();
}