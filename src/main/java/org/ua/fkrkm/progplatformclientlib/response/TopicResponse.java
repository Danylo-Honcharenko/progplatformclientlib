package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.TopicData;

@Schema(description = "Відповідь при отриманні теми")
@Data
@EqualsAndHashCode(callSuper = true)
public class TopicResponse extends Response<TopicData> {
    public TopicResponse(TopicData data) {
        super(HttpStatus.OK, data);
    }
}
