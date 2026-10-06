package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.proglatformdao.entity.Course;
import org.ua.fkrkm.progplatformclientlib.data.CourseData;

import java.util.List;

@Schema(description = "Відповідь при отриманні курсів користувача")
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCourseResponse extends Response<List<CourseData>>{

    public UserCourseResponse(List<CourseData> data) {
        super(HttpStatus.OK, data);
    }
}
