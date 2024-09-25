package com.jis.jis.service;

import java.util.List;

import com.jis.jis.dto.QuestionDTO;
import com.jis.jis.dto.TopicQuestionRequestDTO;

public interface QuestionService {

    List<QuestionDTO> getQuestionsByTopics(TopicQuestionRequestDTO requests);

}
