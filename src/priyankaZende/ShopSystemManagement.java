package priyankaZende;

public class ShopSystemManagement {

	int stocksOfMaggie;
	int stocksOfDosa;
	int stocksOfOilPouches;
	int stocksOfPanipuri;
	int stocksOfMasalas;

	void setInitialStocks(int initialStocksOfMaggie, int initialStocksOfDosa, int initialStocksOfOilPouches,
			int initialStocksOfPanipuri, int initialStocksOfMasalas) {
		stocksOfMaggie = initialStocksOfMaggie;
		stocksOfDosa = initialStocksOfDosa;
		stocksOfOilPouches = initialStocksOfOilPouches;
		stocksOfPanipuri = initialStocksOfPanipuri;
		stocksOfMasalas = initialStocksOfMasalas;
	}

	void purchaseItem(int maggieOrdered, int dosaOrdered, int oilPouchesOrdered, int panipuriOrdered,
			int malalasOrdered) {
		System.out.println("Customer purcheases Item as: ");
		if (maggieOrdered <= stocksOfMaggie) {
			stocksOfMaggie = stocksOfMaggie - maggieOrdered;
			System.out.println("Maggie : " + maggieOrdered);
		} else
			System.out.println("Maggie : Insufficient stock");
		if (dosaOrdered <= stocksOfDosa) {
			stocksOfDosa = stocksOfDosa - dosaOrdered;
			System.out.println("Dosa : " + dosaOrdered);
		} else
			System.out.println("Dosa : Insufficient stock");
		if (oilPouchesOrdered <= stocksOfOilPouches) {
			stocksOfOilPouches = stocksOfOilPouches - oilPouchesOrdered;
			System.out.println("Oil Pouches : " + oilPouchesOrdered);
		} else
			System.out.println("Oil Pouches : Insufficient stock");
		if (panipuriOrdered <= stocksOfPanipuri) {
			stocksOfPanipuri = stocksOfPanipuri - panipuriOrdered;
			System.out.println("Panipuri : " + panipuriOrdered);
		} else
			System.out.println("Panipuri : Insufficient stock");
		if (malalasOrdered <= stocksOfMasalas) {
			stocksOfMasalas = stocksOfMasalas - malalasOrdered;
			System.out.println("Masala : " + malalasOrdered);
		} else
			System.out.println("Masala : Insufficient stock");
		System.out.println("------------------------");
	}

	void printOutOfStockItem() {
		System.out.println("Print out of stock item: ");
		if (stocksOfMaggie == 0)
			System.out.println("Maggie is Out of stock.");
		if (stocksOfDosa == 0)
			System.out.println("Dosa is Out of stock.");
		if (stocksOfOilPouches == 0)
			System.out.println("Oil Pouches is Out of stock.");
		if (stocksOfMasalas == 0)
			System.out.println("Masala is Out of stock.");
		System.out.println("------------------------");
	}

	void printAvailableStockItem() {
		System.out.println("Available Items in stock :");
		if (stocksOfMaggie > 0)
			System.out.println("Maggie is available in stock " + stocksOfMaggie);
		if (stocksOfDosa > 0)
			System.out.println("Dosa is available in stock " + stocksOfDosa);
		if (stocksOfOilPouches > 0)
			System.out.println("Oil Pouches is available in stock " + stocksOfOilPouches);
		if (stocksOfMasalas > 0)
			System.out.println("Masala is available in stock " + stocksOfMasalas);
		System.out.println("------------------------");
	}

	public static void main(String[] args) {
		ShopSystemManagement shopSystemManagement = new ShopSystemManagement();
		shopSystemManagement.setInitialStocks(50, 43, 39, 43, 73);
		shopSystemManagement.purchaseItem(45, 43, 20, 45, 10);
		shopSystemManagement.printOutOfStockItem();
		shopSystemManagement.printAvailableStockItem();
	}

}
