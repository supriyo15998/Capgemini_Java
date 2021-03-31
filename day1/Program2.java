package day1;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter your basic salary");
			int basic = sc.nextInt();
			sc.close();
			double hra = basic * (40.0/100);
			System.out.println("Your Monthly HRA is: " + hra);
			double da = (basic+hra) * (60.0/100);
			System.out.println("Your Monthly DA is: " + da);
			double taxable_yearly = (basic + hra + da)*12;
			System.out.println("Your Annual Total Income is: " + taxable_yearly);
			int tax;
			if(taxable_yearly < 200000) {
				tax = 0;
			}
			else if(taxable_yearly >= 200000 && taxable_yearly < 600000) {
				tax = 10;
			}
			else {
				tax = 20;
			}
			System.out.println("Your Annual Tax Rate is " + tax + "%");
			double annual_take_home = taxable_yearly - (taxable_yearly * (tax/100.0));
			System.out.println("Your Annual Take Home Salary is: " + annual_take_home);
		}
	}

}
