package ru.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dto.in.MyCriteriaDTO;
import ru.dto.out.MyDTO;
import ru.service.rest.MyServiceImpl;

@Service
@RequiredArgsConstructor
public class MyIntegrationService implements MyService {
    private final MyServiceImpl myServiceImpl;

    @Override
    public MyDTO getMyDto(MyCriteriaDTO criteriaDTO) {
        return myServiceImpl.getMyDto(criteriaDTO);
    }
}
