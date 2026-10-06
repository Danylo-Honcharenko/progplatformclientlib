package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.ErrorData;

@Schema(description = "Відповідь помилки")
@Data
@EqualsAndHashCode(callSuper = true)
public class ErrorResponse extends Response<ErrorData> {
    public ErrorResponse(ErrorData data) {
        this(HttpStatus.INTERNAL_SERVER_ERROR, data);
    }

    public ErrorResponse(HttpStatus status, ErrorData data) {
        super(status, data);
    }
}
