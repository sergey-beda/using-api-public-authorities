package ru.service.database;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.database.repo.OrderRepository;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Long count() {
        return Long.parseLong(String.valueOf(orderRepository.count()));
    }
}
