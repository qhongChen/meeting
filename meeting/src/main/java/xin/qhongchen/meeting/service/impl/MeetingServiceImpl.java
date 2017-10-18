package xin.qhongchen.meeting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.qhongchen.meeting.entity.Meeting;
import xin.qhongchen.meeting.mapper.MeetingMapper;
import xin.qhongchen.meeting.service.MeetingService;
import xin.qhongchen.meeting.util.ResultUtil;

import java.util.List;
import java.util.Map;

@Service("MeetingServiceImpl")
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingMapper meetingMapper;

    @Override
    public Map list() {

        List<Meeting> list = meetingMapper.list();

        return ResultUtil.success("查询成功").setData(list).toMap();
    }
}
