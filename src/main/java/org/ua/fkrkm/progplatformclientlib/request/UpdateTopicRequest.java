package org.ua.fkrkm.progplatformclientlib.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Запит на оновлення теми")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTopicRequest {
    private int id;
    // Назва теми
    private String name;
    // Опис
    private String description;
    // ID курсу
    private Integer courseId;
}
