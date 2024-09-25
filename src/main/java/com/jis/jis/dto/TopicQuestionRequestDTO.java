package com.jis.jis.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopicQuestionRequestDTO {
    private List<Long> topicId;
    private int numberOfQuestions;
}

