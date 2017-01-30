package npu.services;

import java.util.ArrayList;

import npu.domain.*;

public interface TuitionCalculatorService {
	public float computeTuition(Student student, ArrayList<Course> courses);
}
