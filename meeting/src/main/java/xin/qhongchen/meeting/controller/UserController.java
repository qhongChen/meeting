package xin.qhongchen.meeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.qhongchen.meeting.entity.User;
import xin.qhongchen.meeting.service.UserService;
import xin.qhongchen.meeting.util.JsonUtil;

import java.util.Map;

@RestController
@RequestMapping("UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(String param) {

        User preLoginUser = JsonUtil.toBean(param, User.class);
        Map result = userService.login(preLoginUser);

        return JsonUtil.toJSONString(result);
    }


}
