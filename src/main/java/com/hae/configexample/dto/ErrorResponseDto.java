package com.hae.configexample.dto;

import lombok.Data;

@Data
public class ErrorResponseDto {
    private String message;

    public ErrorResponseDto(String message) {
        this.message = message;
    }
}
