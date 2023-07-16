package com.agrotis.laboratory.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateLaboratoryRequest {

    @NotNull(message = "Id inválido")
    private Long id;

    @NotNull(message = "Nome inválido")
    @NotBlank(message = "Nome não pode estar vazio")
    private String name;

}
