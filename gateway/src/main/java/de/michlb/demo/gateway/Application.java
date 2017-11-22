package de.michlb.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import de.michlb.demo.gateway.config.filters.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
  
  @Bean
  public SimpleFilter simpleFilter() {
    return new SimpleFilter();
  }
}
