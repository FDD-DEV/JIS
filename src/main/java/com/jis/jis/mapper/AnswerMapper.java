package com.jis.jis.mapper;

import org.mapstruct.Mapper;

import com.jis.jis.domain.Answer;
import com.jis.jis.dto.AnswerDTO;

@Mapper(componentModel = "spring")
public interface AnswerMapper {

    Answer toAnswer(AnswerDTO answerDTO);

    AnswerDTO toDTO(Answer answer);

}
