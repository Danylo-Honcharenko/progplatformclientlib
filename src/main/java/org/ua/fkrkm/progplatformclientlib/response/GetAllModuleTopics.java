package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.GetAllModuleTopicsData;

@Schema(description = "Відповідь для отримання всіх тем модуля")
@Data
@EqualsAndHashCode(callSuper = true)
public class GetAllModuleTopics extends Response<GetAllModuleTopicsData> {
    public GetAllModuleTopics(GetAllModuleTopicsData data) {
        super(HttpStatus.OK, data);
    }
}
