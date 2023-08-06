package com.me.reacticeapp.controller;

import com.me.reacticeapp.dal.entity.Course;
import com.me.reacticeapp.dal.entity.Person;
import com.me.reacticeapp.dto.CourseDto;
import com.me.reacticeapp.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping("")
    public Mono<Course> saveCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @GetMapping("")
    public Flux<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{courseId}")
    public Mono<Course> getCourseById(@PathVariable(name = "courseId") Long courseId) {
        return courseService.getCourseById(courseId);
    }

    @GetMapping("/class/{courseId}")
    public Mono<CourseDto> getClassById(@PathVariable(name = "courseId") Long courseId) {
        return courseService.getClassById(courseId);
    }
}
