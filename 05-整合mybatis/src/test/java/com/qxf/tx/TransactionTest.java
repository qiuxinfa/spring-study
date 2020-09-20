package com.qxf.tx;

import com.qxf.service.MultiTx;
import com.qxf.service.UserBalanceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName TransactionTest
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/9/16 22:48
 **/
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TransactionTest {

    @Test
    public void test01(){
        //加载配置文件，启动容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserBalanceService service = context.getBean(UserBalanceService.class);
        service.testTx();
    }

    @Test
    public void testMultiTx(){
        //加载配置文件，启动容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MultiTx service = context.getBean(MultiTx.class);
        service.tx();
    }

}
