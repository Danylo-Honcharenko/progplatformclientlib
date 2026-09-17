package org.ua.fkrkm.progplatformclientlib.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Запит для створення статистики проходження модуля")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetModuleTopicCompletedRequest {
    private Long moduleId;
    private Long topicId;
    private Long userId;
}
