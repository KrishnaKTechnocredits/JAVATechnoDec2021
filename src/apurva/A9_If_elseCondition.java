package apurva;

public class A9_If_elseCondition {

	int maggieAvailableStock = 50;
	int dosaAvailableStock = 43;
	int pouchesAvailableStock = 39;
	int panipuriAvailableStock = 43;
	int masalaAvailableStock = 73;

	void purchaseItem(int maggieRequestedQuantity, int dosaRequestedQuantity, int pouchesRequestedQuantity,
			int panipuriRequestedQuantity, int masalaRequestedQuantity) {
		if (maggieRequestedQuantity<= maggieAvailableStock)
			maggieAvailableStock -= maggieRequestedQuantity;
		else
			System.out.println("Insufficient Quantity of maggie is " + maggieRequestedQuantity
					+ " & available quatity is " + maggieAvailableStock);
		if (dosaRequestedQuantity <= dosaAvailableStock)
			dosaAvailableStock -= dosaRequestedQuantity;
		else
			System.out.println("Insufficient Quantity of dosa is " + dosaRequestedQuantity + " & available quantity is "
					+ dosaAvailableStock);
		if (pouchesRequestedQuantity <= pouchesAvailableStock)
			pouchesAvailableStock -= pouchesRequestedQuantity;
		else
			System.out.println("Insufficient Quantity of pouches is " + pouchesRequestedQuantity
					+ " & available quantity is " + pouchesAvailableStock);
		if (panipuriRequestedQuantity <= panipuriAvailableStock)
			panipuriAvailableStock -= panipuriRequestedQuantity;
		else
			System.out.println("Insufficient Quantity of panipuri is " + panipuriRequestedQuantity
					+ " & available quantity is " + panipuriAvailableStock);
		if (masalaRequestedQuantity <= masalaAvailableStock)
			masalaAvailableStock -= masalaRequestedQuantity;
		else
			System.out.println("Insufficient Quantity of masala is " + masalaRequestedQuantity
					+ " & available quantity is " + masalaAvailableStock);
	}

	void printOutOfStockItem() {
		if (maggieAvailableStock == 0)
			System.out.println("Maggie is out of stock");
		if (dosaAvailableStock == 0)
			System.out.println("Dosa is out of stock");
		if (pouchesAvailableStock == 0)
			System.out.println("Pouches is out of stock");
		if (panipuriAvailableStock == 0)
			System.out.println("Panipuri is out of stock");
		if (masalaAvailableStock == 0)
			System.out.println("Masala is out of stock");
	}

	void printAvailableStockItem() {
		if (maggieAvailableStock != 0)
			System.out.println("Maggie is available with quantity: " + maggieAvailableStock);
		if (dosaAvailableStock != 0)
			System.out.println("Dosa is available with quantity: " + dosaAvailableStock);
		if (pouchesAvailableStock != 0)
			System.out.println("Pouches is available with quantity: " + pouchesAvailableStock);
		if (panipuriAvailableStock != 0)
			System.out.println("Panipuri is available with quantity: " + panipuriAvailableStock);
		if (masalaAvailableStock != 0)
			System.out.println("Masala is available with quantity: " + masalaAvailableStock);
	}

	public static void main(String[] args) {
		A9_If_elseCondition customer = new A9_If_elseCondition();
		customer.purchaseItem(25, 15, 20, 43, 23);		
		customer.printOutOfStockItem();
		customer.printAvailableStockItem();
	}
}
