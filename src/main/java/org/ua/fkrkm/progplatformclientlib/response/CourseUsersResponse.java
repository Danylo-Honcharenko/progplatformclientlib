package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entity.view.UserView;

import java.util.List;

@Schema(description = "Відповідь отримання користувачів курсу")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseUsersResponse {
    // ID курсу
    private int courseId;
    // Назва курсу
    private String courseName;
    // Користувачі курсу
    private List<UserView> users;
}
