package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entity.view.UserView;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseUsersData {
    // ID курсу
    private Long courseId;
    // Назва курсу
    private String courseName;
    // Користувачі курсу
    private List<UserView> users;
}
