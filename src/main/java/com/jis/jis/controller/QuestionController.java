package com.jis.jis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jis.jis.domain.Question;
import com.jis.jis.dto.QuestionDTO;
import com.jis.jis.dto.TopicQuestionRequestDTO;
import com.jis.jis.service.QuestionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final QuestionService questionService;

    @Operation(
        summary = "Obtener todas las preguntas",
        description = "Devuelve una lista de todas las preguntas en la base de datos.",
        tags = { "Questions" }
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de preguntas obtenida exitosamente"),
        @ApiResponse(responseCode = "204", description = "No se ha encontrado la Lista de preguntas"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions = null;
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @Operation(
        summary = "Obtener preguntas por tema",
        description = "Devuelve una lista de preguntas basadas en los temas y el número de preguntas especificadas.",
        tags = { "Questions" }
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de preguntas obtenida exitosamente"),
        @ApiResponse(responseCode = "400", description = "Solicitud inválida"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @PostMapping(
        value ="/by-topics",
        produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<QuestionDTO>> getQuestionsByTopics(@RequestBody TopicQuestionRequestDTO requests) {
        List<QuestionDTO> questions = questionService.getQuestionsByTopics(requests);
        
        return ResponseEntity.ok(questions);
    }

}
