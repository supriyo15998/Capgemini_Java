package day4.flight;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Flight {

	private String flightNumber;
	private String airliner;

	private String source;
	private LocalDateTime flyDateTime;

	private String destination;
	private LocalDateTime arrivalDateTime;

	private Hault[] hault; // can be null;

	private boolean flyType; // domestic (false) or international(true)
	private int internationFlyTax;

	private int baseFair; // always include 5% as airport surcharge and 30% as fuel cost
	private int finalCost;// based on Airliner calendar and other criteria's

	public Flight(String flightNumber, String airliner, String source, LocalDateTime flyDateTime, String destination,
			LocalDateTime arrivalDateTime, boolean flyType, int internationFlyTax, int baseFair) {
		super();
		this.flightNumber = flightNumber;
		this.airliner = airliner;
		this.source = source;
		this.flyDateTime = flyDateTime;
		this.destination = destination;
		this.arrivalDateTime = arrivalDateTime;
		this.flyType = flyType;
		this.internationFlyTax = internationFlyTax;
		this.baseFair = baseFair;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirliner() {
		return airliner;
	}

	public void setAirliner(String airliner) {
		this.airliner = airliner;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public LocalDateTime getFlyDateTime() {
		return flyDateTime;
	}

	public void setFlyDateTime(LocalDateTime flyDateTime) {
		this.flyDateTime = flyDateTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public Hault[] getHault() {
		return hault;
	}

	public void setHault(Hault[] hault) {
		this.hault = hault;
	}

	public boolean isFlyType() {
		return flyType;
	}

	public void setFlyType(boolean flyType) {
		this.flyType = flyType;
	}

	public int getInternationFlyTax() {
		return internationFlyTax;
	}

	public void setInternationFlyTax(int internationFlyTax) {
		this.internationFlyTax = internationFlyTax;
	}

	public int getBaseFair() {
		return baseFair;
	}

	public void setBaseFair(int baseFair) {
		this.baseFair = baseFair;
	}

	public int getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(int finalCost) {
		this.finalCost = finalCost;
	}

	public int calculateCost() {
		int finalCost = 0;
		/*
		 * Cost of the flight will be decided by 1. arrival date. :- 1.a) If 10 to 2
		 * days prior to the AirlinerCalendar Date :- 20% extra 1.b) If 1 to 0 day prior
		 * to the AirlinerCalendar Date :- 50% extra 2. arrival time. 2.a) If flight
		 * land time is 2 hr +/- to 12:00 Noon (Any Date) :- 10% extra 3. Non free
		 * travel countries (List of FriendlyCountry.java) 3.a) If destination belongs
		 * to non free travel, friendly country :- 30% extra
		 */
		AirlinerCalendar airlinerCalendar = new AirlinerCalendar();
		int finalFareHoliday = 0;
		int finalFareTime = 0;
		int finalFareCountry = 0;
		double percentageDate = 0;
		for (LocalDate holiday : airlinerCalendar.listOfHolidays) {

			long durationInDays = ChronoUnit.DAYS.between(holiday, this.getFlyDateTime().toLocalDate());
			durationInDays *= -1;

			if (durationInDays <= 10 && durationInDays >= 2) {

				percentageDate = 0.20;
				break;

			} else if (durationInDays <= 1 && durationInDays >= 0) {

				percentageDate = 0.50;
				break;
			}

		}

		finalFareHoliday = (int) (this.getBaseFair() * percentageDate);
		this.setFinalCost(this.baseFair + finalFareHoliday);
		double percentageTime = 0;
		if (this.getArrivalDateTime().toLocalTime().getHour() >= 10
				|| this.getArrivalDateTime().toLocalTime().getHour() <= 14) {
			percentageTime = 0.10;
			finalFareTime = (int) (this.getBaseFair() * percentageTime);

		}
		this.setFinalCost(this.getFinalCost() + finalFareTime);
		FriendlyCountry f = new FriendlyCountry();
		double percentageCountry = 0;
		for (String fCountry : f.countries) {
			if (this.getDestination().equalsIgnoreCase(fCountry)) {
				percentageCountry = 0.0;
			} else {
				percentageCountry = 0.30;
			}
		}
		finalFareCountry = (int) (this.getBaseFair() * percentageCountry);
		this.setFinalCost(this.getFinalCost()+finalFareCountry);
		this.setFinalCost(this.getFinalCost()+this.internationFlyTax);
		finalCost = this.getFinalCost();
		System.out.println("-----FARE BREAKUP-----");
		System.out.println("Base Fare: " + this.getBaseFair() + " (Includes 5% ( " + (this.getBaseFair() * (5.0 / 100))
				+ ") as airport surcharge and 30% (" + (this.getBaseFair() * (30.0 / 100)) + ") as fuel cost)");
		System.out.println("Nearby Holiday Charge: (" + (percentageDate*100) +"%)" + finalFareHoliday);
		System.out.println("Arrival Time Charge: (" + (percentageTime*100) +"%)" + finalFareTime); 
		System.out.println("Friendly Country Charge: (" + percentageCountry*1000 + "%)" + finalFareCountry);
		System.out.println("International FLY Tax: " + this.internationFlyTax);// up to this is okay
		return finalCost;
	}

}
