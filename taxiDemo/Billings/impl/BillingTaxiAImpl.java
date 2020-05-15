package org.taxiDemo.Billings.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.taxiDemo.Billings.Billing;
import org.taxiDemo.Billings.OtherBusiness;
import org.taxiDemo.Billings.TimeToHour;
import org.taxiDemo.entity.Order;
import org.taxiDemo.entity.Taxi;

import java.util.Date;

/**
 * @program: seckill
 * @description 出租车甲类型,通过订单信息计算费用
 * @author: Maon
 * @create: 2020-05-15 00:50
 **/
public class BillingTaxiAImpl extends Billing implements OtherBusiness {

    @Autowired
    private TimeToHour timeToHour;
    private Taxi taxiA;

    private Date startTime;
    private int distance;

    @Autowired
    private TimeToHour timeCalculate;

    public BillingTaxiAImpl(String userName) {
        super(userName);
    }

    /**
     * A类出租车计算费用-普通 (startTime,endTime]
     * @param order
     * @return
     */
    public double  calculate(Order order){
        startTime = order.getStartTime();
        distance = order.getdistance();
        double price = 0.0;
        //计费
        if(timeToHour.getHour(startTime) > 6 && timeToHour.getHour(startTime) <= 18  && distance <= 3){  //白天，3公里内
            price = 14.0;
        }else if (timeToHour.getHour(startTime) > 6 && timeToHour.getHour(startTime) <= 18  && distance > 3 && distance <= 10){  //白天  3~10公里
            price = 14.0+(distance-3)*2.5;
        }else if(timeToHour.getHour(startTime) > 6 && timeToHour.getHour(startTime) <= 18  && distance > 10){   //白天  >10公里
            price = 14.0+(distance-3)*3;
        }else if(((timeToHour.getHour(startTime) >18 && timeToHour.getHour(startTime) <= 24)  || timeToHour.getHour(startTime) <=6) && distance <= 3){  //晚上  3公里内
            price = 18.0;
        }else if(((timeToHour.getHour(startTime) >18 && timeToHour.getHour(startTime) <= 24)  || timeToHour.getHour(startTime) <=6) && distance > 3 && distance <= 10){  //晚上  3~10公里
            price = 14.0+(distance-3)*3.5;
        }else if(((timeToHour.getHour(startTime) >18 && timeToHour.getHour(startTime) <= 24)  || timeToHour.getHour(startTime) <=6) && distance > 10){  //晚上  >10公里
            price = 14.0+(distance-3)*4;
        }
        return price;
    }


    /**
     * A类出租车计算费用-优惠券
     * @param order
     * @param coupons 优惠券折扣
     * @return
     */
    public double  calculateByCoupons(Order order,float coupons){
        double price = 0.0;

        return price;
    }

    /**
     * 拼车计费
     * @return
     */
    @Override
    public double Carpooling() {
        return 0;
    }
}
