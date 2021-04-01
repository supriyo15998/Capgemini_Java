package day3;

public class Employee {

	private int empId;
	private String empName;
	private int salary;
	private String projectName;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return this.empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	public void workingOnProject() {
		// 1000 lines of code ...
		System.out.println(empName + " working on " + "" + projectName);

	}

}