package com.along.design.build.factory.asbtractFactory.cpu;

/**
 * @author huanglong
 * @date 2019-12-29
 */
public class AmdCpuFactory implements CpuFactory{

    public Cpu makeCpu(String type) {
        return new Cpu("amd" , type) ;
    }
}
