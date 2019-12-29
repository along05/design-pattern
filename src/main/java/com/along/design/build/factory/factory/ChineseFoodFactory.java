package com.along.design.build.factory.factory;

/**
 * @author huanglong
 * @date 2019-12-29
 */
public class ChineseFoodFactory implements FoodFactory{

    public Food makeFood(String type) {
        if (type.equals("noodle")){
            return new ChineseNoodle() ;
        } else if( type.equals("meat")){
            return new ChineseMeat() ;
        }
        return null ;
    }
}
