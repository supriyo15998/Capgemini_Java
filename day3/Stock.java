package day3;

public class Stock {
	private String stockName; // infosys
	private double stockPrice; // 1300

	public Stock(String stockName, int stockPrice) {
		this.stockName = stockName;
		this.stockPrice = stockPrice;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	public void changePrice(float percentageChange, boolean action) {

		if (action) {

			this.stockPrice += this.stockPrice * (percentageChange / 100.0);

		} else {

			this.stockPrice -= this.stockPrice * (percentageChange / 100.0);
		}
	}
}
