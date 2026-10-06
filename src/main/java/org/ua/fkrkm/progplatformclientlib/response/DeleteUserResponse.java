package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.DeleteUserData;

@Schema(description = "Відповідь при видалені користувача")
@Data
@EqualsAndHashCode(callSuper = true)
public class DeleteUserResponse extends Response<DeleteUserData> {
    public DeleteUserResponse(DeleteUserData data) {
        super(HttpStatus.OK, data);
    }
}
