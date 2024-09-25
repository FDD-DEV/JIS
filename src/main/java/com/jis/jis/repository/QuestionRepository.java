package com.jis.jis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jis.jis.domain.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

    List<Question> findByTopic(Long topic);

    @Query("SELECT q FROM Question q WHERE q.topic IN :topics")
    List<Question> findByTopics(@Param("topics") List<Long> topics);


}
