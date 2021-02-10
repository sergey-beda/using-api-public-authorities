package ru;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@Slf4j
@SpringBootApplication
public class Application {
    private static final String APP_START = "Application успешно запустился";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info(APP_START);
    }
}
