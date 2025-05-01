package org.ua.fkrkm.progplatformclientlib.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Запит для створення завдання")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateExerciseRequest {
    // Назва завдання
    @NotBlank(message = "Не вказано назву!")
    private String name;
    // Опис завдання
    @NotBlank(message = "Не вказано опис!")
    private String description;
    // ID топіку
    private Integer topicId;
}
