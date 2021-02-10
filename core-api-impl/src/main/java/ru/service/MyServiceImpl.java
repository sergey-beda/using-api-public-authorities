package ru.service;

import org.springframework.stereotype.Service;
import ru.dto.in.MyCriteriaDTO;
import ru.dto.out.MyDTO;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public MyDTO getMyDto(MyCriteriaDTO criteriaDTO) {return MyDTO.builder().build();}
}
