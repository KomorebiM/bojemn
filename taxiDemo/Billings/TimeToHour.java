package org.taxiDemo.Billings;


import java.util.Calendar;
import java.util.Date;

/**
 * @program: seckill
 * @description 时间区间计算  方便重复使用与重新定义
 * @author: Maon
 * @create: 2020-05-15 00:40
 **/
public class TimeToHour {

    public int getHour(Date time){
        //获取上车时间
        Calendar cal = Calendar.getInstance();
        cal.setTime(time);
        int hour = cal.get( Calendar.HOUR_OF_DAY );
        return hour;
    }

}
