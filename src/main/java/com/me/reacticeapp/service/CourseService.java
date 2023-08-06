package com.me.reacticeapp.service;

import com.me.reacticeapp.dal.entity.Course;
import com.me.reacticeapp.dal.entity.PeopleCourses;
import com.me.reacticeapp.dal.repository.CourseRepository;
import com.me.reacticeapp.dal.repository.PeopleCoursesRepository;
import com.me.reacticeapp.dto.CourseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final PeopleCoursesRepository peopleCoursesRepository;

    public Mono<Course> saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public Flux<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Mono<Course> getCourseById(Long courseId) {
        return courseRepository.findById(courseId);
    }

    public Mono<CourseDto> getClassById(Long courseId) {
        Mono<Course> course = courseRepository.findById(courseId);
        Flux<PeopleCourses> peopleInCoursesFlux = peopleCoursesRepository.findAllByCourseId(courseId);

        return null;

    }
}
