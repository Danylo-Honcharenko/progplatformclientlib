package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.GetAllTestData;

@Schema(description = "Відповідь для отримання всіх тестів")
@Data
@EqualsAndHashCode(callSuper = true)
public class GetAllTestResponse extends Response<GetAllTestData> {
    public GetAllTestResponse(GetAllTestData data) {
        super(HttpStatus.OK, data);
    }
}
