package com.funtl.spring.boot.alipay.service.impl;

import com.funtl.spring.boot.alipay.domain.BaseDomain;
import com.funtl.spring.boot.alipay.service.BaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.MyMapper;

import java.util.List;


@Transactional(readOnly = true)
public class BaseServiceImpl<T extends BaseDomain,D extends MyMapper<T>> implements BaseService<T> {


    @Autowired
    private D dao;

    @Override
    @Transactional(readOnly = false)
    public int insert(T t) {

        return dao.insert(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int delete(T t) {

        return dao.delete(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int update(T t) {
        return dao.updateByPrimaryKey(t);
    }

    @Override
    public int count(T t) {
        return dao.selectCount(t);
    }

    @Override
    public T selectOne(T t) {
        return dao.selectOne(t);
    }

    @Override
    public PageInfo<T> page(int pageNum, int pageSize,T t) {
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<T> pageInfo=new PageInfo<>(dao.select(t));
        return pageInfo;
    }

    @Override
    public List<T> selectAll() {
        return dao.selectAll();
    }

}
