package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entity.Course;

import java.util.List;

@Schema(description = "Відповідь при отриманні курсів користувача")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCourseResponse {
    List<Course> courses;
}
