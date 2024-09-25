package com.jis.jis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDTO {

    private Long id;
    private Long question;
    private String answerText;
    private Boolean isCorrect;
    private String explanation;

}
