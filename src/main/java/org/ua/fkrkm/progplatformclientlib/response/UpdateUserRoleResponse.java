package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Відповідь при оновленні ролі користувача")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserRoleResponse {
    private int userId;
    private String userEmail;
    private String newRoleName;
    private String oldRoleName;
}
