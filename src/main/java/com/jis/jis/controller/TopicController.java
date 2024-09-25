package com.jis.jis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jis.jis.domain.Topic;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/topics")
public class TopicController {

    @Operation(
        summary = "Obtener todos los temas",
        description = "Devuelve una lista de todos los temas en la base de datos.",
        tags = { "Topics" }
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de temas obtenida exitosamente"),
        @ApiResponse(responseCode = "204", description = "No se ha encontrado la Lista de temas"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping
    public ResponseEntity<List<Topic>> getAllTopics() {
        List<Topic> topics = null;// = topicRepository.findAll();
        // if (topics.isEmpty()) {
        //     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        // }
        return new ResponseEntity<>(topics, HttpStatus.OK);
    }

}
