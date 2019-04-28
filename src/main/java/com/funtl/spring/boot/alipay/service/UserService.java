package com.funtl.spring.boot.alipay.service;

import com.funtl.spring.boot.alipay.domain.BaseDomain;
import com.funtl.spring.boot.alipay.domain.User;

import java.util.List;

public interface UserService<T extends BaseDomain> extends BaseService<T> {
    List<User> getUserList();
}
