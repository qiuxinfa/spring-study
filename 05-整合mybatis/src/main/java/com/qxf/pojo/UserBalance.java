package com.qxf.pojo;

import java.io.Serializable;

/**
 * @ClassName UserBalance
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/9/16 22:37
 **/
public class UserBalance implements Serializable{
    private String id;
    private String username;
    private Integer balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserBalance{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}
