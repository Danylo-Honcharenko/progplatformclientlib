package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Відповідь при видалені користувача з курсу")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteUserFromCourseResponse {
    private int userId;
}
