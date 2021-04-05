package day4.student;
import java.util.*;
public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int studentId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name");
		String studentName = sc.nextLine();
		System.out.println("Enter Roll Number");
		int studentRollNumber = sc.nextInt();
		System.out.println("Enter Initial Fees");
		int fees = sc.nextInt();
		Student student = new Student(studentId,studentName,studentRollNumber,fees);
		System.out.println("Enter Total Number of Subjects");
		int n = sc.nextInt();
		int subjects[] = new int[n];
		for(int i=0;i<subjects.length;i++) {
			System.out.println("Enter Subject " + (i+1) + " marks");
			subjects[i] = sc.nextInt();
		}
		sc.close();
		student.setMarksArray(subjects);
		System.out.println("Total Marks of the student is: " + student.calculateMarks());
	}

}
