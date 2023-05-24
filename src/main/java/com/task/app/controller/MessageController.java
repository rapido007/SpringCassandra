package com.task.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Message save(@RequestParam int id,@RequestParam String message)
	{
		System.out.println("save");
		Message msg = service.saveMessage(id, message);
		return msg;
	}
	
	@RequestMapping("/getAll")
	public List<Message> getAllMessages()
	{
		List<Message> list = service.getAllMessages();
		return list;
	}
	
	@RequestMapping("/get")
	public Message getById(@RequestParam int id)
	{
		Message msg = service.getMessageById(id);
		return msg;
	}
	
	@RequestMapping("/update")
	public Message updateMessage(@RequestParam int id,@RequestParam String message)
	{
		Message msg = service.updateMessage(id, message);
		return msg;
	}
	
	@RequestMapping("/delete")
	public Message deleteMessage(@RequestParam int id)
	{
		Message msg = service.deleteMessage(id);
		return msg;
	}
	
}
