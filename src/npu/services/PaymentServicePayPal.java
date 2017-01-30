package npu.services;

import npu.domain.Student;

public class PaymentServicePayPal implements PaymentService {

	@Override
	public void makePayment(Student student, String creditCardNumber) {
		System.out.println("Using the PayPal credit card processor to process credit card number "
				+ creditCardNumber + " for " + student.getName());

	}

}
