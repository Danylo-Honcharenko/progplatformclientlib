package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.LogoutData;

@Schema(description = "Відповідь при успішному виході із системе")
@Data
@EqualsAndHashCode(callSuper = true)
public class LogoutResponse extends Response<LogoutData> {
    public LogoutResponse(LogoutData data) {
        super(HttpStatus.OK, data);
    }
}
