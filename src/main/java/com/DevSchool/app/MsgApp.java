package com.DevSchool.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.DevSchool.config.Config;
import com.DevSchool.domain.Message;

public class MsgApp {
	public static void main (String [] args){

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);	
		Message msg = (Message) ctx.getBean("message");
		msg.printString("Welcome to my channel!");
	}
}
