package day1.lab;
import java.util.*;
public class Excercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		long result = getSumOfCubes(n);
		System.out.println(result);
		sc.close();
		
	}
	private static long getSumOfCubes(int n)
	{
		long res = 0;
		while(n > 0) {
			int dig = n%10;
			res += (int)(Math.pow(dig, 3));
			n/=10;
		}
		return res;
	}

}
