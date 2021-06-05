package ru.common;

import lombok.Data;
import lombok.experimental.UtilityClass;

@UtilityClass
@Data
public class Constants {

    /**
     * Endpoint base url
     */
    public static final String CONTROLLER_TAG = "/api";


    /**
     * Endpoint HealthCheck
     */
    public static final String HEALTH_CHECK_ENDPOINT = "/health";

    /**
     * Endpoint My
     */
    public static final String MY_ENDPOINT = "/my";

    /**
     * Расположение конфигурации для локального профиля Spring
     */
    public static final String CONFIG_LOCATION_LOCAL = "classpath:application-local.properties";

    /**
     * локальный профиль
     */
    public static final String PROFILE_LOCAL = "local";

    /**
     * parent url
     */
    public static final String PARENT_URL = "/using-api-publicauthorities";

}
