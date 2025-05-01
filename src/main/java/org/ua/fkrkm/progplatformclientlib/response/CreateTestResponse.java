package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entityMongo.view.QuestionView;

import java.util.List;

@Schema(description = "Відповідь при створенні тесту")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTestResponse {
    private String uuid;
    private String name;
    private Integer topicId;
    private List<QuestionView> questions;
    private String created;
}
