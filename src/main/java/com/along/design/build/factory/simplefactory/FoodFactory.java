package com.along.design.build.factory.simplefactory;

/**
 * @author huanglong
 * @date 2019-12-29
 */
public class FoodFactory {

    public static Food buildFood(String type) {

        if (type.equals("chinese")) {
            return new ChineseFood();
        } else if (type.equals("american")) {
            return new AmericanFood();
        } else if (type.equals("japanese")) {
            return new JapaneseFood();
        } else {
            return null;
        }
    }

}
