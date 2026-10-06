package org.ua.fkrkm.progplatformclientlib.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ua.fkrkm.proglatformdao.entity.Topic;
import org.ua.fkrkm.proglatformdao.entity.view.TopicView;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAllModuleTopicsData {
    List<TopicView> topics;
}
