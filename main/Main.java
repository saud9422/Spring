package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;
import com.entity.Employee;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee e=context.getBean("e",Employee.class);
		System.out.println(e);
	}
}
