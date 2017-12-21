package com.spring.ioc.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ClassA implements ApplicationContextAware{
	
	private int empId;
	private ClassB b;
	
	private ApplicationContext applicationContext;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public ClassB getB() {
		b = (ClassB) applicationContext.getBean("bBean");
		return b;
	}

	public void setB(ClassB b) {
		this.b = b;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
}
