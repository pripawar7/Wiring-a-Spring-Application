package npu.client;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import npu.domain.*;
import npu.services.StudentCheckoutService;

public class StudentRegisterApplication {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		StudentCheckoutService studentCheckoutService = (StudentCheckoutService) container
				.getBean("studentCheckoutService");
		ArrayList<Course> courses = newCourseList();
		Student student = newStudent(courses);
		studentCheckoutService.checkout(student, courses, "1122334455667788");

	}

	public static Student newStudent(ArrayList<Course> courses) {
		return new Student("John", 1, true, true, courses);
	}

	public static ArrayList<Course> newCourseList() {
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course("CS548", "Engineer", true, 3, 59));
		courses.add(new Course("CH305", "Chemistry", false, 2, 16));
		courses.add(new Course("CS557", "Engineer", true, 3, 45));
		courses.add(new Course("MGT350", "Management", false, 2, 9));
		courses.add(new Course("CH557", "Chemistry", true, 3, 11));
		return courses;
	}
}
