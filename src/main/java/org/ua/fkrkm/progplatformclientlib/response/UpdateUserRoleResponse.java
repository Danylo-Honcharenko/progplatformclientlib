package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.UpdateUserRoleData;

@Schema(description = "Відповідь при оновленні ролі користувача")
@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateUserRoleResponse extends Response<UpdateUserRoleData> {
    public UpdateUserRoleResponse(UpdateUserRoleData data) {
        super(HttpStatus.OK, data);
    }
}
