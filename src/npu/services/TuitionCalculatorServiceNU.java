package npu.services;

import java.util.ArrayList;

import npu.domain.Course;
import npu.domain.Student;

public class TuitionCalculatorServiceNU implements TuitionCalculatorService {

	@Override
	public float computeTuition(Student student, ArrayList<Course> courses) {
		float tuition = 0;
		for (Course c : courses) {
			if (student.getIsInternational())
				tuition += c.getUnits() * 500;
			else
				tuition += c.getUnits() * 230;
		}
		return tuition;
	}

}
