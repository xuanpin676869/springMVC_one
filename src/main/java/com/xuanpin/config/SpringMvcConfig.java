package com.xuanpin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.xuanpin.controller","com.xuanpin.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
