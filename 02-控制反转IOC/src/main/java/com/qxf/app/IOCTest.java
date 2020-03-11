package com.qxf.app;

import com.qxf.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/11
 * @Description: com.qxf.app
 */
public class IOCTest {
    public static void main(String[] args) {
        //读取配置文件，启动
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中，获取bean实例
        Person person = context.getBean("person1", Person.class);
        System.out.println("无参构造函数-->"+person);
        Person person2 = context.getBean("person2", Person.class);
        System.out.println("静态工厂方法-->"+person2);
        Person person3 = context.getBean("person3", Person.class);
        System.out.println("实例工厂方法-->"+person3);
        //3种方式创建的对象，当然是3个不同的对象，相当于分别new了3次
        System.out.println("person==person2 ? "+(person==person2));
        System.out.println("person2==person3 ? "+(person2==person3));
        //关闭容器
        context.close();
    }
}
