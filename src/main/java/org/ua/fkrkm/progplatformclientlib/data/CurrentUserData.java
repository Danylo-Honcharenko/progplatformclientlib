package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrentUserData {
    private Long id;
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
