package com.jis.jis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jis.jis.domain.Topic;


@Repository
public interface TopicRepository extends JpaRepository<Topic, Long>{

List<Topic> findByTopicNameContaining(String topicName);

}
