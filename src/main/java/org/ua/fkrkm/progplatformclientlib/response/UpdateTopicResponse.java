package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Schema(description = "Відповідь при оновленні теми")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTopicResponse {
    private int id;
    // Назва теми
    private String name;
    // Опис
    private String description;
    // Час оновлення
    private Date updated;
}
