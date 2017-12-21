package com.spring.ioc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.beans.ClassA;
import com.spring.ioc.beans.ClassB;
import com.spring.ioc.beans.ClassC;
import com.spring.ioc.beans.ClassD;

public class DriverClass {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("iocApplicationContext.xml");
		ClassA  a =  ctxt.getBean("aBean", ClassA.class);
		ClassA  a1 =  ctxt.getBean("aBean", ClassA.class);
		System.out.println("a :: " + a);
		System.out.println("a1 :: " + a1);
		ClassB b = a.getB();
		ClassB b1 = a1.getB();
		System.out.println("b :: " + b);
		System.out.println("b1 :: " + b1);
		
		ClassC  c =  ctxt.getBean("cBean", ClassC.class);
		ClassC  c1 =  ctxt.getBean("cBean", ClassC.class);
		System.out.println("c :: " + c);
		System.out.println("c1 :: " + c1);
		ClassD d = c.getD();
		ClassD d1 = c1.getD();
		System.out.println("d :: " + d);
		System.out.println("d1 :: " + d1);
	}

}
