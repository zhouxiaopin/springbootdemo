package cn.gzticc.springbootdemo.service.impl;

import cn.gzticc.springbootdemo.mapper.UserMapper;
import cn.gzticc.springbootdemo.pojo.User;
import cn.gzticc.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getObjectById(Long userId) {
        return userMapper.getObjectById(userId);
    }

    @Override
    public User getObjById(Long userId) {
        return userMapper.getObjById(userId);
    }
}
