package ru.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import ru.service.rest.HealthCheckServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class HealthCheckIntegrationServiceTest {
    @Mock
    HealthCheckServiceImpl healthCheckServiceImpl;

    @Test
    public void getHealthTest() {
        when(healthCheckServiceImpl.getHealth()).thenReturn(Boolean.TRUE);
        HealthCheckIntegrationService healthCheckIntegrationService = new HealthCheckIntegrationService(healthCheckServiceImpl);
        assertEquals(Boolean.TRUE, healthCheckIntegrationService.getHealth(), "Unexpected health");
    }
}