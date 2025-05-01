package org.ua.fkrkm.progplatformclientlib.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entityMongo.Question;

import java.util.List;

@Schema(description = "Запит на створення тесту")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTestRequest {
    @NotBlank(message = "Назва курсу є обов'язковою!")
    private String name;
    @NotNull(message = "Потрібно вказати тему до якої відноситься тест!")
    private Integer topicId;
    private List<Question> questions;
}
