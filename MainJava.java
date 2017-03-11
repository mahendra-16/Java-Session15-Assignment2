package com.apps.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationcontext= new ClassPathXmlApplicationContext("beans.xml");
		
		Message message = (Message) applicationcontext.getBean("message");
		message.show();
	}

}
