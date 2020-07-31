package com.example.springbootzuulapigatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.springbootzuulapigatway.filters.ErrorFilter;
import com.example.springbootzuulapigatway.filters.PostFilter;
import com.example.springbootzuulapigatway.filters.PreFilter;
import com.example.springbootzuulapigatway.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulApiGatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulApiGatwayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
