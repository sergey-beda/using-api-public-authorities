package ru.database.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@EqualsAndHashCode(of = "id")
@MappedSuperclass
@Data
public abstract class PostgresAbstract implements Serializable {

    private static final long serialVersionUID = -4119497594341506164L;

    @Column(name = "CREATED_TIME")
    private Instant createdTime;

    @Column(name = "UPDATED_TIME")
    private Instant updatedTime;

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "POSTGRES_GEN"
    )
    @SequenceGenerator(
            name = "POSTGRES_GEN",
            sequenceName = "ORDER_sequence",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;
}
