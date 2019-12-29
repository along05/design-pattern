package com.along.design.build.factory.asbtractFactory;

import com.along.design.build.factory.asbtractFactory.board.Board;
import com.along.design.build.factory.asbtractFactory.computer.Inter1Computer;
import com.along.design.build.factory.asbtractFactory.computer.Computer;
import com.along.design.build.factory.asbtractFactory.cpu.Cpu;
import com.along.design.build.factory.asbtractFactory.factory.InterFactory;

/**
 * 利用工厂模式做电脑：
 * cup分厂家，所以cpu需要用工厂模式来生产
 * 主板也是一样，所以主板也需要使用工厂模式来生成
 * 问题是不同的cpu和主板组合起来的电脑不一定兼容
 * 所以：必须给每个型号的的电脑新建一个类，用电脑工厂去生产
 *
 * @author huanglong
 * @date 2019-12-29
 */
public class main {

    public static void main(String[] args) {
        InterFactory interFactory = new InterFactory() ;

        Cpu cpu = interFactory.getInterCpuFactory().makeCpu(Inter1Computer.cupType) ;
        Board board = interFactory.getInterBoardFactory().makeBoard(Inter1Computer.boardType) ;

        Computer computer = new Computer(cpu , board) ;
        System.out.println(computer.toString());
    }


}
