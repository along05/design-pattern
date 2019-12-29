package com.along.design.build.factory.factory;

/**
 * @author huanglong
 * @date 2019-12-29
 */
public class AmericanFoodFactory implements FoodFactory{

    public Food makeFood(String type) {
        if (type.equals("noodle")){
            return new AmericanNoodle() ;
        } else if( type.equals("meat")){
            return new AmericanMeat() ;
        }
        return null ;
    }
}
