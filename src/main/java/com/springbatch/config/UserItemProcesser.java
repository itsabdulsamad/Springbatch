package com.springbatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.springbatch.model.User;

public class UserItemProcesser implements ItemProcessor<User, User> {

	
// Item Processor 
@Override
	public User process(User user) throws Exception {
		return user;
	}

}
