package org.ua.fkrkm.progplatformclientlib.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Запит на створення теми")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTopicRequest {
    @NotBlank(message = "Назва теми не може бути порожньою!")
    private String name;
    @NotBlank(message = "Опис теми не може бути порожнім!")
    private String description;
    @Min(value = 1, message = "Мінімальний ID модуля 1!")
    private int moduleId;
}
