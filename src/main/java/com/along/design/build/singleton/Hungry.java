package com.along.design.build.singleton;

/**
 * 饿汉模式
 * 直接用private封死在类之外new的方式，然后静态变量new一个。
 * 空间换时间 - 直接实例化好 - 线程安全
 * @author huanglong
 * @date 2019-12-29
 */
public class Hungry {

    private Hungry(){}

    private static Hungry INSTANCE = new Hungry() ;

    public static Hungry getInstance(){
        return INSTANCE ;
    }

}
