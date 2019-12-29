package com.along.design.build.factory.asbtractFactory.computer;

import com.along.design.build.factory.asbtractFactory.board.Board;
import com.along.design.build.factory.asbtractFactory.cpu.Cpu;
import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author huanglong
 * @date 2019-12-29
 */
@AllArgsConstructor
@ToString
public class Computer {

    Cpu cpu ;
    Board board ;
}
