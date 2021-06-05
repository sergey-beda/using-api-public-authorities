package ru.rest;

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
import ru.dto.in.MyCriteriaDTO;
import ru.dto.out.MyDTO;
import ru.service.MyIntegrationService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static ru.common.Constants.*;
import static ru.utils.MethodTestUtils.*;

@SpringBootTest(classes = {Application.class})
@PropertySource(CONFIG_LOCATION_LOCAL)
@ActiveProfiles(PROFILE_LOCAL)
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class MyControllerImplTest {
    @Value("${spring.security.user.name}")
    public String login;

    @Value("${spring.security.user.password}")
    public String password;

    @MockBean
    MyIntegrationService myIntegrationService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getMyDtoTest() throws Exception {
        MyCriteriaDTO myCriteriaDTO = generateMyCriteriaDto();
        MyDTO myDTO = MyDTO.builder().build();
        String content = buildActionParametersContentString(myCriteriaDTO);
        when(myIntegrationService.getMyDto(myCriteriaDTO)).thenReturn(myDTO);
        mockMvc.perform(getRequestBuilderGet(MY_ENDPOINT, login, password, content))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}