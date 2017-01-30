package npu.services;
import npu.domain.*;
public interface PaymentService {

	public void makePayment(Student student, String creditCardNumber);
}
