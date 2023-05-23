package com.task.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.app.model.Message;
import com.task.app.service.MessageService;

@RestController
@RequestMapping("cassandra")
public class MessageController 
{
	@Autowired
	private MessageService service;
	
	@RequestMapping("/save")
	public Message save(int id,String message)
	{
		Message msg = service.saveMessage(id, message);
		return msg;
	}
	
}
