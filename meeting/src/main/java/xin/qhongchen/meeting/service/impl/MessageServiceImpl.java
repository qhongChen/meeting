package xin.qhongchen.meeting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.qhongchen.meeting.entity.Message;
import xin.qhongchen.meeting.mapper.MessageMapper;
import xin.qhongchen.meeting.service.MessageService;

import java.util.List;

@Service("MessageServiceImpl")
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Message> list() {
        return messageMapper.list();
    }
}
