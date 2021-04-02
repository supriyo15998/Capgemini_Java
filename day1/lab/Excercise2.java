package day1.lab;

import java.util.*;

public class Excercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		sc.close();
		int det = input.equalsIgnoreCase("red") ? 1
				: (input.equalsIgnoreCase("yellow") ? 2 : (input.equalsIgnoreCase("green") ? 3 : -1));
		switch (det) {
		case 1:
			System.out.println("STOP");
			break;
		case 2:
			System.out.println("SLOW");
			break;
		case 3:
			System.out.println("GO");
			break;
		default:
			System.out.println("WRONG CHOICE");
			break;
		}
	}

}
