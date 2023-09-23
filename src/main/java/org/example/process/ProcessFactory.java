package org.example.process;

import org.example.entity.CmdTypeEnum;
import org.example.process.strategy.ProcessStrategy;
import org.example.process.strategy.PutParcelStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProcessFactory {
    @Autowired
    private Map<String, ProcessStrategy> strategyMap;
    public ProcessStrategy GetProcess(int cmd){
        return strategyMap.get(CmdTypeEnum.getStrategyEnum(cmd).getStrategyName());
    }
}
