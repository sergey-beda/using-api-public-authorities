package ru.database.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.database.model.Order;
import ru.database.repo.OrderRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Optional<Order> findOrderById(Long id) {
        return orderRepository.findById(id);
    }
}
