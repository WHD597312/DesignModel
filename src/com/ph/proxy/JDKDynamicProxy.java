package com.ph.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {
    private TestDao testDao;

    public Object createProxy(TestDao testDao){
        this.testDao=testDao;
        ClassLoader loader=JDKDynamicProxy.class.getClassLoader();
        Class[] interfaces=testDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader,interfaces,this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect aspect=new MyAspect();
        aspect.check();
        aspect.exepect();
        Object obj=method.invoke(testDao,args);
        aspect.log();
        aspect.monitor();
        return obj;
    }
}
