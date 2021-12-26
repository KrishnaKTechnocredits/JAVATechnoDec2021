package technocredits;

import technocredits.scannerdemo.ScannerExample1;

public class Shop {
	int item1AvailableQ = 100;
	int item2AvailableQ = 30;
	
	void purchaseItem(int item1RequestedQ, int item2RequestedQ) {
		if(item1RequestedQ <= item1AvailableQ)
			item1AvailableQ = item1AvailableQ - item1RequestedQ;
		else
			System.out.println("Insufficient    quantity, requested Q is " + item1RequestedQ + " and available is " + item1AvailableQ);
		
		if(item2RequestedQ <= item2AvailableQ)
			item2AvailableQ = item2AvailableQ - item2RequestedQ;
		else
			System.out.println("Insufficient quantity, requested Q is " + item2RequestedQ + " and available is " + item2AvailableQ);
	}
	
	void soldoutItem() {
		boolean flag = true;
		
		if(item1AvailableQ == 0) {
			System.out.println("item1 is sold out");
			flag = false;
		}
		
		if(item2AvailableQ == 0) {
			System.out.println("item2 is sold out");
			flag = false;
		}
		
		if(flag == true)
			System.out.println("none of the items are sold out");
	}
	
	void availableItem() {
		boolean availableQFlag = true;
		
		if(item1AvailableQ > 0) {
			System.out.println("item1 is available with Q " + item1AvailableQ);
			availableQFlag = false;
		}
		if(item2AvailableQ > 0) {
			System.out.println("item2 is available with Q " + item2AvailableQ);
			availableQFlag = false;
		}
		
		if(availableQFlag == true)
			System.out.println("No item available");
	}
	
	public static void main(String[] args) {
		ScannerExample1 scEx1 = new ScannerExample1();
		Shop shop1 = new Shop();
		shop1.purchaseItem(20, 3);
		shop1.purchaseItem(10, 2);
		shop1.soldoutItem();
		shop1.availableItem();
	}
}
