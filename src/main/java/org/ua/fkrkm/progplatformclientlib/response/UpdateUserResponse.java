package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.UpdateUserData;

@Schema(description = "Відповідь при оновленні користувача")
@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateUserResponse extends Response<UpdateUserData> {
    public UpdateUserResponse(UpdateUserData data) {
        super(HttpStatus.OK, data);
    }
}
