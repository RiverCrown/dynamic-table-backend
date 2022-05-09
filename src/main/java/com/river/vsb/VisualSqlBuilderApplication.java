package com.river.vsb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.river.vsb.dao")
public class VisualSqlBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisualSqlBuilderApplication.class, args);
    }

}
