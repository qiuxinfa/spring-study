package com.qxf.app;

import com.qxf.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/11
 * @Description: com.qxf.app
 */
public class HelloSpring {
    public static void main(String[] args) {
        //读取配置文件，启动
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中，根据id获取bean实例
        Person person = context.getBean("person2", Person.class);
        System.out.println("根据beanName的别名获取的bean实例：  "+person);
        //关闭容器
        context.close();
    }
}
