package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.proglatformdao.entity.view.CourseView;
import org.ua.fkrkm.progplatformclientlib.data.CourseData;

import java.util.List;

@Schema(description = "Відповідь для отримання всіх курсів")
@Data
@EqualsAndHashCode(callSuper = true)
public class GetAllCoursesResponse extends Response<List<CourseData>> {

    public GetAllCoursesResponse(List<CourseData> data) {
        super(HttpStatus.OK, data);
    }
}
