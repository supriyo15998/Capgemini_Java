package day1.lab;

import java.util.*;

public class Excercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		boolean isIncreasing = checkNumber(n);
		if (isIncreasing) {
			System.out.println(n + " is an increasing number");
		} else {
			System.out.println(n + " is not an increasing number");
		}
	}

	private static boolean checkNumber(int n) {
		int temp = n; // 1428
		int last = 10; // 10
		while (temp > 0) {
			int unit = temp % 10; // 4
			if (unit > last)
				return false;
			last = unit; // 2
			temp /= 10; // 14
		}
		return true;
	}

}
