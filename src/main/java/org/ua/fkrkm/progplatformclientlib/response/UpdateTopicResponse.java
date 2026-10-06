package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.UpdateTopicData;

@Schema(description = "Відповідь при оновленні теми")
@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateTopicResponse extends Response<UpdateTopicData> {
    public UpdateTopicResponse(UpdateTopicData data) {
        super(HttpStatus.OK, data);
    }
}
