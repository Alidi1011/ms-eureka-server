package com.example.mseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server application.
 *
 * @author Alisson Arteaga / Christian Dionisio
 * @version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class MsEurekaServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(MsEurekaServerApplication.class, args);
  }

}
