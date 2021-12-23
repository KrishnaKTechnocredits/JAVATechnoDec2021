package jagdish;

public class A9_Assignment_ShopSystem {
	int avaiableQofmaggie = 50;
	int avaiableQofdosa = 43;
	int avaiableQofpouches = 39;
	int avaiableQofpanipuri = 43;
	int avaiableQofmasala = 73;

	void purchaseItem(int reqquestedQ0fmaggie, int reqquestedQ0fdosa, int reqquestedQ0foil, int reqquestedQ0fpanipuri,
			int reqquestedQ0fmasala) {
		if (avaiableQofmaggie >= reqquestedQ0fmaggie) {
			avaiableQofmaggie = avaiableQofmaggie - reqquestedQ0fmaggie;
		} else {
			System.out.println("Insufficient quantity,requested Quantity is " + reqquestedQ0fmaggie
					+ " and avaiable is " + avaiableQofmaggie);
		}

		if (avaiableQofdosa >= reqquestedQ0fdosa) {
			avaiableQofdosa = avaiableQofdosa - reqquestedQ0fdosa;
		} else {
			System.out.println("Insufficient quantity,requested Quantity is " + reqquestedQ0fdosa + " and avaiable is "
					+ avaiableQofdosa);
		}

		if (avaiableQofpouches >= reqquestedQ0foil) {
			avaiableQofpouches = avaiableQofpouches - reqquestedQ0foil;
		} else {
			System.out.println("Insufficient quantity,requested Quantity is " + reqquestedQ0foil + " and avaiable is "
					+ avaiableQofpouches);
		}

		if (avaiableQofpanipuri >= reqquestedQ0fpanipuri) {
			avaiableQofpanipuri = avaiableQofpouches - reqquestedQ0fpanipuri;
		} else {
			System.out.println("Insufficient quantity,requested Quantity is " + reqquestedQ0fpanipuri
					+ " and avaiable is " + avaiableQofpanipuri);
		}

		if (avaiableQofmasala >= reqquestedQ0fmasala) {
			avaiableQofmasala = avaiableQofmasala - reqquestedQ0fmasala;
		} else {
			System.out.println("Insufficient quantity,requested Quantity is " + reqquestedQ0fmasala
					+ " and avaiable is " + avaiableQofmasala);
		}
	}

	void printOutOfStockItem() {
		if (avaiableQofmaggie == 0) {
			System.out.println("Maggie is out of Stock");
		}

		if (avaiableQofdosa == 0) {
			System.out.println("Dosa is out of Stock");
		}

		if (avaiableQofpouches == 0) {
			System.out.println("Oil Pouches is out of Stock");
		}

		if (avaiableQofpanipuri == 0) {
			System.out.println("PaniPuri is out of Stock");
		}

		if (avaiableQofmasala == 0) {
			System.out.println("Masala is out of Stock");
		}

	}

	void printAvailableStockItem() {
		System.out.println("current Maggie stock is: " + avaiableQofmaggie + "");
		System.out.println("current Dosa stock is: " + avaiableQofdosa + "");
		System.out.println("current Oilpouches stock is: " + avaiableQofpouches + "");
		System.out.println("current panipuri stock is: " + avaiableQofpanipuri + "");
		System.out.println("current masala stock is: " + avaiableQofmasala + "");
	}

	public static void main(String[] args) {
		A9_Assignment_ShopSystem shopsystem = new A9_Assignment_ShopSystem();
		shopsystem.purchaseItem(50, 7, 5, 10, 73);
		shopsystem.printAvailableStockItem();
		shopsystem.printOutOfStockItem();
	}
}
