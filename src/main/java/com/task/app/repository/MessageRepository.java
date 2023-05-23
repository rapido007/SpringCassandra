package com.task.app.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.task.app.model.Message;

@Repository
public interface MessageRepository extends CassandraRepository<Message, Integer>
{

}
