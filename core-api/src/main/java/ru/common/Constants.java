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

}
