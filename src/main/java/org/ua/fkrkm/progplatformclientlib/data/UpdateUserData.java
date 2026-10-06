package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserData {
    // Імя
    private String firstName;
    // Фамілія
    private String lastName;
    // Email
    private String email;
    // Роль
    private String role;
    // Час створення
    private Date created;
    // Час оновлення
    private Date updated;
}
