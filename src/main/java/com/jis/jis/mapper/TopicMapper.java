package com.jis.jis.mapper;

import org.mapstruct.Mapper;

import com.jis.jis.domain.Topic;
import com.jis.jis.dto.TopicDTO;

@Mapper(componentModel = "spring")
public interface TopicMapper {

    Topic toTopic(TopicDTO topicDTO);

    TopicDTO toDTO(Topic topic);
}

