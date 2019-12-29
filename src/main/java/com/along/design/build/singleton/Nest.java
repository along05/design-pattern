package com.along.design.build.singleton;

/**
 * 嵌套方式
 * @author huanglong
 * @date 2019-12-29
 */
public class Nest {

    private Nest(){}

    private static class Holder{
        private static Nest instance = new Nest() ;
    }

    public static Nest getInstance(){
        return Holder.instance ;
    }


}
