package com.funtl.spring.boot.alipay.service.impl;

import com.funtl.spring.boot.alipay.domain.Product;
import com.funtl.spring.boot.alipay.mapper.ProductMapper;
import com.funtl.spring.boot.alipay.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl extends BaseServiceImpl<Product,ProductMapper> implements ProductService<Product> {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getProducts() {
        return productMapper.selectAllp();
    }

    @Override
    public Product getProductById(String productId) {
        Product product = new Product();
        product.setId(productId);
        Product product1 = selectOne(product);
        return product1;
    }
}
