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
    private String questionText;
    private List<Answer> answers;

}


git config --global user.name "FDD-DEV"
git config --global user.email "fdd.dev.team@gmail.com"
