package com.johnny.spring.jpacruddemo;

import com.johnny.spring.jpacruddemo.dao.AppDAO;
import com.johnny.spring.jpacruddemo.entity.Instructor;
import com.johnny.spring.jpacruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpacruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpacruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO){
		return runner -> {
			createInstructor(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO) {
		// Create the instructor
//		Instructor tempInstructor =
//				new Instructor(
//						"John",
//						"Robertson",
//						"john@email.com");
//
//		// Create the InstructorDetail
//		InstructorDetail tempInstructorDetail =
//				new InstructorDetail(
//						"http://someurl",
//						"gee-tar");
//
//		// Associate the objects
//		tempInstructor.setInstructorDetail(tempInstructorDetail);
//
//		// Save the Instructor
//		System.out.println("Saving: " + tempInstructor);
//		appDAO.save(tempInstructor);

		Instructor tempInstructor =
				new Instructor(
						"Jekk",
						"Baerr",
						"jekk@baerr.com");

		// Create the InstructorDetail
		InstructorDetail tempInstructorDetail =
				new InstructorDetail(
						"http://fedrul-aygent",
						"fedrul-aygent-stuff");

		// Associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// Save the Instructor
		System.out.println("Saving: " + tempInstructor);
		appDAO.save(tempInstructor);
	}

}
