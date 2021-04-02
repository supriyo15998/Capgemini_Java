package day1.lab;

import java.util.*;

public class Excercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		boolean result = checkNumber(n);
		if (result) {
			System.out.println(n + " is a power of 2");
		} else {
			System.out.println(n + " is not a power of 2");
		}
	}

	private static boolean checkNumber(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

}
