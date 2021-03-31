package day1;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter english marks");
		int englishMark = sc.nextInt();
		System.out.println("Enter java marks");
		int java = sc.nextInt();
		System.out.println("Enter db marks");
		int db = sc.nextInt();
		System.out.println("Enter spring tool marks");
		int springTools = sc.nextInt();
		sc.close();
		int totalMarks = englishMark + java + db + springTools;
		double avgMarks = totalMarks / 4;
		System.out.println("Total Marks: " + totalMarks);
		System.out.println(avgMarks);
	}

}
