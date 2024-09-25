package com.jis.jis.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    // Personalizar la información del API
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("JIS API")
                    .version("1.0")
                    .description("Documentación de la API para el proyecto JIS")
                    .contact(new Contact()
                        .name("Adrian")
                        .email("adrian@example.com")
                        .url("https://www.example.com")));
    }

    // Agrupación de las APIs si es necesario
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/api/**")
                .build();
    }
}