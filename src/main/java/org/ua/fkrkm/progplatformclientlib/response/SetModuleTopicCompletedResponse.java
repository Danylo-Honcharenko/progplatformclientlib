package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.SetModuleTopicCompletedData;

@Schema(description = "Відповідь при створенні статистики проходження модуля")
@Data
@EqualsAndHashCode(callSuper = true)
public class SetModuleTopicCompletedResponse extends Response<SetModuleTopicCompletedData> {
    public SetModuleTopicCompletedResponse(SetModuleTopicCompletedData data) {
        super(HttpStatus.CREATED, data);
    }
}
