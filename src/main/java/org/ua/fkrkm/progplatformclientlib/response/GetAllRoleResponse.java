package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.GetAllRoleData;

@Schema(description = "Відповідь для отримання всіх ролей")
@Data
@EqualsAndHashCode(callSuper = true)
public class GetAllRoleResponse extends Response<GetAllRoleData> {
    public GetAllRoleResponse(GetAllRoleData data) {
        super(HttpStatus.OK, data);
    }
}
