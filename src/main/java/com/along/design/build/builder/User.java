package com.along.design.build.builder;

/**
 *
 * 建造者：Food food = new FoodBuilder().a().b().c().build();
 * 核心思想：把所有的数据复制给Builder ，然后调用build方法返回对象
 *
 * @author huanglong
 * @date 2019-12-29
 */
public class User {

    private String name ;
    private String password ;
    private String nickname ;

    //构造方法私有化
    private User(String name , String password , String nickname){
        this.name = name ;
        this.password = password ;
        this.nickname = nickname ;
    }

    //静态方法.builder() 返回UserBuilder对象
    public static UserBuilder builder(){
        return new UserBuilder() ;
    }

    public static class UserBuilder{
        private String name ;
        private String password ;
        private String nickname ;

        private UserBuilder() {}

        public UserBuilder name(String name){
            this.name= name ;
            return this ;
        }

        public UserBuilder password(String password){
            this.password = password ;
            return this ;
        }

        public UserBuilder nickname(String nickname){
            this.nickname = nickname ;
            return this ;
        }

        public User build(){
            //在返回对象的时候可以先对对象进行一些校验
            if (name == null || password == null || nickname == null){
                throw new RuntimeException("字段不能为空~");
            }
            return new User( name, password ,nickname);
        }
    }

    public String toString(){
        return "name:".concat(this.name) ;
    }
}
