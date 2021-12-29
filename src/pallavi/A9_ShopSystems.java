/*Assignment - 9 : 22nd Dec'2021
Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation: 
1) purchaseItem() method -> Only one Customer came for shopping, he picked different items with different quantities, print a message “Insufficient stock" if a particular item quantity is less than requested quantity, or otherwise deduct requested quantity from total quantity. 
2) printOutOfStockItem() method-> Create a method which shows only those items which are "Out of stock".
3) printAvailableStockItem() method -> Create a method which shows only those items which are "Available in stock" & respective quantities.

NOTE : Partial selling is not allowed.*/

package pallavi;

public class A9_ShopSystems {
	int maggiepacks = 50;
	int dosapacks = 43;
	int oilpouches = 39;
	int panipuripacks = 43;
	int masalapacks = 73;

	void purchaseItemMaggi(int qty) {
		if (qty <= maggiepacks && qty > 0)
			maggiepacks = maggiepacks - qty;
		else
			System.out.println("Insufficient quantity of Maggie Packets");
	}

	void purchaseItemDosa(int qty) {
		if (qty <= dosapacks && qty > 0)
			dosapacks = dosapacks - qty;
		else
			System.out.println("Insufficient quantity of Dosa Packets");
	}

	void purchaseItemOilPouch(int qty) {
		if (qty <= oilpouches && qty > 0)
			oilpouches = oilpouches - qty;
		else
			System.out.println("Insufficient quantity of Oil Pouches");
	}

	void purchaseItemPanipuri(int qty) {
		if (qty <= panipuripacks && qty > 0)
			panipuripacks = panipuripacks - qty;
		else
			System.out.println("Insufficient quantity of Panipuri Packets");
	}

	void purchaseItemMasala(int qty) {
		if (qty <= masalapacks && qty > 0)
			masalapacks = masalapacks - qty;
		else
			System.out.println("Insufficient quantity of Masala");
	}

	void printOutOfStockItem() {

		if (maggiepacks <= 0)
			System.out.println("Maggie Packets are out of stock");

		if (dosapacks <= 0)
			System.out.println("Dosa Packets are out of stock");

		if (oilpouches <= 0)
			System.out.println("Oil Pouches are out of stock");

		if (panipuripacks <= 0)
			System.out.println("Panipuri Packets are out of stock");

		if (masalapacks <= 0)
			System.out.println("Masala Packets are out of stock");

		if (maggiepacks > 0 || dosapacks > 0 || oilpouches > 0 || panipuripacks > 0 || masalapacks > 0)
			System.out.println("All stock is not over yet");
	}

	void printAavailableOfStockItem() {

		if (maggiepacks > 0)
			System.out.println(maggiepacks + " Packets of Maggie are availale");

		if (dosapacks > 0)
			System.out.println(dosapacks + " Packets of Dosa are available");

		if (oilpouches > 0)
			System.out.println(oilpouches + " Pouches of Oil are available");

		if (panipuripacks > 0)
			System.out.println(panipuripacks + " Packets of Panipuri are available");

		if (masalapacks > 0)
			System.out.println(masalapacks + " Packets of Masal are available");

		if (maggiepacks <= 0 && dosapacks <= 0 && oilpouches <= 0 && panipuripacks <= 0 && masalapacks <= 0)
			System.out.println("Every item is out of stock");
	}

	public static void main(String[] arr) {

		A9_ShopSystems a9_shopSystem = new A9_ShopSystems();
		a9_shopSystem.purchaseItemMaggi(34);
		a9_shopSystem.purchaseItemDosa(29);
		a9_shopSystem.purchaseItemOilPouch(5);
		a9_shopSystem.purchaseItemPanipuri(56);
		a9_shopSystem.purchaseItemMasala(8);
		a9_shopSystem.printOutOfStockItem();
		a9_shopSystem.printAavailableOfStockItem();

	}

}
