package com.qxf.app;

import com.qxf.mapper.UserMapper;
import com.qxf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/24
 * @Description: com.qxf.app
 */
public class TestSpringMybatis {

    public static void main(String[] args) {
        //加载配置文件，启动容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取bean
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user = userMapper.getUserById("1");
        System.out.println(user);
    }
}
