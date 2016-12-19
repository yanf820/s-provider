package com.startup.saas.boot;


import com.alibaba.dubbo.remoting.http.servlet.BootstrapListener;
import com.alibaba.dubbo.remoting.http.servlet.DispatcherServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.startup.saas")
public class SpringBootStarter {

	public static void main(String[] args) {
		SpringApplication.run(new Object[] {SpringBootStarter.class,BootstrapListener.class,DispatcherServlet.class}, args);
	}
	
}