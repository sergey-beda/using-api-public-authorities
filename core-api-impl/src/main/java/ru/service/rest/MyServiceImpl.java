package ru.service.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dto.in.MyCriteriaDTO;
import ru.dto.out.MyDTO;
import ru.service.MyService;
import ru.service.database.OrderService;

@RequiredArgsConstructor
@Service
public class MyServiceImpl implements MyService {
    private final OrderService orderService;

    @Override
    public MyDTO getMyDto(MyCriteriaDTO criteriaDTO) {
        return MyDTO.builder().id(orderService.count().toString()).build();}
}
