package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.CreateTopicData;

@Schema(description = "Відповідь при створенні теми")
@Data
@EqualsAndHashCode(callSuper = true)
public class CreateTopicResponse extends Response<CreateTopicData> {
    public CreateTopicResponse(CreateTopicData data) {
        super(HttpStatus.CREATED, data);
    }
}
