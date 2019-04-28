package com.funtl.spring.boot.alipay.service.impl;

import com.funtl.spring.boot.alipay.domain.User;
import com.funtl.spring.boot.alipay.mapper.UserMapper;
import com.funtl.spring.boot.alipay.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User,UserMapper> implements UserService<User> {
    @Override
    public List<User> getUserList() {
        return null;
    }
}
