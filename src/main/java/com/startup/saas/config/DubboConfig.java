package com.startup.saas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:META-INF/spring/startup-saas-provider.xml")
public class DubboConfig {



}
