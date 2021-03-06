/*
 * Assignment - 9 : 22nd Aug'2021
Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala's : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, printed  "running out of stock" message if a particular item was sold out, or otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those items which are "Out of stock".
3) Create a method which shows only those items which are "Available in stock" & respective quantities.
 */
package shwetaDharmadhikari;

public class Assign9_Shop {
	int maggieQnt = 50;
	int dosaQnt = 43;
	int pouchesQnt = 39;
	int panipuriQnt = 43;
	int masalaQnt = 73;

	void purchaseItem(String product, int qnt) {
		if (product.equals("Maggi")) {
			if (qnt > maggieQnt) {
				System.out.println(product + " :Insufficient stock");
			} else {
				maggieQnt = maggieQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be " + maggieQnt);
			}
		} else if (product.equals("Dosa")) {
			if (qnt > dosaQnt) {
				System.out.println(product + " :Insufficient stock");
			} else {
				dosaQnt = dosaQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be " + dosaQnt);
			}
		} else if (product.equals("Panipuri")) {
			if (qnt > panipuriQnt) {
				System.out.println(product + " :Insufficient stock");
			} else {
				panipuriQnt = panipuriQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be " + panipuriQnt);
			}

		} else if (product.equals("Masala")) {
			if (qnt > masalaQnt) {
				System.out.println(product + " :Insufficient stock");
			} else {
				masalaQnt = masalaQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be " + masalaQnt);
			}
		} else if (product.equals("Pouches")) {
			if (qnt > pouchesQnt) {
				System.out.println(product + " :Insufficient stock");
			} else {
				pouchesQnt = pouchesQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be " + pouchesQnt);
			}
		}
	}

	void outOfStockItem() {
		System.out.println(" ");
		System.out.println("Below items out of stock:");
		if (maggieQnt == 0)
			System.out.println("Maggi");
		if (dosaQnt == 0)
			System.out.println("Dosa");
		if (pouchesQnt == 0)
			System.out.println("Pouches");
		if (panipuriQnt == 0)
			System.out.println("Panipuri");
		if (masalaQnt == 0)
			System.out.println("Panipuri");
		System.out.println(" ");

	}

	void AvailableStockItem() {
		System.out.println("Below items are in stock:");
		if (maggieQnt > 0)
			System.out.println("Maggi: " + maggieQnt);
		if (dosaQnt > 0)
			System.out.println("Dosa: " + dosaQnt);
		if (pouchesQnt > 0)
			System.out.println("Puches: " + dosaQnt);
		if (panipuriQnt > 0)
			System.out.println("Panipuri: " + panipuriQnt);
		if (masalaQnt > 0)
			System.out.println("Masala: " + masalaQnt);

		System.out.println(" ");
	}

	public static void main(String[] df) {
		Assign9_Shop assign9_shop = new Assign9_Shop();
		assign9_shop.purchaseItem("Maggi", 60);
		assign9_shop.purchaseItem("Dosa", 10);
		assign9_shop.purchaseItem("Pouches", 39);
		assign9_shop.purchaseItem("Masala", 33);
		assign9_shop.outOfStockItem();
		assign9_shop.AvailableStockItem();
	}
}
