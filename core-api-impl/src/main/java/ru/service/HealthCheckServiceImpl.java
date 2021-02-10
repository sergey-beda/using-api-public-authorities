package ru.service;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckServiceImpl implements HealthCheckService {
    @Override
    public Boolean getHealth() {return Boolean.TRUE;}
}
