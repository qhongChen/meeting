package xin.qhongchen.meeting.mapper;

import xin.qhongchen.meeting.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> queryUserList(User user);
}