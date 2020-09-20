package com.qxf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName MultiTx
 * @Description 多个事务隔离级别测试
 * @Author qiuxinfa
 * @Date 2020/9/17 22:32
 **/
@Service
public class MultiTx {

    @Autowired
    private UserBalanceService userBalanceService;

    @Transactional
    public void tx(){
        System.out.println("多事务测试开始");
        // 减库存
        userBalanceService.updateProductStore("p001");
        // 减余额
        userBalanceService.updateUserBalance("u001",100);
        System.out.println("多事务测试正常结束");
    }
}
