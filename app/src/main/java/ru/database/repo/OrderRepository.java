package ru.database.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.database.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
