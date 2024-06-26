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
//			createInstructor(appDAO);
//			findInstructor(appDAO);
//			deleteInstructor(appDAO);
//			findInstructorDetail(appDAO);
			deleteInstructorDetail(appDAO);
		};
	}

	private void deleteInstructorDetail(AppDAO appDAO) {
		int id = 3;
		System.out.println("Deleting InstructorDetail by id: " + id);
		appDAO.deleteInstructorDetailById(id);
		System.out.println("Done!");
	}

	private void findInstructorDetail(AppDAO appDAO) {
		int id = 3;
		// Get the instructorDetail object
		InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(id);

		// Print the InstructorDetail
		System.out.println(tempInstructorDetail);

		// Print the associated Instructor
		System.out.println(tempInstructorDetail.getInstructor());
	}

	private void deleteInstructor(AppDAO appDAO) {
		int id = 1;
		System.out.println("Deleting instructor id: " + id);
		appDAO.deleteInstructorById(id);
		System.out.println("Done!");
	}

	private void findInstructor(AppDAO appDAO) {
		int id = 2;
		System.out.println("Finding instructor with id: " + id);
		Instructor tempInstructor = appDAO.findInstructorById(id);
		System.out.println("tempIsntructor: " + tempInstructor);
		System.out.println("The associated instructorDetails only: "
				+ tempInstructor.getInstructorDetail());
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
