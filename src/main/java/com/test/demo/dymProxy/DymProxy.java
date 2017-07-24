package com.test.demo.dymProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DymProxy implements InvocationHandler {
    private Object target;

    /*必要生成底层代码
    *
    * */
    public Object newInstance(Object object) {
    this.target=object;
    /*
    * ClassLoader
    *interfaces只得是被代理类（接口）的方法
    *
    * */
        Object o = Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
        return o;
    }

    //核心代码
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行方法前");
        if (args!=null){
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
        Object invoke = null;
        try {
            //执行之前
            System.out.println("建立连接");
            System.out.println("开启事务");
            //反射技术
            invoke = method.invoke(target, args);
            //执行之前
            System.out.println("上传事务");
            System.out.println("关闭连接");
        }catch (Exception e){
            System.out.println("发生异常");
        }
        return invoke;
    }
}
