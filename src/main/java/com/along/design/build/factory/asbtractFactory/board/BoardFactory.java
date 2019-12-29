package com.along.design.build.factory.asbtractFactory.board;

/**
 * @author huanglong
 * @date 2019-12-29
 */
public interface BoardFactory {

    Board makeBoard(String type);

}
