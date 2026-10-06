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
public class CreateCourseData {
    private Long id;
    // Назва курсу
    private String name;
    // Опис курсу
    private String description;
    // Час створення
    private Date created;
}
