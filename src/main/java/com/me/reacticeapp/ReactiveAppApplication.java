package com.me.reacticeapp;

import com.me.reacticeapp.dal.entity.Course;
import com.me.reacticeapp.dal.entity.PeopleCourses;
import com.me.reacticeapp.dal.entity.Person;
import com.me.reacticeapp.dal.repository.PeopleCoursesRepository;
import com.me.reacticeapp.service.CourseService;
import com.me.reacticeapp.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class ReactiveAppApplication {

	Random random = new Random();

	public static void main(String[] args) {
		SpringApplication.run(ReactiveAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PersonService personService
			, CourseService courseService
			, PeopleCoursesRepository peopleCoursesRepository) {
		return args -> {
			for (int i=0; i<100; i++) {
				personService.savePerson(
						Person.builder()
								.firstname("Firstname " + i)
								.lastname("Lastname" + i)
								.studentNumber(i)
								.build()).subscribe();
			}
			for (int i=0; i<50; i++) {
				courseService.saveCourse(
						Course.builder()
								.name("Course " + i)
								.build()
								).subscribe();
			}
			for(int i=0; i<200; i++) {
				peopleCoursesRepository.save(
						PeopleCourses.builder()
								.personId((long) (random.nextInt(100) + 1))
								.courseId((long)(random.nextInt(50) + 1))
								.build()
								).subscribe();
			}
		};
	}
}
