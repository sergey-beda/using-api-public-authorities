package ru.dto.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(title = "базовая DTO")
public class BaseDTO {
    private static final long serialVersionUID = 2184744304143779102L;
}
