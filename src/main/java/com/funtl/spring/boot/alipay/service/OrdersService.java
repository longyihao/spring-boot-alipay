package com.funtl.spring.boot.alipay.service;

import com.funtl.spring.boot.alipay.domain.BaseDomain;
import com.funtl.spring.boot.alipay.domain.Orders;

public interface OrdersService<T extends BaseDomain> extends BaseService<T> {
    void saveOrder(Orders order);

    Orders getOrderById(String orderId);

    void updateOrderStatus(String out_trade_no, String trade_no, String total_amount);
}
