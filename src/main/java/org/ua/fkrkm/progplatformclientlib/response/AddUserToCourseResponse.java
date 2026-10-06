package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.AddUserToCourseData;

@Schema(description = "Відповідь при додаванні користувача до курсу")
@Data
@EqualsAndHashCode(callSuper = true)
public class AddUserToCourseResponse extends Response<AddUserToCourseData> {
    public AddUserToCourseResponse(AddUserToCourseData data) {
        super(HttpStatus.OK, data);
    }
}
