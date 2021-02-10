package ru.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.controller.MyController;
import ru.dto.in.MyCriteriaDTO;
import ru.dto.out.MyDTO;
import ru.service.MyIntegrationService;

import static ru.common.Constants.CONTROLLER_TAG;
import static ru.common.Constants.MY_ENDPOINT;

@RestController
@RequestMapping(CONTROLLER_TAG)
@RequiredArgsConstructor
public class MyControllerImpl implements MyController {
    private final MyIntegrationService myIntegrationService;

    @Override
    @Operation(
            summary = "получение моих данных",
            description = "Получает мои данные",
            tags = {MY_ENDPOINT}
    )
    @ApiResponse(
            responseCode = "200",
            description = "мои данные"
    )
    @GetMapping(
            value = MY_ENDPOINT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MyDTO> getMyDto(@RequestBody MyCriteriaDTO criteriaDTO) {
        return ResponseEntity.ok(myIntegrationService.getMyDto(criteriaDTO));
    }
}
