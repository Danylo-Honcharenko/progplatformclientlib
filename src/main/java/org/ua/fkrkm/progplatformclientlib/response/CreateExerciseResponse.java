package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Schema(description = "Відповідь для створенні завдання")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateExerciseResponse {
    private int id;
    // Назва завдання
    private String name;
    // Опис завдання
    private String description;
    // ID топіку
    private Integer topicId;
    // Час створення
    private Date created;
}
