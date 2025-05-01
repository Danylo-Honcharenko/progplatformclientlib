package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Schema(description = "Відповідь створеного курсу")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCourseResponse {
    private Integer id;
    // Назва курсу
    private String name;
    // Опис курсу
    private String description;
    // Час створення
    private Date created;
}
