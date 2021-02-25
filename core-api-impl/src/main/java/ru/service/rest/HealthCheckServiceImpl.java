package ru.service.rest;

import org.springframework.stereotype.Service;
import ru.service.HealthCheckService;

@Service
public class HealthCheckServiceImpl implements HealthCheckService {
    @Override
    public Boolean getHealth() {return Boolean.TRUE;}
}
