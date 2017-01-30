package npu.services;

import npu.domain.Student;

public class PaymentServiceWellsFargo implements PaymentService {

	@Override
	public void makePayment(Student student, String creditCardNumber) {
		System.out.println("Using the Wells Fargo Bank credit card processor to process credit card number " + creditCardNumber
				+ " for " + student.getName());
	}

}
