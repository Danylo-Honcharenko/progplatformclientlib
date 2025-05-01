package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entity.view.ModuleView;

import java.util.Date;
import java.util.List;

@Schema(description = "Відповідь при отриманні курсу")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {
    private int id;
    // Назва курсу
    private String name;
    // Опис курсу
    private String description;
    // Час створення
    private Date created;
    // Час оновлення
    private Date updated;
    // Модулі
    private List<ModuleView> modules;
}
