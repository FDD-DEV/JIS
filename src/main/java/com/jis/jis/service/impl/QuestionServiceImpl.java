package com.jis.jis.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jis.jis.domain.Question;
import com.jis.jis.dto.QuestionDTO;
import com.jis.jis.dto.TopicQuestionRequestDTO;
import com.jis.jis.mapper.QuestionMapper;
import com.jis.jis.repository.QuestionRepository;
import com.jis.jis.service.QuestionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    @Override
    public List<QuestionDTO> getQuestionsByTopics(TopicQuestionRequestDTO requests) {

        // Obtenemos todas las preguntas para los topicIds
        List<Question> allQuestions = questionRepository.findQuestionsByTopicIds(requests.getTopicId());

        // Agrupamos las preguntas por topicId
        Map<Long, List<Question>> questionsByTopic = allQuestions.stream()
            .collect(Collectors.groupingBy(question -> question.getTopic().getId()));

        // Limitamos las preguntas por cada tema
        List<Question> list = questionsByTopic.values().stream()
            .flatMap(questions -> questions.stream().limit(requests.getNumberOfQuestions()))
            .collect(Collectors.toList());

        return list.stream().map(q -> questionMapper.toDTO(q)).collect(Collectors.toList()); 
    }

}
