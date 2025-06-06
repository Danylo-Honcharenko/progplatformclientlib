package org.ua.fkrkm.progplatformclientlib.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Запит на оновлення користувача")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserRequest {
    // Імя
    private String firstName;
    // Фамілія
    private String lastName;
    // Email
    private String email;
}
