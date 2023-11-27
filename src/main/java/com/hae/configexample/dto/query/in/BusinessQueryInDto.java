package com.hae.configexample.dto.query.in;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BusinessQueryInDto {
    @NotBlank
    private String code;
}
