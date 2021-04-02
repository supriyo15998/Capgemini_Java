package day2.lab;

import java.util.*;

public class Excercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		sc.close();
		String finalArr[] = sortStrings(arr);
		for (String str : finalArr)
			System.out.println(str);
	}

	private static String[] sortStrings(String[] str) {
		String[] toReturn = new String[str.length];
		Arrays.sort(str);
		int i = 0;
		String newStr = "";
		for (String currentString : str) {
			String part1 = "";
			String part2 = "";
			if (currentString.length() % 2 == 0) {

				part1 = currentString.substring(0, currentString.length() / 2);
				part2 = currentString.substring(currentString.length() / 2);

			} else {
				part1 = currentString.substring(0, currentString.length() / 2 + 1);
				part2 = currentString.substring(currentString.length() / 2 + 1);
			}
			part1 = part1.toUpperCase();
			newStr = part1 + part2;

			toReturn[i] = newStr;
			i++;

		}
		return toReturn;
	}

}
