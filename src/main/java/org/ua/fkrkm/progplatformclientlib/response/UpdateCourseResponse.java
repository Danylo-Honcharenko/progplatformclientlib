package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.UpdateCourseData;

@Schema(description = "Відповідь при оновленні курсу")
@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateCourseResponse extends Response<UpdateCourseData> {
    public UpdateCourseResponse(UpdateCourseData data) {
        super(HttpStatus.OK, data);
    }
}
