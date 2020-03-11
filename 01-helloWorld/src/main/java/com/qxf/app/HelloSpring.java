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
        Person person = context.getBean("my,person1", Person.class);
        System.out.println("根据id获取的bean实例：  "+person);
        //从容器中，根据name获取bean实例
        Person person2 = context.getBean("person2", Person.class);
        System.out.println("name=person2,获取的bean实例：  "+person2);
        Person you = context.getBean("you", Person.class);
        System.out.println("name=you,获取的bean实例：  "+you);
        //spring容器创建的bean实例默认是单例的
        System.out.println("person==person2 ? "+(person==person2));
        //关闭容器
        context.close();
    }
}
