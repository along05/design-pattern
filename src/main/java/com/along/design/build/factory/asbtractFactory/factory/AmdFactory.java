package com.along.design.build.factory.asbtractFactory.factory;

import com.along.design.build.factory.asbtractFactory.board.AmdBoardFactory;
import com.along.design.build.factory.asbtractFactory.cpu.AmdCpuFactory;
import lombok.Data;

/**
 * @author huanglong
 * @date 2019-12-29
 */
@Data
public class AmdFactory {

    private AmdCpuFactory amdCpuFactory = new AmdCpuFactory();

    private AmdBoardFactory amdBoardFactory = new AmdBoardFactory();

}
