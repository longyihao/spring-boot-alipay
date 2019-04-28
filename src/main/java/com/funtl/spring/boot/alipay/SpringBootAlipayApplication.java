package com.funtl.spring.boot.alipay;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.funtl.spring.boot.alipay")
@EnableTransactionManagement
@MapperScan(basePackages = "com.funtl.spring.boot.alipay.mapper")
public class SpringBootAlipayApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootAlipayApplication.class,args);
    }
}
