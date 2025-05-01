package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Schema(description = "Відповідь при створенні теми")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTopicResponse {
    private int id;
    // Назва теми
    private String name;
    // Опис теми
    private String description;
    // Час створення
    private Date created;
}
