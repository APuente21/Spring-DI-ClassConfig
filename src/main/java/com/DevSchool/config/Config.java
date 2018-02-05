package com.DevSchool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.DevSchool.domain.Message;
import com.DevSchool.domain.MessageImp;

@Configuration
public class Config {

	@Bean(name="message")
	public Message message(){
		return new MessageImp();
	}
}
