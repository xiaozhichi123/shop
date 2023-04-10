package com.jhz.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/***
* @MethodName  MallsFileApplication
* @Description 云商城 http://localhost:8082/file/download/news1.jpg
* @Author JHZ
* @Date 22:32 2023/4/3
*/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MallsFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallsFileApplication.class,args);
    }
}
