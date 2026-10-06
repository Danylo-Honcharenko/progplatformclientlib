package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.DeleteTopicData;

@Schema(description = "Відповідь при видалені теми курсу")
@Data
@EqualsAndHashCode(callSuper = true)
public class DeleteTopicResponse extends Response<DeleteTopicData> {
    public DeleteTopicResponse(DeleteTopicData data) {
        super(HttpStatus.OK, data);
    }
}
