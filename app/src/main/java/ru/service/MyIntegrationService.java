package ru.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.database.service.OrderService;
import ru.dto.in.MyCriteriaDTO;
import ru.dto.out.MyDTO;

@Service
@RequiredArgsConstructor
public class MyIntegrationService implements MyService {
    private final MyServiceImpl myServiceImpl;
    private final OrderService orderService;

    @Override
    public MyDTO getMyDto(MyCriteriaDTO criteriaDTO) {
        orderService.findAll();
        return myServiceImpl.getMyDto(criteriaDTO);
    }
}
