package npu.domain;

import java.util.ArrayList;

public class Student {
	private String name;
	private int id;
	private Boolean isInternational;
	private Boolean isGraduate;
	private ArrayList<Course> courses;

	public Student() {
	}

	public Student(String name, int id, Boolean isInternational, Boolean isGraduate, ArrayList<Course> courses) {
		super();
		this.name = name;
		this.id = id;
		this.isInternational = isInternational;
		this.isGraduate = isGraduate;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getIsInternational() {
		return isInternational;
	}

	public void setIsInternational(Boolean isInternational) {
		this.isInternational = isInternational;
	}

	public Boolean getIsGraduate() {
		return isGraduate;
	}

	public void setIsGraduate(Boolean isGraduate) {
		this.isGraduate = isGraduate;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

}
