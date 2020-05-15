package org.taxiDemo.entity;

import java.util.Date;

/**
 * @program: seckill
 * @description
 * @author: Maon
 * @create: 2020-05-15 00:25
 **/
public class Order {

    private long order_id;

    private long user_id;

    private long text_id;

    //订单计时时间
    private Date startTime;

    //订单结束时间
    private Date endTime;

    //里程数
    private int distance;

    //金额
    private double money;

    private User user;

    private Taxi texi;

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getText_id() {
        return text_id;
    }

    public void setText_id(long text_id) {
        this.text_id = text_id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public int getdistance() {
        return distance;
    }

    public void setdistance(int distance) {
        this.distance = distance;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Taxi getTexi() {
        return texi;
    }

    public void setTexi(Taxi texi) {
        this.texi = texi;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", user_id=" + user_id +
                ", text_id=" + text_id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", distance=" + distance +
                ", money=" + money +
                ", user=" + user +
                ", texi=" + texi +
                '}';
    }
}
