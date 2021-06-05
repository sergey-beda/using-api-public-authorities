package ru.rest;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import ru.Application;
import ru.service.HealthCheckIntegrationService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static ru.common.Constants.*;
import static ru.utils.MethodTestUtils.getRequestBuilderGet;

@SpringBootTest(classes = {Application.class})
@PropertySource(CONFIG_LOCATION_LOCAL)
@ActiveProfiles(PROFILE_LOCAL)
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class HealthCheckControllerImplTest {

    @Value("${spring.security.user.name}")
    public String login;

    @Value("${spring.security.user.password}")
    public String password;

    @MockBean
    HealthCheckIntegrationService healthCheckIntegrationService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void healthTest() throws Exception {
        when(healthCheckIntegrationService.getHealth()).thenReturn(Boolean.TRUE);
        mockMvc.perform(getRequestBuilderGet(HEALTH_CHECK_ENDPOINT, login, password, StringUtils.EMPTY))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}