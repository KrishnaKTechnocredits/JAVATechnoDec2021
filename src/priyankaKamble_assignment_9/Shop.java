package priyankaKamble_assignment_9;

/***
 * Assignment - 9 : Create a system (Shop) which maintains each item's quantity.
 * 
 * a. Initial stocks of Maggie: 50 Maggie packets b. Initial stocks of Dosa : 43
 * packets c. Initial stocks of pouches : 39 oil packets d. Initial stocks of
 * panipuri : 43 packets e. Initial stocks of masala’s : 73 packets.
 * 
 * Expectation: 1) purchaseItem() method -> Only one Customer came for shopping,
 * he picked different items with different quantities, print a message
 * “Insufficient stock" if a particular item quantity is less than requested
 * quantity, or otherwise deduct requested quantity from total quantity.
 * 2)printOutOfStockItem() method-> Create a method which shows only those items
 * which are "Out of stock". 3) printAvailableStockItem() method -> Create a
 * method which shows only those items which are "Available in stock" &
 * respective quantities. NOTE : Partial selling is not allowed.
 */
public class Shop {
	static int inMaggie = 50, inDosa = 43, inPouches = 39, inPanipuri = 43, inMasala = 73;

	void initialStock() {
		System.out.println("Initial Maggie Packets are = " + inMaggie);
		System.out.println("Initial Dosa Packets are = " + inDosa);
		System.out.println("Initial Oil Packets are = " + inPouches);
		System.out.println("Initial Panipuri Packets are = " + inPanipuri);
		System.out.println("Initial Masala Packets are = " + inMasala);
	}
	

	void purchaseItem(int maggieQuan, int dosaQuan, int pouchQuan, int panipuriQuan, int masalaQuan) {
		System.out.println("Order List of Customer ");
		System.out.println("\nMaggie Quantity = "+maggieQuan+"\nDosa Quantity"+dosaQuan+"\nOil Quantity"+pouchQuan+"\npanipuri Quantity"+panipuriQuan+"\nMasala Quantity"+masalaQuan+"\n");
		
		System.out.println("\n******************** Maggie Sesion ********************");
		if (maggieQuan > 0 && maggieQuan <= inMaggie) {
			inMaggie = inMaggie - maggieQuan; // printAvailableStockItem();
			System.out.println("Available Maggie packets = " + inMaggie);
			printOutOfStockItem();
		} else if (maggieQuan > inMaggie) {
			System.out.println("Ordered Maggie packtes - " + maggieQuan
					+ "\n ********Partial seeling is not allowed , Order for lesser quantity********");
		} else if (maggieQuan < 0) {
			System.out.println(" Please enter correct quantity");
		} else if (maggieQuan == 0)
			System.out.println(" Customer have not order Maggie Packets");

		System.out.println("\n******************** Dosa Sesion ********************");
		if (dosaQuan > 0 && dosaQuan <= inDosa) {
			inDosa = inDosa - dosaQuan; // printAvailableStockItem();
			System.out.println("Available Dosa packets = " + inDosa);
			printOutOfStockItem();
		} else if (dosaQuan > inDosa) {
			System.out.println("Ordered dosa packtes - " + dosaQuan
					+ "\n ********Partial seeling is not allowed , Order for lesser quantity********");
		} else if (dosaQuan < 0) {
			System.out.println(" Please enter correct quantity");
		} else if (dosaQuan == 0)
			System.out.println(" Customer have not order Dosa Packets");

		System.out.println("\n******************** Pouch Sesion ********************");
		if (pouchQuan > 0 && pouchQuan <= inPouches) {
			inPouches = inPouches - pouchQuan; // printAvailableStockItem();
			System.out.println("Available Oil packets = " + inPouches);
			printOutOfStockItem();
		} else if (pouchQuan > inPouches) {
			System.out.println("Ordered Oil packtes - " + pouchQuan
					+ "\n ********Partial seeling is not allowed , Order for lesser quantity********");
		} else if (pouchQuan < 0) {
			System.out.println(" Please enter correct quantity");
		} else if (pouchQuan == 0)
			System.out.println(" Customer have not order Oil Packets");

		System.out.println("\n******************** Panipuri Sesion ********************");
		if (panipuriQuan > 0 && panipuriQuan <= inPanipuri) {
			inPanipuri = inPanipuri - panipuriQuan; // printAvailableStockItem();
			System.out.println("Available Panipuri Packets= " + inPanipuri);
			printOutOfStockItem();
		} else if (panipuriQuan > inPanipuri) {
			System.out.println("Ordered Panipuri packtes - " + panipuriQuan
					+ "\n ********Partial seeling is not allowed , Order for lesser quantity********");
		} else if (panipuriQuan < 0) {
			System.out.println(" Please enter correct quantity");
		} else if (panipuriQuan == 0)
			System.out.println(" Customer have not order Panipuri Packets");

		System.out.println("\n******************** Masala Sesion ********************");
		if (masalaQuan > 0 && masalaQuan <= inMasala) {
			inMasala = inMasala - masalaQuan; // printAvailableStockItem();
			System.out.println("Available Masala Packets= " + inMasala);
			printOutOfStockItem();
		} else if (masalaQuan > inMasala) {
			System.out.println("Ordered Masala packtes - " + masalaQuan
					+ "\n ********Partial seeling is not allowed , Order for lesser quantity********");
		} else if (masalaQuan < 0) {
			System.out.println(" Please enter correct quantity");
		} else if (masalaQuan == 0)
			System.out.println(" Customer have not order Masala Packets");
	}

	void printOutOfStockItem() {
		if (inMaggie == 0 )
			System.out.println("***Maggie out of stock***");
		if (inDosa == 0)
			System.out.println("***Dosa out of stock***");
		if (inPouches == 0)
			System.out.println("***Oil Packets out of stock***");
		if (inPanipuri == 0)
			System.out.println("***Panipuri Packets out of stock***");
		if (inMasala == 0)
			System.out.println("***Masala Packets out of stock***");
	}

	void printAvailableStockItem() {
		System.out.println("\n************************** Available Stock **************************");
		if (inMaggie != 0)
			System.out.println("Maggie packets = " + inMaggie);
		if (inDosa != 0)
			System.out.println("Dosa packets = " + inDosa);
		if (inPouches != 0)
			System.out.println("oil  packets = " + inPouches);
		if (inPanipuri != 0)
			System.out.println("Panipuri  packets = " + inPanipuri);
		if (inMasala != 0)
			System.out.println("Masala  packets = " + inMasala);
	}
	
		
	public static void main(String[] args) {
		Shop shop = new Shop();
		
		shop.initialStock();
		System.out.println("");
		shop.purchaseItem(40, 75, 39, -30, 0);
		shop.printAvailableStockItem();
	}

}
