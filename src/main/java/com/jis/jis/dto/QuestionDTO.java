package com.jis.jis.dto;

import java.util.List;

import com.jis.jis.domain.Answer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {

    private Long id;
    private Long topic;
    private String questionText;
    private List<Answer> answers;

}