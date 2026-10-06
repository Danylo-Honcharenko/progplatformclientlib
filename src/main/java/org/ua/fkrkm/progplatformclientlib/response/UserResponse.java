package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.UserData;

@Schema(description = "Відповідь при отриманні даних користувача")
@Data
@EqualsAndHashCode(callSuper = true)
public class UserResponse extends Response<UserData> {
    public UserResponse(UserData data) {
        super(HttpStatus.OK, data);
    }
}
