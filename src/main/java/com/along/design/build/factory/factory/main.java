package com.along.design.build.factory.factory;

/**
 * 工厂模式：有多种工厂，需要用不同的工厂生产不同的工厂类
 * 比如：有LogFactory接口，然后有FileLogFactory，和KafkaLogFactory这两种实现方式
 * 那么，就得 FileLogFactory 和 KafkaLogFactory这两个工厂， 去生成底层对象。
 *
 * @author huanglong
 * @date 2019-12-29
 */
public class main {

    public static void main(String[] args) {

        FoodFactory factory = new ChineseFoodFactory() ;
        Food food = factory.makeFood("noodle");
        food.makeFood();


    }

}
