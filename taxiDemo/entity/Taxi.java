package org.taxiDemo.entity;

/**
 * @program: seckill
 * @description
 * @author: Maon
 * @create: 2020-05-15 00:24
 **/
public class Taxi {
    private long taxi_id;

    private long order_id;

    //车类型
    private int taxi_lx;


    public long getTaxi_id() {
        return taxi_id;
    }

    public void setTaxi_id(long taxi_id) {
        this.taxi_id = taxi_id;
    }


    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public int getTaxi_lx() {
        return taxi_lx;
    }

    public void setTaxi_lx(int taxi_lx) {
        this.taxi_lx = taxi_lx;
    }
}
