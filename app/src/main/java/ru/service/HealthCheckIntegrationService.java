package ru.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.service.rest.HealthCheckServiceImpl;

@Service
@RequiredArgsConstructor
public class HealthCheckIntegrationService implements HealthCheckService {
    private final HealthCheckServiceImpl healthCheckServiceImpl;

    @Override
    public Boolean getHealth() {return healthCheckServiceImpl.getHealth();}
}
