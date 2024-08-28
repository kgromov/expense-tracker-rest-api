package com.programming.techie.expensetracker.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Expense {
    @Id
    @UuidGenerator
    private String id;
    @Column(name = "name")
    private String expenseName;
    @Column(name ="category")
    private ExpenseCategory expenseCategory;
    @Column(name ="amount")
    private BigDecimal expenseAmount;
}
