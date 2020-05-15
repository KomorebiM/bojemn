package org.taxiDemo.entity;

/**
 * @program: seckill
 * @description
 * @author: Maon
 * @create: 2020-05-15 00:24
 **/
public class User {
    private long user_id;

    private long user_phone;

    private String user_name;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(long user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    //...
}
