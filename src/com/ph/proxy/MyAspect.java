package com.ph.proxy;

public class MyAspect {
    public void check(){
        System.out.println("权限检查");
    }
    public void exepect(){
        System.out.println("处理异常");
    }
    public void log(){
        System.out.println("打印log日志");
    }
    public void monitor(){
        System.out.println("性能监测");
    }
}
