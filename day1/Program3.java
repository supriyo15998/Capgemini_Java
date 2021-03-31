package day1;
import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date: ");
		int date = sc.nextInt();
		sc.close();
		if(date<1 || date>31) {
			System.out.println("Invalid Date");
		}
		else if (date >= 11 && date <= 13){
		    System.out.println(date + "th");
		}
		else {
			switch (date % 10) {
				case 1:
					System.out.println(date + "st");
				    break;
				case 2:  
				    System.out.println(date + "nd");
				    break;
				case 3:  
				    System.out.println(date + "rd");
				    break;
				default: 
				    System.out.println(date + "th");
				    break;
				}
			}
		}
	}
