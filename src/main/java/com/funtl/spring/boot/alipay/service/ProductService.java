package com.funtl.spring.boot.alipay.service;

import com.funtl.spring.boot.alipay.domain.BaseDomain;
import com.funtl.spring.boot.alipay.domain.Product;

import java.util.List;

public interface ProductService<T extends BaseDomain> extends BaseService<T> {

    List<Product> getProducts();

    Product getProductById(String productId);
}
