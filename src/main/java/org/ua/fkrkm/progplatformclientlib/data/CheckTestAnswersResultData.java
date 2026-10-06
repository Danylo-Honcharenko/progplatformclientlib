package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entityMongo.Question;
import org.ua.fkrkm.proglatformdao.entityMongo.view.AnswerView;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckTestAnswersResultData {
    private Integer maxAssessment;
    private Integer currentAssessment;
    private List<AnswerView> correctAnswers;
    private List<Question> wrongAnswers;
    private Date created;
}
