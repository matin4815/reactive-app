package com.me.reacticeapp.dal.repository;

import com.me.reacticeapp.dal.entity.Course;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends ReactiveCrudRepository<Course, Long> {
}
