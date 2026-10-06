package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entity.view.ModuleView;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModulesData {
    private List<ModuleView> modules;
}
