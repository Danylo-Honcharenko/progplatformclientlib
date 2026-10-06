package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.CourseData;

@Schema(description = "Відповідь при отриманні курсу")
@Data
@EqualsAndHashCode(callSuper = true)
public class CourseResponse extends Response<CourseData> {

    public CourseResponse(CourseData data) {
        super(HttpStatus.OK, data);
    }
}
