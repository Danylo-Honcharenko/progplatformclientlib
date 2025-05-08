package org.ua.fkrkm.progplatformclientlib.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Запит для оновлення паролю користувача")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangePasswordRequest {
    // Email
    @NotBlank(message = "Не вказано email!")
    @Email(message = "Неправильно вказано Email!", flags = {Pattern.Flag.CASE_INSENSITIVE})
    private String email;
    // Старий пароль
    @NotBlank(message = "Не вказано старий пароль!")
    private String oldPassword;
    // Новий пароль
    @NotBlank(message = "Не вказано новий пароль!")
    private String newPassword;
}
