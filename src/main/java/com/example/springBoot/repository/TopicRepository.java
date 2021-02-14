package com.example.springBoot.repository;

import com.example.springBoot.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

}