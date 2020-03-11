package com.qxf.factory;

import com.qxf.pojo.Person;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/11
 * @Description: com.qxf.factory
 */
public class InstanceFactory {
    public InstanceFactory(){
        System.out.println("实例工厂构造方法");
    }

    //返回一个创建的对象
    public Person getPersonByInstanceFactory(){
        return new Person();
    }
}
