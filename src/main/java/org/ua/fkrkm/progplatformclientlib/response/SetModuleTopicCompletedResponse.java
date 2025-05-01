package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Відповідь при створенні статистики проходження модуля")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetModuleTopicCompletedResponse {
    private int id;
    private int moduleId;
    private int topicId;
    private int userId;
}
