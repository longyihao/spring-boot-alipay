package com.funtl.spring.boot.alipay.service;

import com.funtl.spring.boot.alipay.domain.BaseDomain;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BaseService<T extends BaseDomain> {


    int insert(T t);

    int delete(T t);

    int update(T t);

    int count(T t);

    T selectOne(T t);

    PageInfo<T> page(int pageNum, int pageSize, T t);

    List<T> selectAll();

}
