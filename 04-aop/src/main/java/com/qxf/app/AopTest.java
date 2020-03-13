package com.qxf.app;

import com.qxf.service.impl.PersonServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/12
 * @Description: com.qxf.app
 */
public class AopTest {
    public static void main(String[] args) {
        //加载配置文件，启动容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取bean
        PersonServiceImpl personService = context.getBean("personServiceImpl", PersonServiceImpl.class);
        personService.addPerson();
        personService.getPerson();
        //关闭容器
        context.close();
    }
}
