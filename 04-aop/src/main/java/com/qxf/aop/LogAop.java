package com.qxf.aop;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/12
 * @Description: com.qxf.aop
 */
public class LogAop {

    public void logBefore(){
        System.out.println("方法开始，记录日志。。。");
    }

    public void logAfter(){
        System.out.println("方法结束，记录日志。。。");
    }
}
