package com.stackroute.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * * TODO **
 * Add appropriate annotation for allowing Caching in this application
 */
@SpringBootApplication
@EnableCaching
public class ProductServiceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProductServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
