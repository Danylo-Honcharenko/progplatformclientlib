package org.ua.fkrkm.progplatformclientlib.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Запит на реєстрацію користувача")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationRequest {
    // Імя
    @NotBlank(message = "Не вказано імя!")
    private String firstName;
    // Фамілія
    @NotBlank(message = "Не вказана фамілія!")
    private String lastName;
    // Email
    @NotBlank(message = "Не вказано email!")
    @Email(message = "Неправильно вказано Email!", flags = {Pattern.Flag.CASE_INSENSITIVE})
    private String email;
    // Пароль
    @NotBlank(message = "Не вказано пароль!")
    @Size(min = 7, max = 25, message = "Мінімальна кількість символів має бути 7 а максимальна 25!")
    private String password;
}
