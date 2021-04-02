package day1.lab;
import java.util.*;
public class Excercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibRecursive(n-1));
		System.out.println(fib(n-1));
		sc.close();
	}
	private static int fibRecursive(int n)
    {
        if (n <= 1)
            return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
	private static int fib(int n)
	{
	    if (n <= 1) {
	        return n;
	    }
	 
	    int previousFib = 0, currentFib = 1;
	    for (int i = 0; i < n - 1; i++)
	    {
	        int newFib = previousFib + currentFib;
	        previousFib = currentFib;
	        currentFib = newFib;
	    }
	 
	    return currentFib;
	}
//0 1 1 2 3 5 8 13
}
