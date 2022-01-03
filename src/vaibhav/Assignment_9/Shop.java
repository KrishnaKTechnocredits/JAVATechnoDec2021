/*Assignment - 9 : 22nd Dec'2021
Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) purchaseItem() method -> Only one Customer came for shopping, he picked different items with different quantities,
print a message “Insufficient stock" if a particular item quantity is less than requested quantity,
or otherwise deduct requested quantity from total quantity. 
2) printOutOfStockItem() method-> Create a method which shows only those items which are "Out of stock".
3) printAvailableStockItem() method -> Create a method which shows only those items which are "Available in stock" &
respective quantities.

NOTE : Partial selling is not allowed.

*/

package vaibhav.Assignment_9;

public class Shop {

	int iMaggie;
	int iDosa;
	int iPouches;
	int iPanipuri;
	int iMasala;

	void setData(int maggie, int dosa, int pouches, int panipuri, int masala) {
		iMaggie = maggie;
		iDosa = dosa;
		iPouches = pouches;
		iPanipuri = panipuri;
		iMasala = masala;
	}

	void purchaseItem(int reqMaggie, int reqDosa, int reqPouches, int reqPanipuri, int reqMasala) {
		if (reqMaggie > iMaggie) {
			System.out.println("Insufficient stock of Maggie");
		} else {
			iMaggie = iMaggie - reqMaggie;
		}

		if (reqDosa > iDosa) {
			System.out.println("Insufficient stock of Dosa");
		} else {
			iDosa = iDosa - reqDosa;
		}

		if (reqPouches > iPouches) {
			System.out.println("Insufficient stock of Pouches");
		} else {
			iPouches = iPouches - reqPouches;
		}

		if (reqPanipuri > iPanipuri) {
			System.out.println("Insufficient stock of Panipuri");
		} else {
			iPanipuri = iPanipuri - reqPanipuri;
		}

		if (reqMasala > iMasala) {
			System.out.println("Insufficient stock of Masala");
		} else {
			iMasala = iMasala - reqMasala;
		}
	}

	void printOutOfStockItem() {
		System.out.println(" ");
		System.out.println("Out of stock items are : ");

		if (iDosa == 0 || iMaggie == 0 || iMasala == 0 || iPanipuri == 0 || iPouches == 0) {
			if (iMaggie == 0)
				System.out.println("Maggie");
			if (iDosa == 0)
				System.out.println("Dosa");
			if (iPouches == 0)
				System.out.println("Pouches");
			if (iPanipuri == 0)
				System.out.println("Panipuri");
			if (iMasala == 0)
				System.out.println("Masala");
		} else {
			System.out.println("None");
		}
	}

	void printAvailableStockItem() {
		System.out.println(" ");
		System.out.println("Avaiable in stock items are : ");

		if (iMaggie > 0)
			System.out.println("Maggie : " + iMaggie);
		if (iDosa > 0)
			System.out.println("Dosa : " + iDosa);
		if (iPouches > 0)
			System.out.println("Pouches : " + iPouches);
		if (iPanipuri > 0)
			System.out.println("Panipuri : " + iPanipuri);
		if (iMasala > 0)
			System.out.println("Masala : " + iMasala);
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setData(50, 43, 39, 43, 73);
		shop.purchaseItem(20, 43, 100, 20, 90);
		shop.printOutOfStockItem();
		shop.printAvailableStockItem();
	}

}
