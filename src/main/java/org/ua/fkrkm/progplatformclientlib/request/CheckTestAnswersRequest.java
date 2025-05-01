package org.ua.fkrkm.progplatformclientlib.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entityMongo.view.AnswerView;

import java.util.List;

@Schema(description = "Запит для перевірки тесту")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckTestAnswersRequest {
    private String uuid;
    private Integer userId;
    private List<AnswerView> answers;
}
