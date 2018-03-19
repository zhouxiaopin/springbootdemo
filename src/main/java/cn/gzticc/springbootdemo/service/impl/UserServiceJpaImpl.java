package cn.gzticc.springbootdemo.service.impl;

import cn.gzticc.springbootdemo.pojo.User;
import cn.gzticc.springbootdemo.repository.UserJapRepository;
import cn.gzticc.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceJpa")
public class UserServiceJpaImpl implements UserService {

    @Autowired
    UserJapRepository userJapRepository;

    @Override
    public List<User> getUserList() {
        return userJapRepository.findAll();
    }

    @Override
    public User findUserByUserId(Long userId) {
        return userJapRepository.findByUserId(userId);
    }

    @Override
    public void save(User user) {
        userJapRepository.save(user);
    }

    @Override
    public void edit(User user) {
        user = findUserByUserId(user.getUserId());
        userJapRepository.saveAndFlush(user);
    }

    @Override
    public void delete(Long userId) {
        userJapRepository.delete(userId);
    }
}
