package com.king;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.king.dao")
@SpringBootApplication
public class ShardingJdbcSimple {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcSimple.class);
    }

}
