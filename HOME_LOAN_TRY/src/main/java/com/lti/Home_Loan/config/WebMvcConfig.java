package com.lti.Home_Loan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.lti.Home_Loan")
public class WebMvcConfig implements WebMvcConfigurer {


	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").
		addResourceLocations("/resources/css");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("Register");
	}
	public void addViewControllers1(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("Self");
	}

}
