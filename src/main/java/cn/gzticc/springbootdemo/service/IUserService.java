package cn.gzticc.springbootdemo.service;

import cn.gzticc.springbootdemo.pojo.User;

public interface IUserService {
    User getObjectById(Long userId);
    User getObjById(Long userId);
}
