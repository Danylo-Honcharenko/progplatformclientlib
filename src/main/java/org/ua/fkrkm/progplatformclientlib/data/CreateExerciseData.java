package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateExerciseData {
    private Long id;
    // Назва завдання
    private String name;
    // Опис завдання
    private String description;
    // ID топіку
    private Long topicId;
    // Час створення
    private Date created;
}
