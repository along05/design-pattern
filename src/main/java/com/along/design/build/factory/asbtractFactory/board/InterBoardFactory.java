package com.along.design.build.factory.asbtractFactory.board;

/**
 * @author huanglong
 * @date 2019-12-29
 */
public class InterBoardFactory implements BoardFactory{

    public Board makeBoard(String type) {
        return new Board("inter" , type);
    }
}
