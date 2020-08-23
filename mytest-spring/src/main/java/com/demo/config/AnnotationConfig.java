package com.demo.config;

import com.demo.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo")
public class AnnotationConfig {

	@Bean
	public TestDao testDao() {
		return new TestDao();
	}
}