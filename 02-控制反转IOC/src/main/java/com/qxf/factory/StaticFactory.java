package com.qxf.factory;

import com.qxf.pojo.Person;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/11
 * @Description: com.qxf.factory
 */
public class StaticFactory {
    public StaticFactory(){
        System.out.println("静态工厂构造函数");
    }

    //提供一个静态方法，返回创建的对象
    public static Person getPerson(){
        return new Person();
    }
}
