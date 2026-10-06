package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.ModuleData;

@Schema(description = "Відповідь при отриманні модуля")
@Data
@EqualsAndHashCode(callSuper = true)
public class ModuleResponse extends Response<ModuleData> {
    public ModuleResponse(ModuleData data) {
        super(HttpStatus.OK, data);
    }
}
