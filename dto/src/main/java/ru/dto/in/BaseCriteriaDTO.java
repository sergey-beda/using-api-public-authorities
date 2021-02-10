package ru.dto.in;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.dto.common.BaseDTO;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Schema(title = "входные параметры")
public class BaseCriteriaDTO extends BaseDTO {
    private static final long serialVersionUID = -6290182908466970677L;

    @Schema(description = "id")
    @JsonProperty(required = true)
    String id;
}
