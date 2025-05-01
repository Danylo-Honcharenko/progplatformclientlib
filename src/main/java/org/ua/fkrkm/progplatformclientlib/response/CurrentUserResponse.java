package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Відповідь з інформацією про поточного користувача ")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrentUserResponse {
    private int id;
    // Імя
    private String firstName;
    // Фамілія
    private String lastName;
    // Email
    private String email;
    // Роль
    private String role;
    // Рівень
    private int level;
    // Псевдонім рівня
    private String levelAlias;
}
