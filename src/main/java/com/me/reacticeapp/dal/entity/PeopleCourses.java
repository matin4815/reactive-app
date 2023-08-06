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
@Table(name = "people_courses")
public class PeopleCourses {

    @Id
    @Column("id")
    private Long id;

    @Column("person_id")
    private Long personId;

    @Column("course_id")
    private Long courseId;
}
