package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entity.Topic;

import java.util.List;

@Schema(description = "Відповідь для отримання всіх тем модуля")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAllCourseModules {
    List<Topic> topics;
}
