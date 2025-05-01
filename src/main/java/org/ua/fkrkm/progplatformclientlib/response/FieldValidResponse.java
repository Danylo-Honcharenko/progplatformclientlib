package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Schema(description = "Відповідь помилки валідації вхідних параметрів")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldValidResponse {
    private String message;
    private Map<String, String> details;
}
