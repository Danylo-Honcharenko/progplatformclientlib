package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entityMongo.view.QuestionView;

import java.util.List;

@Schema(description = "Відповідь для отримання тесту по ID")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTestResponse {
    private String name;
    private List<QuestionView> questions;
    private String created;
}
