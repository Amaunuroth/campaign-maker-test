package com.maker.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by aemmet on 6/30/16.
 */

@Configuration
public class RoutingConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/campaign").setViewName("campaign");
        registry.addViewController("/encounter").setViewName("encounter");
        registry.addViewController("/map").setViewName("map");
        registry.addViewController("/user").setViewName("user");
        registry.addViewController("/login").setViewName("login");
    }

}