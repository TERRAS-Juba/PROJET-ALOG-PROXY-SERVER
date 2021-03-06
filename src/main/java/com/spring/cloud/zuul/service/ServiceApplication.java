package com.spring.cloud.zuul.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
/*zuul:
  routes:
    etudiants:
      path: /etudiants/**
      url: http://localhost:2000/etudiants/
    tickets:
      path: /tickets/**
      url: http://localhost:2000/tickets/
*/