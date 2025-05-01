package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entityMongo.Question;
import org.ua.fkrkm.proglatformdao.entityMongo.view.AnswerView;

import java.util.List;

@Schema(description = "Відповідь при перевірки тесту")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckTestAnswersResultResponse {
    private Integer maxAssessment;
    private Integer currentAssessment;
    private List<AnswerView> correctAnswers;
    private List<Question> wrongAnswers;
}
