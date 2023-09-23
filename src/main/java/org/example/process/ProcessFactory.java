package org.example.process;

import org.example.process.strategy.ProcessStrategy;

import java.util.HashMap;

public class ProcessFactory {

    private static HashMap<Integer, ProcessStrategy> strategyMap=new HashMap<Integer, ProcessStrategy>();

    public static ProcessStrategy GetProcess(int cmd){
        return strategyMap.get(cmd);
    }
}
