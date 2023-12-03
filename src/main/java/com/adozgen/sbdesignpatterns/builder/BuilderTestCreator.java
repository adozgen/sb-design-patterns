package com.adozgen.sbdesignpatterns.builder;

import com.adozgen.sbdesignpatterns.builder.example1.Computer;
import com.adozgen.sbdesignpatterns.builder.example1.ComputerBuilder;
import com.adozgen.sbdesignpatterns.builder.example2.RestRequestConfiguration;
import com.adozgen.sbdesignpatterns.builder.example2.SomeRequestBodyObject;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

@Component
public class BuilderTestCreator {

    @PostConstruct
    public void init() {
        //example1 test
        Computer computer = new ComputerBuilder()
                .setHDD("512GB")
                .setRAM("8GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(computer);

        RestRequestConfiguration config = new RestRequestConfiguration.Builder("http://api.example.com/data")
                .method(HttpMethod.POST)
                .addHeader("Content-Type", "application/json")
                .body(new SomeRequestBodyObject("test1", "test2"))
                .build();

        System.out.println(config.getMethod());


    }

}
