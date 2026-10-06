package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.ModulesData;

@Schema(description = "Відповідь при отриманні модулів")
@Data
@EqualsAndHashCode(callSuper = true)
public class ModulesResponse extends Response<ModulesData> {
    public ModulesResponse(ModulesData data) {
        super(HttpStatus.OK, data);
    }
}
