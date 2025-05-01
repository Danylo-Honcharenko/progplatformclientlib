package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entityMongo.view.TestView;

import java.util.List;

@Schema(description = "Відповідь для отримання всіх тестів")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAllTestResponse {
    private List<TestView> test;
}
