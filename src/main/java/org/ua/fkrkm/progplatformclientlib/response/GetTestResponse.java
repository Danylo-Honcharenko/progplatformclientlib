package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.GetTestData;

@Schema(description = "Відповідь для отримання тесту по ID")
@Data
@EqualsAndHashCode(callSuper = true)
public class GetTestResponse extends Response<GetTestData> {
    public GetTestResponse(GetTestData data) {
        super(HttpStatus.OK, data);
    }
}
