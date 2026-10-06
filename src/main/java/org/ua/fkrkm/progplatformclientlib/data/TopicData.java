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
public class TopicData {
    // Назва теми
    private String name;
    // Опис теми
    private String description;
    // ID курсу
    private Long courseId;
    // Час створення
    private Date created;
    // Час оновлення
    private Date updated;
}
