package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.ChangePasswordData;

@Schema(description = "Відповідь при успішному оновленні паролю користувача")
@Data
@EqualsAndHashCode(callSuper = true)
public class ChangePasswordResponse extends Response<ChangePasswordData> {
    public ChangePasswordResponse(ChangePasswordData data) {
        super(HttpStatus.OK, data);
    }
}
