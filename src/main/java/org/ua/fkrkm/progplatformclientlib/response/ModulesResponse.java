package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entity.view.ModuleView;

import java.util.List;

@Schema(description = "Відповідь при отриманні модулів")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModulesResponse {
    private List<ModuleView> modules;
}
