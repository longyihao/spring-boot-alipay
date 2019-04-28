package com.funtl.spring.boot.alipay.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "alipay.orders")
public class Orders extends BaseDomain {
    @Id
    private String id;

    /**
     * 订单号
     */
    @Column(name = "order_num")
    private String orderNum;

    /**
     * 订单状态
            10：待付款
            20：已付款
     */
    @Column(name = "order_status")
    private String orderStatus;

    /**
     * 订单金额
     */
    @Column(name = "order_amount")
    private String orderAmount;

    /**
     * 实际支付金额
     */
    @Column(name = "paid_amount")
    private String paidAmount;

    /**
     * 产品表外键ID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 产品购买的个数
     */
    @Column(name = "buy_counts")
    private Integer buyCounts;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付时间
     */
    @Column(name = "paid_time")
    private Date paidTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取订单号
     *
     * @return order_num - 订单号
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置订单号
     *
     * @param orderNum 订单号
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取订单状态
            10：待付款
            20：已付款
     *
     * @return order_status - 订单状态
            10：待付款
            20：已付款
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
            10：待付款
            20：已付款
     *
     * @param orderStatus 订单状态
            10：待付款
            20：已付款
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单金额
     *
     * @return order_amount - 订单金额
     */
    public String getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置订单金额
     *
     * @param orderAmount 订单金额
     */
    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取实际支付金额
     *
     * @return paid_amount - 实际支付金额
     */
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * 设置实际支付金额
     *
     * @param paidAmount 实际支付金额
     */
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * 获取产品表外键ID
     *
     * @return product_id - 产品表外键ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品表外键ID
     *
     * @param productId 产品表外键ID
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取产品购买的个数
     *
     * @return buy_counts - 产品购买的个数
     */
    public Integer getBuyCounts() {
        return buyCounts;
    }

    /**
     * 设置产品购买的个数
     *
     * @param buyCounts 产品购买的个数
     */
    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }

    /**
     * 获取订单创建时间
     *
     * @return create_time - 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param createTime 订单创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取支付时间
     *
     * @return paid_time - 支付时间
     */
    public Date getPaidTime() {
        return paidTime;
    }

    /**
     * 设置支付时间
     *
     * @param paidTime 支付时间
     */
    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }
}