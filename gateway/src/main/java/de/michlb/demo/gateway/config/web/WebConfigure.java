package de.michlb.demo.gateway.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
public class WebConfigure extends WebMvcConfigurerAdapter  {

// 
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("*").allowedOrigins("*").allowedMethods("*");
//    }

}