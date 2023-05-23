package com.task.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.app.model.Message;
import com.task.app.repository.MessageRepository;

@Service
public class MessageService 
{
	@Autowired
	private MessageRepository repo;
	
	public Message saveMessage(int id,String message)
	{
		Message msg = new Message();
		msg.setId(id);
		msg.setMessage(message);
		repo.save(msg);
		return msg;
	}
	
	public List<Message> getAllMessages()
	{
		return repo.findAll();
	}
	
	public Message getMessageById(int id)
	{
		Optional<Message> op = repo.findById(id);
		Message msg = op.get();
		return msg;
		
	}
	
	public Message updateMessage(int id,String message)
	{
		Optional<Message> op = repo.findById(id);
		Message msg = op.get();
		msg.setMessage(message);
		repo.save(msg);
		return msg;
	}
	
	public Message deleteMessage(int id)
	{
		Optional<Message> op = repo.findById(id);
		Message msg = op.get();
		repo.deleteById(id);
		return msg;
	}

}
