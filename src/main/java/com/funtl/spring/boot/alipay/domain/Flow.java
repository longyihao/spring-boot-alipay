package com.funtl.spring.boot.alipay.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "alipay.flow")
public class Flow extends BaseDomain {
    @Id
    private String id;

    /**
     * 流水号
     */
    @Column(name = "flow_num")
    private String flowNum;

    /**
     * 订单号
     */
    @Column(name = "order_num")
    private String orderNum;

    /**
     * 产品主键ID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 支付金额
     */
    @Column(name = "paid_amount")
    private String paidAmount;

    /**
     * 支付方式
            1：支付宝
            2：微信
     */
    @Column(name = "paid_method")
    private Integer paidMethod;

    /**
     * 购买个数
     */
    @Column(name = "buy_counts")
    private Integer buyCounts;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取流水号
     *
     * @return flow_num - 流水号
     */
    public String getFlowNum() {
        return flowNum;
    }

    /**
     * 设置流水号
     *
     * @param flowNum 流水号
     */
    public void setFlowNum(String flowNum) {
        this.flowNum = flowNum;
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
     * 获取产品主键ID
     *
     * @return product_id - 产品主键ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品主键ID
     *
     * @param productId 产品主键ID
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取支付金额
     *
     * @return paid_amount - 支付金额
     */
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * 设置支付金额
     *
     * @param paidAmount 支付金额
     */
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * 获取支付方式
            1：支付宝
            2：微信
     *
     * @return paid_method - 支付方式
            1：支付宝
            2：微信
     */
    public Integer getPaidMethod() {
        return paidMethod;
    }

    /**
     * 设置支付方式
            1：支付宝
            2：微信
     *
     * @param paidMethod 支付方式
            1：支付宝
            2：微信
     */
    public void setPaidMethod(Integer paidMethod) {
        this.paidMethod = paidMethod;
    }

    /**
     * 获取购买个数
     *
     * @return buy_counts - 购买个数
     */
    public Integer getBuyCounts() {
        return buyCounts;
    }

    /**
     * 设置购买个数
     *
     * @param buyCounts 购买个数
     */
    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}