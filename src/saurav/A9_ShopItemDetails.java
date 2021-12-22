package saurav;

public class A9_ShopItemDetails {
	int avlMaggiePacketsQty = 50;
	int avlDosaPacketsQty = 43;
	int avlOilPouchesQty = 39;
	int avlPanipuriPackets = 43;
	int avlMasalaPacketsQty = 73;
	
	void purchaseItem(int reqMaggiePacketsQty, int reqDosaPacketsQty, int reqOilPouchesQty, int reqPanipuriPackets, int reqMasalaPacketsQty) {
		if(reqMaggiePacketsQty <= avlMaggiePacketsQty) {
			avlMaggiePacketsQty = avlMaggiePacketsQty- reqMaggiePacketsQty;
	    }else {
	    	System.out.println("Insufficient Stock, we don't have "+reqMaggiePacketsQty+" of Maggie Packets");
	    }
		
		if(reqDosaPacketsQty<= avlDosaPacketsQty) {
			avlDosaPacketsQty = avlDosaPacketsQty- reqDosaPacketsQty;
	    }else {
	    	System.out.println("Insufficient Stock, we don't have "+reqDosaPacketsQty+" of Dosa Packets");
	    }
		
		if(reqOilPouchesQty <= avlOilPouchesQty) {
			avlOilPouchesQty = avlOilPouchesQty- reqOilPouchesQty;
	    }else {
	    	System.out.println("Insufficient Stock, we don't have "+reqOilPouchesQty+" of Oil Pouches Packets");
	    }
		
		if(reqPanipuriPackets <= avlPanipuriPackets) {
			avlPanipuriPackets = avlPanipuriPackets- reqPanipuriPackets;
	    }else {
	    	System.out.println("Insufficient Stock, we don't have "+reqPanipuriPackets+" of Maggie Packets");
	    }
		
		if(reqMasalaPacketsQty <= avlMasalaPacketsQty) {
			avlMasalaPacketsQty = avlMasalaPacketsQty- reqMasalaPacketsQty;
	    }else {
	    	System.out.println("Insufficient Stock, we don't have "+reqMasalaPacketsQty+" of Masala Packets");
	    }
	}
	
	void printOutOfStockItem() {
		if(avlMaggiePacketsQty == 0)
			System.out.println("Sorry, Maggie Packets are out of stock");
		if(avlDosaPacketsQty == 0)
			System.out.println("Sorry, Dosa Packets are out of stock");
		if(avlOilPouchesQty == 0)
			System.out.println("Sorry, Oil Pouches are out of stock");
		if(avlPanipuriPackets == 0)
			System.out.println("Sorry, Panipuri packets are out of stock");
		if(avlMasalaPacketsQty == 0)
			System.out.println("Sorry, Masala Packets out of stock");
	}
	
	void printAvailableStockItem() {
		if (avlMaggiePacketsQty > 0)
			System.out.println("Aailable Qty of Maggie Packets "+avlMaggiePacketsQty);
		if (avlDosaPacketsQty > 0)
			System.out.println("Aailable Qty of Dosa Packetss "+avlDosaPacketsQty);
		if (avlOilPouchesQty > 0)
			System.out.println("Aailable Qty of Oil Pouches "+avlOilPouchesQty);
		if (avlPanipuriPackets > 0)
			System.out.println("Aailable Qty of Panipuri packets "+avlPanipuriPackets);
		if (avlMasalaPacketsQty > 0)
			System.out.println("Aailable Qty of Masala Packets "+avlMasalaPacketsQty);
	}
	
	public static void main(String[] a) {
		A9_ShopItemDetails shopitemdetails = new A9_ShopItemDetails();
		shopitemdetails.purchaseItem(20,44,39,40,73);
		System.out.println("");
		shopitemdetails.printOutOfStockItem();
		System.out.println("");
		shopitemdetails.printAvailableStockItem();
	}
}
