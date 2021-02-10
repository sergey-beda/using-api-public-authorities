package ru.controller;

import org.springframework.http.ResponseEntity;

public interface HealthCheckController {
    ResponseEntity<Boolean> health();
}
