package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModuleData {
    private Long id;
    private String name;
    private String description;
    private BigDecimal complete;
    private Boolean active;
    private Date created;
    private Date updated;
}
