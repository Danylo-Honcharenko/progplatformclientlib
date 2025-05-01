package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Schema(description = "Відповідь при отриманні теми")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopicResponse {
    // Назва теми
    private String name;
    // Опис теми
    private String description;
    // ID курсу
    private Integer courseId;
    // Час створення
    private Date created;
    // Час оновлення
    private Date updated;
}
