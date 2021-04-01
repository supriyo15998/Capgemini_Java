package day3;

public class StockTracker {

	public static void main(String[] args) {
		Stock s1 = new Stock("Infosys",1300);
		Stock s2 = new Stock("TCS",1500);
		Stock s3 = new Stock("Capgemini",1600);
		// display the price .
		System.out.println("The stock price of " + s1.getStockName() + " is: " + s1.getStockPrice());
		System.out.println("The stock price of " + s2.getStockName() + " is: " + s2.getStockPrice());
		System.out.println("The stock price of " + s3.getStockName() + " is: " + s3.getStockPrice());
		// call price change method
		s1.changePrice(10, true);
		s2.changePrice(5, false);
		s3.changePrice(20, true);
		System.out.println("=============PRICES CHANGED=============");
		// display the stock details again
		System.out.println("The stock price of " + s1.getStockName() + " is: " + s1.getStockPrice());
		System.out.println("The stock price of " + s2.getStockName() + " is: " + s2.getStockPrice());
		System.out.println("The stock price of " + s3.getStockName() + " is: " + s3.getStockPrice());
	}

}
