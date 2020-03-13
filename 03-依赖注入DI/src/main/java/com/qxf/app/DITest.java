package com.qxf.app;


import com.qxf.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/11
 * @Description: com.qxf.app
 */
public class DITest {
    public static void main(String[] args) {
        //加载配置文件，启动容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取bean
        Person person1 = context.getBean("person1", Person.class);
        Person person2 = context.getBean("person2", Person.class);
        System.out.println("通过参数构造函数注入属性值："+person1);
        System.out.println("通过set方法注入属性值："+person2);

        //关闭容器
        context.close();
    }
}
