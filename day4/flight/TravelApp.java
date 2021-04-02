package day4.flight;
import java.time.LocalDateTime;
import java.util.*;
public class TravelApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/* Write code to call Flight constructor and Flight class setter methods*/
		System.out.println("Enter Flight Number");
		String flightNumber = sc.nextLine();
		System.out.println("Enter Airliner");
		String airliner = sc.nextLine();
		System.out.println("Enter Source City");
		String source = sc.nextLine();
		System.out.println("----Enter Depature Time(24 HR)----");
		System.out.println("Enter Year of Departure Time");
		int yearDep = sc.nextInt();
		System.out.println("Enter Month of Departure Time");
		int monthDep = sc.nextInt();
		System.out.println("Enter Day of Departure Time");
		int dayDep = sc.nextInt();
		System.out.println("Enter Hour of Departure Time");
		int hrDep = sc.nextInt();
		System.out.println("Enter Minute of Departure Time");
		int minDep = sc.nextInt();
		sc.nextLine();
		LocalDateTime flyDateTime = LocalDateTime.of(yearDep,monthDep,dayDep,hrDep,minDep);

		System.out.println("Enter Destination City");
		String destination = sc.nextLine();
		System.out.println("----Enter Arrival Time(24 HR)----");
		System.out.println("Enter Year of Arrival Time");
		int yearArr = sc.nextInt();
		System.out.println("Enter Month of Arrival Time");
		int monthArr = sc.nextInt();
		System.out.println("Enter Day of Arrival Time");
		int dayArr = sc.nextInt();
		System.out.println("Enter Hour of Arrival Time");
		int hrArr = sc.nextInt();
		System.out.println("Enter Minute of Arrival Time");
		int minArr = sc.nextInt();
		LocalDateTime arrivalDateTime = LocalDateTime.of(yearArr,monthArr,dayArr,hrArr,minArr);
		
		
		
		System.out.println("Enter Number of Haults: ");
		int haultNumber = sc.nextInt();
		sc.nextLine();
		Hault[] haults = new Hault[haultNumber];
		for(int i=0;i<haultNumber;i++) {
			System.out.println("Enter Hault " + (i+1) + " Airport Name");
			String haultName = sc.nextLine();
			System.out.println("Enter Hault " + (i+1) + " Duration in Hr");
			int haultDuration = sc.nextInt();
			sc.nextLine();
			haults[i] = new Hault(haultName,haultDuration);
		}
		System.out.println("Enter Fly Type (Domestic/International)");
		String flyTypeString = sc.nextLine();
		
		boolean flyType;
		if(flyTypeString.equalsIgnoreCase("Domestic"))
			flyType = false;
		else
			flyType = true;
		int internationalFlyTax = 0;
		if(flyType)
		{
			System.out.println("Enter International Fly Tax");
			internationalFlyTax = sc.nextInt();
		}
		System.out.println("Enter Base Fair");
		int baseFair = sc.nextInt();
		sc.close();
		Flight flight = 
				new Flight(flightNumber,airliner,source,flyDateTime,
						destination,arrivalDateTime,flyType,internationalFlyTax,baseFair);
		flight.setHault(haults);
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.printFlightDetails(flight);
		
	}

}
