package com.jis.jis.mapper;

import org.mapstruct.Mapper;

import com.jis.jis.domain.Question;
import com.jis.jis.dto.QuestionDTO;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    Question toQuestion(QuestionDTO questionDTO);

    QuestionDTO toDTO(Question question);

}
