package com.demo;

import com.demo.config.AnnotationConfig;
import com.demo.dao.TestDao;
import com.demo.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStartup {

	public static void main(String[] args) {
		// 初始化IOC容器：
		// 		1、创建DefaultListableBeanFactory；
		//		2、注册Spring内置的1个BeanFactoryPostProcessor和5个BeanPostProcessor等；
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		// 注册启动配置类型AppConfig.class
		applicationContext.register(AnnotationConfig.class);
		// 初始化spring环境
		// 扫描添加注解的类并注册到BeanDefinitionMap中；
		applicationContext.refresh();
		TestService testService = applicationContext.getBean(TestService.class);
		testService.printStr("testService");
	}

}