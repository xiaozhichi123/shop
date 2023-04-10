package com.jhz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ${NAME}
 * @Description TODO
 * @Author JHZ
 * @Date ${DATE} ${TIME}
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.jhz.mapper"})
public class MallsGoodsApplicaion {
    public static void main(String[] args) {
        SpringApplication.run(MallsGoodsApplicaion.class,args);
    }

}