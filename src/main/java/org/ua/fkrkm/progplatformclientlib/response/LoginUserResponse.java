package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.LoginUserData;

@Schema(description = "Відповідь при успішному вході в систему користувачем")
@Data
@EqualsAndHashCode(callSuper = true)
public class LoginUserResponse extends Response<LoginUserData> {
    public LoginUserResponse(LoginUserData data) {
        super(HttpStatus.OK, data);
    }
}
