package com.along.design.build.singleton;

/**
 * 饱汉模式
 * 在需要调用的时候实例化 - 线程不安全 - 需要加锁 - 使用volatile共享变量
 *
 * @author huanglong
 * @date 2019-12-29
 */
public class Full {

    private Full() {}

    private static volatile Full instance = null;

    public static Full getInstance() {
        if (instance == null) {
            synchronized (Full.class) {
                if (instance == null) {
                    instance = new Full();
                }
            }
        }
        return instance;
    }

}
