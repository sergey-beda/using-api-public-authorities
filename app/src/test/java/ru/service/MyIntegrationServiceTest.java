package ru.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import ru.dto.in.MyCriteriaDTO;
import ru.dto.out.MyDTO;
import ru.service.rest.MyServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static ru.utils.MethodTestUtils.generateMyCriteriaDto;

@RunWith(SpringRunner.class)
public class MyIntegrationServiceTest {
    @Mock
    MyServiceImpl myServiceImpl;

    @Test
    public void getHealthTest() {
        MyCriteriaDTO myCriteriaDTO = generateMyCriteriaDto();
        MyDTO myDTO = MyDTO.builder().build();
        when(myServiceImpl.getMyDto(myCriteriaDTO)).thenReturn(myDTO);
        MyIntegrationService myIntegrationService = new MyIntegrationService(myServiceImpl);
        assertEquals(myDTO, myIntegrationService.getMyDto(myCriteriaDTO), "Unexpected getMyDTO");
    }
}