package com.ph.proxy;

import sun.misc.BASE64Decoder;


public class Test {
    public static void main(String[] args){
        ICoder coder=new JavaCoder("zhang");
        ICoder proxy=new CorderProxy(coder);
        proxy.implDemands("Add user manageMent");
        try {
            String s="ZGV2aWNlSWQnMTA0ODQmdXNlcklkJzIxJm1hY0FkZHJlc3MnVFAtTElOS194dXhpYW84NGYzZWIzMzc4YmMmdHlwZScwJmNvbnRyb2xsZWQnMCZob3VzZUlkJzE3NzImZGV2aWNlTmFtZSfkuLvljac=";
            BASE64Decoder decoder=new BASE64Decoder();
            String s2=new String(decoder.decodeBuffer(s));
            System.out.println("-->"+s2);
        }catch (Exception e){
            e.printStackTrace();
        }
        JDKDynamicProxy dynamicProxy=new JDKDynamicProxy();
        TestDao testDao=new TestDaoImpl();
        TestDao testDaoProxy= (TestDao) dynamicProxy.createProxy(testDao);
        testDaoProxy.save();
    }
}
