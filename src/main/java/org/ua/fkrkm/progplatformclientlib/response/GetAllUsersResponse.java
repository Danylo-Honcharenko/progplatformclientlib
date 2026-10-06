package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.GetAllUsersData;

@Schema(description = "Відповідь для отримання всіх користувачів")
@Data
@EqualsAndHashCode(callSuper = true)
public class GetAllUsersResponse extends Response<GetAllUsersData> {
    public GetAllUsersResponse(GetAllUsersData data) {
        super(HttpStatus.OK, data);
    }
}
