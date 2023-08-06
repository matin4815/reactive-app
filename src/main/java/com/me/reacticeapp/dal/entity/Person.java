package com.me.reacticeapp.dal.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "people")
public class Person {

    @Id
    @Column("id")
    private Long id;

    @Column("firstname")
    private String firstname;

    @Column("lastname")
    private String lastname;

    @Column("student_number")
    private int studentNumber;
}
