package org.taxiDemo.Billings;


import org.taxiDemo.entity.Order;


/**
 * @program: seckill
 * @description  费用计算父类
 * @author: Maon
 * @create: 2020-05-15 00:37
 **/
public abstract class Billing {

    private String userName;


    public Billing(String userName) {
        this.userName = userName;
    }

    /**
     * 计算费用-普通 (startTime,endTime]
     * @param order
     * @return
     */
    public double  calculate(Order order){
        this.userName = userName;
        return 0.0;
    }

    /**
     * 计算费用-优惠券
     * @param order
     * @param coupons 优惠券折扣
     * @return
     */
    public double  calculateByCoupons(Order order,float coupons){
        this.userName = userName;
        return 0.0;
    }


}
