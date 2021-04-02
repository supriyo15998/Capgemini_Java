package day1.lab;
import java.util.*;
public class Excercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int result = calculateDifference(n);
		System.out.println(result);
	}
	private static int calculateDifference(int n) {
		int sumOfSquare = calculateSumOfSquare(n);
		System.out.println("Sum of Square: " + sumOfSquare);
		int squareOfSum = calculateSquareOfSum(n);
		System.out.println("Square of Sum: " + squareOfSum);
		return sumOfSquare - squareOfSum;
	}
	private static int calculateSumOfSquare(int n) {
		int returnVal = 0;
		for(int i=1;i<=n;i++) {
			returnVal += (Math.pow(i, 2));
		}
		return returnVal;
	}
	private static int calculateSquareOfSum(int n) {
		int returnVal = 0;
		for(int i=1;i<=n;i++) {
			returnVal += i;
		}
		return (int)Math.pow(returnVal, 2);
	}

}
