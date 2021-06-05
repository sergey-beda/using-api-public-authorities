package ru.dto.out;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;
import ru.dto.common.BaseDTO;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
@Getter
@Setter
@Schema(title = "выходные параметры")
public class MyDTO extends BaseDTO implements Serializable {
    private static final long serialVersionUID = -8786597329833951832L;

    @Schema(description = "id")
    String id;
}
