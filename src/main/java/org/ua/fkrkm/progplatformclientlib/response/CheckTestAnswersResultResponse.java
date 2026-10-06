package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.CheckTestAnswersResultData;

@Schema(description = "Відповідь при перевірки тесту")
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckTestAnswersResultResponse extends Response<CheckTestAnswersResultData> {
    public CheckTestAnswersResultResponse(CheckTestAnswersResultData data) {
        super(HttpStatus.OK, data);
    }
}
