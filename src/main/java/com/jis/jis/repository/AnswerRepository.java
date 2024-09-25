package com.jis.jis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jis.jis.domain.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{

    List<Answer> findByQuestion(Long question);

}
