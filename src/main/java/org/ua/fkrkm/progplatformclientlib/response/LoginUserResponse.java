package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Schema(description = "Відповідь при успішному вході в систему користувачем")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserResponse {
    private Integer id;
    // Імя
    private String firstName;
    // Фамілія
    private String lastName;
    // Роль
    private String role;
    // Час створення
    private Date created;
}
