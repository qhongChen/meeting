package xin.qhongchen.meeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.qhongchen.meeting.entity.Message;
import xin.qhongchen.meeting.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("MessageController")
public class MessageController {

    @Autowired
    private MessageService messageService;


    @RequestMapping("getMsg")
    public void list(String id){

        List<Message> list = messageService.list();

        System.out.println(list);
    }
}
