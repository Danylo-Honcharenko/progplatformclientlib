package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Schema(description = "Відповідь при отримані всіх результатів тестування")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestResultsResponse {
    private List<CheckTestAnswersResultResponse> results;
}
