package swati;

public class A9_Shop {

	int maggieQty = 50;
	int dosaQty = 43;
	int oilQty = 39;
	int paniQty = 43;
	int masalaQty = 73;

	void purchaseItem(String item, int reqQty) {
		if (item.equals("Maggie")) {
			boolean flag = false;
			if (reqQty <= maggieQty) {
				maggieQty = maggieQty - reqQty;
				flag = true;
				System.out.println(reqQty + " Quantity Maggie is available");
			}

			if (flag == false) {
				System.out.println(reqQty + " Quantity Maggie not available");
			}
		}
		// For Dosa
		if (item.equals("Dosa")) {
			boolean flag = false;
			if (reqQty <= dosaQty) {
				dosaQty = dosaQty - reqQty;
				flag = true;
				System.out.println(reqQty + " Quantity Dosa is available");
			}

			if (flag == false) {
				System.out.println(reqQty + " Quantity Dosa not available");
			}
		}

		// For Oil
		if (item.equals("Oil")) {
			boolean flag = false;
			if (reqQty <= oilQty) {
				oilQty = oilQty - reqQty;
				flag = true;
				System.out.println(reqQty + " Quantity Oil is available");
			}

			if (flag == false) {
				System.out.println(reqQty + " Quantity Oil not available");
			}
		}

		// For Panipuri
		if (item.equals("Panipuri")) {
			boolean flag = false;
			if (reqQty <= paniQty) {
				paniQty = paniQty - reqQty;
				flag = true;
				System.out.println(reqQty + " Quantity Panipuri is available");
			}

			if (flag == false) {
				System.out.println(reqQty + " Quantity Panipuri not available");
			}
		}

		// For Masala
		if (item.equals("Masala")) {
			boolean flag = false;
			if (reqQty <= masalaQty) {
				masalaQty = masalaQty - reqQty;
				flag = true;
				System.out.println(reqQty + " Quantity Masala is available");
			}

			if (flag == false) {
				System.out.println(reqQty + " Quantity Masala not available");
			}
		}

	}

	// Print out of stock
	void printOutOfStockItem() {
		if (maggieQty == 0) {
			System.out.println("Quantity for maggie is 0");

		}
		if (dosaQty == 0) {
			System.out.println("Quantity for dosa is 0");
		}
		if (oilQty == 0) {
			System.out.println("Quantity for oil is 0");
		}
		if (paniQty == 0) {
			System.out.println("Quantity for panipuri is 0");
		}
		if (masalaQty == 0) {
			System.out.println("Quantity for masala is 0");
		}
	}

	// Print Available Stock
	void printAvailableStockitem() {
		if (maggieQty > 0) {
			System.out.println(maggieQty + " maggie is avaiable");
		}
		if (dosaQty > 0) {
			System.out.println(dosaQty + " dosa is avaiable");
		}
		if (oilQty > 0) {
			System.out.println(oilQty + " oil is avaiable");
		}
		if (paniQty > 0) {
			System.out.println(paniQty + " panipuri is avaiable");
		}
		if (masalaQty > 0) {
			System.out.println(masalaQty + " masala is avaiable");
		}

	}

	public static void main(String[] args) {

		A9_Shop cust = new A9_Shop();
		cust.purchaseItem("Maggie", 10);
		cust.purchaseItem("Dosa", 10);
		cust.purchaseItem("Oil", 10);
		cust.purchaseItem("Panipuri", 10);
		cust.purchaseItem("Masala", 10);
		cust.purchaseItem("Dosa", 33);
		cust.printOutOfStockItem();
		cust.printAvailableStockitem();

	}

}
