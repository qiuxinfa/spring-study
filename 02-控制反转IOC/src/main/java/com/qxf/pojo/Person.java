package com.qxf.pojo;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/11
 * @Description: com.qxf.pojo
 */
public class Person {
    private String id;
    private String name;
    private Integer age;

    public Person(){
        System.out.println("开始创建Person对象了。。。");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
