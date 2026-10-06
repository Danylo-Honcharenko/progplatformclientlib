package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.CreateUserData;

@Schema(description = "Відповідь при створенні користувача")
@Data
@EqualsAndHashCode(callSuper = true)
public class CreateUserResponse extends Response<CreateUserData> {
    public CreateUserResponse(CreateUserData data) {
        super(HttpStatus.CREATED, data);
    }
}
