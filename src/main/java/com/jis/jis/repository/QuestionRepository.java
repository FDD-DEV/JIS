package com.jis.jis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jis.jis.domain.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

    List<Question> findByTopicId(Long topicId);

    @Query("SELECT q FROM Question q WHERE q.topic.id IN :topicIds")
    List<Question> findByTopicIds(List<Long> topicIds);

    @Query("SELECT q FROM Question q WHERE q.topic.id IN :topicIds")
    List<Question> findQuestionsByTopicIds(@Param("topicIds") List<Long> topicIds);


}
