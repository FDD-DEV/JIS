package com.jis.jis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jis.jis.domain.Answer;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    @Operation(
        summary = "Obtener todas las respuestas",
        description = "Devuelve una lista de todas las respuestas en la base de datos.",
        tags = { "Answers" }
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de respuestas obtenida exitosamente"),
        @ApiResponse(responseCode = "204", description = "No se ha encontrado la Lista de respuestas"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping
    public ResponseEntity<List<Answer>> getAllQuestions() {
        List<Answer> answers = null;
        return new ResponseEntity<>(answers, HttpStatus.OK);
    }

}
