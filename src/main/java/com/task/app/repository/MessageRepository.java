package com.task.app.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.task.app.model.Message;

@Repository
public interface MessageRepository extends CassandraRepository<Message, Integer>
{
	

}
