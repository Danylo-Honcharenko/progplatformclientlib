package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Відповідь при видалені курсу")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteCourseResponse {
    private int id;
}
