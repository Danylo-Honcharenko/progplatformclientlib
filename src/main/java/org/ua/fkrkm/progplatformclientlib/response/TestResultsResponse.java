package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.TestResultsData;

@Schema(description = "Відповідь при отримані всіх результатів тестування")
@Data
@EqualsAndHashCode(callSuper = true)
public class TestResultsResponse extends Response<TestResultsData> {
    public TestResultsResponse(TestResultsData data) {
        super(HttpStatus.OK, data);
    }
}
