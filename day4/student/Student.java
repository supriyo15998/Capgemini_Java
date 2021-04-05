package day4.student;

public class Student {

	// add property of student
	private int studentId;
	private String studentName;
	private int rollNumber;
	private int[] marksArray;
	int fees;
	// add getters and setters
	
	public int calculateMarks() {
		int totalMarks = 0;
		for(int i=0;i<this.marksArray.length;i++)
		{
			totalMarks += (this.marksArray[i]);
		}
		double percentage = (double) totalMarks / (this.marksArray.length);
		if(percentage > 50.0) {
			this.calculateFees();
		}
		return totalMarks;
	}

	public Student(int studentId, String studentName, int rollNumber, int fees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.fees = fees;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	

	public int[] getMarksArray() {
		return marksArray;
	}

	public void setMarksArray(int[] marksArray) {
		this.marksArray = marksArray;
	}

	/*
	 * trigger if student marks is less than 50 ---->> fees += 50%
	 */
	public void calculateFees() {
		double per = 0.0;
		for(int i=0;i<this.marksArray.length;i++) {
			if(this.marksArray[i] < 50 ) {
				per = 0.5;
			}
		}
		double finalFees = this.fees + (this.fees * (per));
		System.out.println("Revised Fees for " + this.studentName + ": " + finalFees);
	}

}
