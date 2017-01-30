package npu.domain;

public class Course {
	private String courseName;
	private String deptName;
	private Boolean isGraduate;
	private int units;
	private int enrolled;
	public Course() {
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Course(String courseName, String deptName, Boolean isGraduate, int units, int enrolled) {
		super();
		this.courseName = courseName;
		this.deptName = deptName;
		this.isGraduate = isGraduate;
		this.units = units;
		this.enrolled = enrolled;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Boolean getIsGraduate() {
		return isGraduate;
	}
	public void setIsGraduate(Boolean isGraduate) {
		this.isGraduate = isGraduate;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getEnrolled() {
		return enrolled;
	}
	public void setEnrolled(int enrolled) {
		this.enrolled = enrolled;
	}
	
}
