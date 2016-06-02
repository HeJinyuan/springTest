package com.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest
{
	public SpringTest()
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Student student=ctx.getBean("student",Student.class);
		student.printInfo();
	}
	public static void main(String[]args)
	{
		new SpringTest();
	}

}
