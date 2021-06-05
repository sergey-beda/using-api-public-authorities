package ru.database.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.database.model.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
