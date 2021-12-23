package megha;

public class Megha_Assignment_9 {

	static int maggieAvailableQuantity = 50;
	static int dosaAvailableQuantity = 43;
	static int pouchesAvailableQuantity = 39;
	static int panipuriAvailableQuantity = 43;
	static int masalaAvailableQuantity = 79;

	void purchaseItem(int maggieRequestedQuantity, int dosaRequestedQuantity, int pouchesRequestedQuantity,
			int panipuriRequestedQuantity, int masalaRequestedQuantity) {
		
		if (maggieRequestedQuantity <= maggieAvailableQuantity)
			maggieAvailableQuantity = maggieAvailableQuantity - maggieRequestedQuantity;
		else
			System.out.println("Insufficient Maggie Quantity, Requested Quantity: " + maggieRequestedQuantity + " and Available Quantity is: " + maggieAvailableQuantity);
		
		if (dosaRequestedQuantity <= dosaAvailableQuantity)
			dosaAvailableQuantity = dosaAvailableQuantity - dosaRequestedQuantity;
		else
			System.out.println("Insufficient Dosa Quantity, Requested Quantity: " + dosaRequestedQuantity + " and Available Quantity is: " + dosaAvailableQuantity);
		
		if (pouchesRequestedQuantity <= pouchesAvailableQuantity)
			pouchesAvailableQuantity = pouchesAvailableQuantity - pouchesRequestedQuantity;
		else
			System.out.println("Insufficient Pouches Quantity, Requested Quantity: " + pouchesRequestedQuantity + " and Available Quantity is: " + pouchesAvailableQuantity);
		
		if (panipuriRequestedQuantity <= panipuriAvailableQuantity)
			panipuriAvailableQuantity = panipuriAvailableQuantity - panipuriRequestedQuantity;
		else
			System.out.println("Insufficient Panipuri Quantity, Requested Quantity: " + panipuriRequestedQuantity + " and Available Quantity is: " + panipuriAvailableQuantity);
		
		if (masalaRequestedQuantity <= masalaAvailableQuantity)
			masalaAvailableQuantity = masalaAvailableQuantity - masalaRequestedQuantity;
		else
			System.out.println("Insufficient Masala Quantity, Requested Quantity: " + masalaRequestedQuantity + " and Available Quantity is: " + masalaAvailableQuantity);
		
	}

	void outOfStockItem() {

		if (maggieAvailableQuantity == 0)
			System.out.println("Maggie is sold out");
		if (dosaAvailableQuantity == 0)
			System.out.println("Dosa is sold out");
		if (pouchesAvailableQuantity == 0)
			System.out.println("Pouches is sold out");
		if (panipuriAvailableQuantity == 0)
			System.out.println("Panipuri is sold out");
		if (masalaAvailableQuantity == 0)
			System.out.println("Masala is sold out");

	}

	void printAvailableStockItem() {
		if (maggieAvailableQuantity > 0)
			System.out.println("Maggie is left in stock: " + maggieAvailableQuantity);
		if (dosaAvailableQuantity > 0)
			System.out.println("Dosa is left in stock: " + dosaAvailableQuantity);
		if (pouchesAvailableQuantity > 0)
			System.out.println("Pouches is left in stock: " + pouchesAvailableQuantity);
		if (panipuriAvailableQuantity > 0)
			System.out.println("Panipuri is left in stock: " + panipuriAvailableQuantity);
		if (masalaAvailableQuantity > 0)
			System.out.println("Masala is left in stock: " + masalaAvailableQuantity);
	}
	
	public static void main(String[] args) {
		Megha_Assignment_9 customer = new Megha_Assignment_9();
		customer.purchaseItem(25, 36, 45, 43, 56);
		customer.outOfStockItem();
		customer.printAvailableStockItem();
	}
}
