package ru;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@Slf4j
@Generated
@OpenAPIDefinition(info = @Info(title = "my service"))
@SpringBootApplication
public class Application {
    private static final String APP_START = "Application успешно запустился";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info(APP_START);
    }
}
