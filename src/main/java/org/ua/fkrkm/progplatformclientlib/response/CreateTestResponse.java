package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.CreateTestData;

@Schema(description = "Відповідь при створенні тесту")
@Data
@EqualsAndHashCode(callSuper = true)
public class CreateTestResponse extends Response<CreateTestData> {
    public CreateTestResponse(CreateTestData data) {
        super(HttpStatus.CREATED, data);
    }
}
