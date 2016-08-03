package com.test.home;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testcategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	
		context.scan("com.test");
		context.refresh();
		context.getBean("category");
		System.out.println("bean created Successfully:");

	}

}
