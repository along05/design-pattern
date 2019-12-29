package com.along.design.build.factory.asbtractFactory.factory;

import com.along.design.build.factory.asbtractFactory.board.InterBoardFactory;
import com.along.design.build.factory.asbtractFactory.cpu.InterCpuFactory;
import lombok.Data;

/**
 * @author huanglong
 * @date 2019-12-29
 */
@Data
public class InterFactory {

    private InterBoardFactory interBoardFactory = new InterBoardFactory() ;

    private InterCpuFactory interCpuFactory = new InterCpuFactory();

}
