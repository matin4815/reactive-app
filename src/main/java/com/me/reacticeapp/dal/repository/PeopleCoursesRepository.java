package com.me.reacticeapp.dal.repository;

import com.me.reacticeapp.dal.entity.PeopleCourses;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface PeopleCoursesRepository extends ReactiveCrudRepository<PeopleCourses, Long> {

    Flux<PeopleCourses> findAllByCourseId(Long courseId);
}
