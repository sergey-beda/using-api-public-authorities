package ru.service;

import ru.dto.in.MyCriteriaDTO;
import ru.dto.out.MyDTO;

public interface MyService {
    MyDTO getMyDto(MyCriteriaDTO criteriaDTO);
}
