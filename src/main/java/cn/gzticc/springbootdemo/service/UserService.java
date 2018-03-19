package cn.gzticc.springbootdemo.service;

import cn.gzticc.springbootdemo.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    User findUserByUserId(Long userId);

    void save(User user);

    public void edit(User user);

    public void delete(Long userId);
}
