package day4.flight;
public class FlightDetails {

	public void printFlightDetails(Flight flight)
	{
		System.out.println("----FLIGHT DETAILS----");
		System.out.println("Flight Number: " + flight.getFlightNumber());
		System.out.println("Flight Airliner: " + flight.getAirliner());
		System.out.println("Departure City: " + flight.getSource());
		System.out.println("Departure Date & Time: " + flight.getFlyDateTime());
		System.out.println("Arrival City: " + flight.getDestination());
		System.out.println("Arrival Date & Time: " + flight.getArrivalDateTime());
		if(flight.getHault().length == 0) {
			System.out.println("No Haults, Direct " + flight.getSource() + " to " + flight.getDestination());
		}
		else {
			System.out.println("----Halt Details----");
			for(Hault hault:flight.getHault()) {
				System.out.println("Halt Airport: " + hault.getAirportName());
				System.out.println("Halt Duration: " + hault.getDuration() + " hr(s)");
				System.out.println("------------------");
			}
		}
		if(flight.isFlyType())
			System.out.println("International Flight");
		else
			System.out.println("Domestic Flight");
		int totalCost = flight.calculateCost();
		/* Write code to print the flight information and fare break up*/
		System.out.println("Final Price: " + flight.getFinalCost());
		System.out.println("Total Cost: " + totalCost);
	}
}
