package com.funtl.spring.boot.alipay.service.impl;

import com.funtl.spring.boot.alipay.domain.Flow;
import com.funtl.spring.boot.alipay.domain.Orders;
import com.funtl.spring.boot.alipay.mapper.OrdersMapper;
import com.funtl.spring.boot.alipay.service.FlowService;
import com.funtl.spring.boot.alipay.service.OrdersService;
import com.funtl.spring.boot.alipay.utils.OrderStatusEnum;
import com.funtl.spring.boot.alipay.utils.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service

public class OrdersServiceImpl extends BaseServiceImpl<Orders,OrdersMapper> implements OrdersService<Orders> {

    @Autowired
    private FlowService flowService;
    @Autowired
    private Sid sid;

    @Transactional
    @Override
    public void saveOrder(Orders order) {

        insert(order);
    }

    @Transactional(readOnly = true)
    @Override
    public Orders getOrderById(String orderId) {

        Orders orders=new Orders();
        orders.setId(orderId);
        Orders orders1 = selectOne(orders);
        return orders1;
    }
    @Transactional
    @Override
    public void updateOrderStatus(String out_trade_no, String trade_no, String total_amount) {

        Orders order = getOrderById(out_trade_no);

        if (order.getOrderStatus().equals(OrderStatusEnum.WAIT_PAY.key)) {
            order = new Orders();
            order.setId(out_trade_no);
            order.setOrderStatus(OrderStatusEnum.PAID.key);
            order.setPaidTime(new Date());
            order.setPaidAmount(total_amount);

            update(order);

            order = getOrderById(out_trade_no);

            String flowId = sid.nextShort();
            Flow flow = new Flow();
            flow.setId(flowId);
            flow.setFlowNum(trade_no);
            flow.setBuyCounts(order.getBuyCounts());
            flow.setCreateTime(new Date());
            flow.setOrderNum(out_trade_no);
            flow.setPaidAmount(total_amount);
            flow.setPaidMethod(1);
            flow.setProductId(order.getProductId());

            flowService.insert(flow);
        }

    }
}
