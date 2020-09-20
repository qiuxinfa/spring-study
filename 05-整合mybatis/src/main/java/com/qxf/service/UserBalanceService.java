package com.qxf.service;

import com.qxf.mapper.ProductStoreMapper;
import com.qxf.mapper.UserBalanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName UserBalanceService
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/9/16 23:00
 **/
@Service
public class UserBalanceService {
    @Autowired
    private ProductStoreMapper productStoreMapper;
    @Autowired
    private UserBalanceMapper userBalanceMapper;

    @Transactional
    public void testTx(){
        System.out.println("开始减库存...");
        productStoreMapper.updateProductStore("p001");
        System.out.println("库存修改成功...");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        // int i= 1/0;
        System.out.println("开始减余额...");
        userBalanceMapper.updateUserBalance("u001",100);
        System.out.println("余额修改成功...");
    }

    // 测试事务的隔离级别
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateProductStore(String productId){
        productStoreMapper.updateProductStore(productId);
        System.out.println("======减库存完成=====");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUserBalance(String userId,Integer balance){
        userBalanceMapper.updateUserBalance(userId,balance);
        int i = 10 /0;
        System.out.println("======减余额完成=====");
    }
}
