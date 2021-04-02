package day1.lab;
import java.util.*;
public class Excercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printPrimes(n);
	}
	private static void printPrimes(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	private static boolean isPrime(int n)
	{
		if (n <= 1)
            return false;
 
        else if (n == 2)
            return true;
 
        else if (n % 2 == 0)
            return false;
 
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
	}
}
