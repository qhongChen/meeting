package xin.qhongchen.meeting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.qhongchen.meeting.entity.User;
import xin.qhongchen.meeting.mapper.UserMapper;
import xin.qhongchen.meeting.service.UserService;
import xin.qhongchen.meeting.util.ResultUtil;

import java.util.List;
import java.util.Map;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public Map login(User user) {

        List<User> list = userMapper.queryUserList(user);

        return ResultUtil.success("查询成功").setData(list).toMap();
    }
}
