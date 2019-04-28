package com.funtl.spring.boot.alipay.mapper;

import com.funtl.spring.boot.alipay.domain.Product;
import tk.mybatis.MyMapper;

import java.util.List;

public interface ProductMapper extends MyMapper<Product> {

    List<Product> selectAllp();
}