package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration

@ComponentScan("com.nt.controller")
@EnableWebMvc
public class SrvletConfig {

}
