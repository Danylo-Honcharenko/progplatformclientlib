package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTopicData {
    private Long id;
    // Назва теми
    private String name;
    // Опис
    private String description;
    // Час оновлення
    private Date updated;
}
