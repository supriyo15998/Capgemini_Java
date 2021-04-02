package day2.lab;

import java.util.*;

public class Excercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int result = getSecondSmallest(arr);
		System.out.println("The second smallest element from the array is: " + result);
	}

	private static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

}
