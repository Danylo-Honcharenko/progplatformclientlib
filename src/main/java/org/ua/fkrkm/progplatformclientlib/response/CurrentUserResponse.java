package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.CurrentUserData;

@Schema(description = "Відповідь з інформацією про поточного користувача ")
@Data
@EqualsAndHashCode(callSuper = true)
public class CurrentUserResponse extends Response<CurrentUserData> {
    public CurrentUserResponse(CurrentUserData data) {
        super(HttpStatus.OK, data);
    }
}
