package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteUserFromCourseData {
    private Long userId;
}
