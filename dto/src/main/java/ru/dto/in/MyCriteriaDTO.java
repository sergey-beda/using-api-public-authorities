package ru.dto.in;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
@Schema(title = "входные параметры")
public class MyCriteriaDTO extends BaseCriteriaDTO implements Serializable {
    private static final long serialVersionUID = -3796483848638690522L;

    @Schema(description = "коментарий")
    @JsonProperty(required = true)
    String comment;
}
