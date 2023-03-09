package com.example.kursovayafromsocks.dto.response;


import lombok.Data;

@Data
public class ErrorResponse {
    private final int status;
    private final String error;
    private final String message;
}

