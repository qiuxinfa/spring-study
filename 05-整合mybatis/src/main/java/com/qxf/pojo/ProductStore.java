package com.qxf.pojo;

import java.io.Serializable;

/**
 * @ClassName ProductStore
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/9/16 22:38
 **/
public class ProductStore implements Serializable{
    private String id;
    private String name;
    private Integer cnt;

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

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "ProductStore{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cnt=" + cnt +
                '}';
    }
}
