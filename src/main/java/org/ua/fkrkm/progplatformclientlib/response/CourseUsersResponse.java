package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.CourseUsersData;

@Schema(description = "Відповідь отримання користувачів курсу")
@Data
@EqualsAndHashCode(callSuper = true)
public class CourseUsersResponse extends Response<CourseUsersData> {
    public CourseUsersResponse(CourseUsersData data) {
        super(HttpStatus.OK, data);
    }
}
