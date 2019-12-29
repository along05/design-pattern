package com.along.design.build.factory.simplefactory;

/**
 * 简单工厂：只有一个工厂类
 * 就是具体的实现类实现一个接口
 * 然后一个工厂类，负责根据不同的类型，返回具体的对象
 */
public class main {

    public static void main(String[] args) {
        Food food = FoodFactory.buildFood("chinese") ;
        food.makeFood();
    }

}
