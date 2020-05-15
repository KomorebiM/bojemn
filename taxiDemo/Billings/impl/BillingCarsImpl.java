package org.taxiDemo.Billings.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.taxiDemo.Billings.Billing;
import org.taxiDemo.entity.Order;

/**
 * @program: seckill
 * @description  假设增加了私家车类型
 * @author: Maon
 * @create: 2020-05-15 00:53
 **/
public class BillingCarsImpl extends Billing {

    public BillingCarsImpl(String userName) {
        super(userName);
    }
}
