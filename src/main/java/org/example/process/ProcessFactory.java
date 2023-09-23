package org.example.process;

import org.example.process.strategy.ProcessStrategy;
import org.example.process.strategy.PutParcelStrategy;

import java.util.HashMap;

public class ProcessFactory {

    private static HashMap<Integer, ProcessStrategy> strategyMap=new HashMap<Integer, ProcessStrategy>();
    static {
        strategyMap.put(102,new PutParcelStrategy());
    }
    public static ProcessStrategy GetProcess(int cmd){
        return strategyMap.get(cmd);
    }
}
