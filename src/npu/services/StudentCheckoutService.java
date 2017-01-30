package npu.services;

import java.util.ArrayList;

import npu.domain.*;

public class StudentCheckoutService {
	private PaymentService paymentService;
	private TuitionCalculatorService tuitionCalculatorService;

	public StudentCheckoutService() {
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void setTuitionCalculatorService(TuitionCalculatorService tuitionCalculatorService) {
		this.tuitionCalculatorService = tuitionCalculatorService;
	}

	public void checkout(Student student, ArrayList<Course> courses, String creditCardNumber) {
		student.setCourses(courses);
		for (Course c : courses) {
			c.setEnrolled(c.getEnrolled() + 1);
		}
		float tuition = tuitionCalculatorService.computeTuition(student, courses);
		System.out.println("Tuition fee: $"+tuition);

		paymentService.makePayment(student, creditCardNumber);

	}
}
