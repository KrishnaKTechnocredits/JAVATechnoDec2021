package nehaPandey;

public class A9_Shop_Management {

	int maggie, dosa, oil, panipuri, masala;

	void purchaseItem(int quantity, String product) {

		if (quantity <= maggie && product == "Maggie") {
			maggie = maggie - quantity;

		} else if (quantity <= dosa && product == "Dosa") {
			dosa = dosa - quantity;

		} else if (quantity <= oil && product == "Oil") {
			oil = oil - quantity;

		}

		else if (quantity <= panipuri && product == "Panipuri") {
			panipuri = panipuri - quantity;

		}

		else if (quantity <= masala && product == "Masala") {
			masala = masala - quantity;

		} else {
			System.out.println("Insufficient " + product);
			System.out.println();
		}

	}

	void printOutOfStockItem() {
		if (maggie == 0) {
			System.out.println("Maggie out of stock");

		}
		if (dosa == 0) {
			System.out.println("Dosa out of stock");

		}
		if (oil == 0) {
			System.out.println("Oil out of stock");

		}
		if (panipuri == 0) {
			System.out.println("Panipuri out of stock");

		}
		if (masala == 0) {

			System.out.println("Masala out of stock");

		}

	}

	void printAvailableStockItem() {

		if (maggie > 0) {
			System.out.println("Maggie in stock and " + "Quantity left: " + maggie);
		}
		if (dosa > 0) {
			System.out.println("Dosa in stock and " + "Quantity left: " + dosa);
		}
		if (panipuri > 0) {
			System.out.println("Panipuri in stock and " + "Quantity left: " + panipuri);
		}
		if (oil > 0) {
			System.out.println("Oil in stock and " + "Quantity left: " + oil);
		}
		if (masala > 0) {
			System.out.println("Masala in stock and " + "Quantity left: " + masala);
		}
		System.out.println();
	}

	void itemInitialStock(int x, int y, int z, int u, int i) {

		maggie = x;
		dosa = y;
		oil = z;
		panipuri = u;
		masala = i;
		displayInitialStock();

	}

	void displayInitialStock() {
		System.out.println("Total maggie quantity: " + maggie);
		System.out.println("Total dosa quantity: " + dosa);
		System.out.println("Total oil quantity: " + oil);
		System.out.println("Total panipuri quantity: " + panipuri);
		System.out.println("Total masala quantity: " + masala);
		System.out.println();
	}

	public static void main(String[] args) {
		A9_Shop_Management customerOne = new A9_Shop_Management();
		customerOne.itemInitialStock(40, 30, 35, 42, 50);
		customerOne.purchaseItem(42, "Maggie");
		customerOne.purchaseItem(30, "Dosa");
		customerOne.purchaseItem(20, "Oil");
		customerOne.purchaseItem(40, "Maggie");
		customerOne.purchaseItem(21, "Panipuri");
		customerOne.purchaseItem(30, "Masala");
		customerOne.printAvailableStockItem();
		customerOne.printOutOfStockItem();

	}

}
