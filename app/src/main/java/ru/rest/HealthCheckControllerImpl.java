package ru.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.controller.HealthCheckController;
import ru.service.HealthCheckIntegrationService;

import static ru.common.Constants.CONTROLLER_TAG;
import static ru.common.Constants.HEALTH_CHECK_ENDPOINT;

@RestController
@RequestMapping(CONTROLLER_TAG)
@RequiredArgsConstructor
public class HealthCheckControllerImpl implements HealthCheckController {
    private final HealthCheckIntegrationService healthCheckIntegrationService;

    @Override
    @Operation(
            summary = "Доступность сервиса",
            description = "Получает информацию доступент ли сервис",
            tags = {HEALTH_CHECK_ENDPOINT}
    )
    @ApiResponse(
            responseCode = "200",
            description = "Данные о доступности сервиса"
    )
    @GetMapping(
            value = HEALTH_CHECK_ENDPOINT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> health() {
        return ResponseEntity.ok(healthCheckIntegrationService.getHealth());
    }
}
