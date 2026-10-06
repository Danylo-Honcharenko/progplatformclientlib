package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String roleName;
}
