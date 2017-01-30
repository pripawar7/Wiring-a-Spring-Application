package npu.services;

import java.util.ArrayList;

import npu.domain.Course;
import npu.domain.Student;

public class TuitionCalculatorServiceOSU implements TuitionCalculatorService {

	@Override
	public float computeTuition(Student student, ArrayList<Course> courses) {
		float tuition = 0;
		for (Course c : courses) {
			if (c.getDeptName().equals("Chemistry"))
				tuition += 50;
			tuition += (student.getIsGraduate() ? 120 : 100) * c.getUnits();
		}
		if (student.getIsInternational())
			tuition *= 1.1;
		return tuition;
	}

}
