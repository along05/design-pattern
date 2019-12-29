package com.along.design.build.builder;

/**
 * @author huanglong
 * @date 2019-12-29
 */
public class main {

    public static void main(String[] args) throws RuntimeException {
        User user = User.builder().name("along").nickname("nick-along").password("123456").build() ;
        System.out.println(user.toString());
    }
}
