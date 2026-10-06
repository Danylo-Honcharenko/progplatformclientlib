package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.DeleteCourseData;

@Schema(description = "Відповідь при видалені курсу")
@Data
@EqualsAndHashCode(callSuper = true)
public class DeleteCourseResponse extends Response<DeleteCourseData> {
    public DeleteCourseResponse(DeleteCourseData data) {
        super(HttpStatus.OK, data);
    }
}
