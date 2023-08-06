package com.me.reacticeapp.dto;

import com.me.reacticeapp.dal.entity.Person;
import lombok.Data;

import java.util.List;

@Data
public class CourseDto {

    private Long id;

    private String name;

    private List<Person> students;
}
