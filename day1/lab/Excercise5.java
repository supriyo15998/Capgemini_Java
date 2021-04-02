package day1.lab;
import java.util.*;
public class Excercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int result = calculateSum(n);
		System.out.println(result);
	}
	private static int calculateSum(int n)
	{
		int returnVal = 0;
		for(int i=1;i<=n;i++) {
			if (i%3 == 0 || i%5 == 0) {
				returnVal += i;
			}
		}
		return returnVal;
	}

}
