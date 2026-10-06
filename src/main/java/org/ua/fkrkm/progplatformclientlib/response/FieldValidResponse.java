package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.FieldValidData;

@Schema(description = "Відповідь помилки валідації вхідних параметрів")
@Data
@EqualsAndHashCode(callSuper = true)
public class FieldValidResponse extends Response<FieldValidData> {
    public FieldValidResponse(FieldValidData data) {
        super(HttpStatus.BAD_REQUEST, data);
    }
}
