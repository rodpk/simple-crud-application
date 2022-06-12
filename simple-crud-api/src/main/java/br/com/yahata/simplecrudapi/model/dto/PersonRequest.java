package br.com.yahata.simplecrudapi.model.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PersonRequest (
    String name,
    String cpf,
    @JsonProperty("birth_date")
    LocalDate birthDate,
    int age
) {
    
}
