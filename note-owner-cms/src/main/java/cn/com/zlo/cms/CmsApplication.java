package cn.com.zlo.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Copyright (C), 2023, 北京合商云汇科技有限公司
 * FileName: CmsApplication
 * Author: ZL
 * Date: 2023/1/3 14:05:28
 * Description:
 */
@SpringBootApplication(scanBasePackages = {"cn.com.zlo"})
@MapperScan({"cn.com.zlo.repository.mapper"})
@EnableTransactionManagement
public class CmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class);
    }
}
