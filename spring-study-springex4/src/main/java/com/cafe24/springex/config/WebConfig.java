package com.cafe24.springex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
// spring-servlet.xml의 <mvc: 붙은 태그들
@EnableWebMvc
// spring-servlet.xml의 <context:component-scan base-package="com.cafe24.springex.controller" />
@ComponentScan({"com.cafe24.springex.controller"})
public class WebConfig {
	
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
}
