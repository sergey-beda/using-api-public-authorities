package ru.controller;

import org.springframework.http.ResponseEntity;
import ru.dto.in.MyCriteriaDTO;
import ru.dto.out.MyDTO;

public interface MyController {
    ResponseEntity<MyDTO> getMyDto(MyCriteriaDTO criteriaDTO);
}
