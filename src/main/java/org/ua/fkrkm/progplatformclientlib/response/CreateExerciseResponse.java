package org.ua.fkrkm.progplatformclientlib.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.ua.fkrkm.progplatformclientlib.data.CreateExerciseData;

@Schema(description = "Відповідь для створенні завдання")
@Data
@EqualsAndHashCode(callSuper = true)
public class CreateExerciseResponse extends Response<CreateExerciseData> {
    public CreateExerciseResponse(CreateExerciseData data) {
        super(HttpStatus.CREATED, data);
    }
}
