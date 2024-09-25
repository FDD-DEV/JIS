package com.jis.jis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/api")
public class JISController {


    @Operation(
        tags = { "JIS" }
    )
    @GetMapping(value = "/details")
    public String details(){
        return "details";
    }

}
