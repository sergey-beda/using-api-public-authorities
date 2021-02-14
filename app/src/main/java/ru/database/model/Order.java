package ru.database.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDER")
public class Order extends PostgresAbstract {
    private static final long serialVersionUID = 7706826888360780355L;

    @Column(name = "KADASTR_NUMBER")
    private String kadastrNum;

    @Column(name = "IS_PAID")
    private Boolean isPaid;

    @Column(name = "IS_RESPONSE")
    private Boolean isResponse;
}
