package com.microservices;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "stage")
public class StageEndPoints {

    Map<String,Stage> stage= new ConcurrentHashMap<>();

    @ReadOperation
    public  Map<String,Stage> getAllStages()
    {
        return stage;
    }

    @ReadOperation
    public Stage getStage(@Selector String name)
    {
        return stage.get(name);
    }
    
    @WriteOperation
    public void setValue(@Selector String name, int stages)
    {
        stage.put(name,new Stage(stages));
    }

    static class Stage
    {
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
