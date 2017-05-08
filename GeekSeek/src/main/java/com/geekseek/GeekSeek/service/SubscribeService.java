package com.geekseek.GeekSeek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekseek.GeekSeek.model.Subscribe;
import com.geekseek.GeekSeek.repository.SubscribeRepository;

@Service
public class SubscribeService {
	
	@Autowired
	private SubscribeRepository subscribeRepository;
	
	
	 public void save(Subscribe subscribe) {
		 System.out.println(".........."+subscribe.getEmailid());
	        subscribeRepository.save(subscribe);   	      
	    }


}
