package xin.qhongchen.meeting.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.qhongchen.meeting.entity.Meeting;
import xin.qhongchen.meeting.service.MeetingService;
import xin.qhongchen.meeting.util.ResultUtil;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("MeetingController")
public class MeetingController {

    @Autowired
    private MeetingService meetingService;


    @RequestMapping("list")
    public String list(){

        Map map= meetingService.list();

        return JSON.toJSONString(map);
    }

}
