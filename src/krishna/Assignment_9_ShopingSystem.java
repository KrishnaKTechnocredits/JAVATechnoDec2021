package krishna;

public class Assignment_9_ShopingSystem {
	int stock_Maggie, stock_Dosa, stock_OilPouches, stock_Panipuri, stock_Masala;
	
	void setAvailable_Items() {
		stock_Maggie = 50;
		stock_Dosa = 43;
		stock_OilPouches = 39;
		stock_Panipuri = 43;
		stock_Masala = 73;
	}
	
	void purchase_Items(int Maggie, int Dosa, int OilPouches, int Panipuri, int Masala) {
		System.out.println(" Customer Purchased items : ");
		if(Maggie <= stock_Maggie) {
				stock_Maggie = stock_Maggie - Maggie;
				System.out.println(" Maggie : " + Maggie);
			}
		else
			System.out.println("       Maggie : Items Unavailable");
		if(Dosa <= stock_Dosa) {
			stock_Dosa = stock_Dosa - Dosa;
			System.out.println(" Dosa : " + Dosa);
		}
		else
			System.out.println("      Dosa : Items Unavailable");
		if(OilPouches <= stock_OilPouches) {
			stock_OilPouches = stock_OilPouches - OilPouches;
			System.out.println(" Pouches : " + OilPouches);
		}
		else
			System.out.println("      Oil Pouches : Items Unavailable");
		if(Panipuri <= stock_Panipuri) {
			stock_Panipuri = stock_Panipuri - Panipuri;
			System.out.println(" Panipuri : " + Panipuri);
		}
		else
			System.out.println("      Panipuri : Items Unavailable");
		if(Masala <= stock_Masala) {
			stock_Masala = stock_Masala - Masala;
			System.out.println(" Masala : " + Masala);
		}
		else
			System.out.println("       Masala : Items Unavailable");
		System.out.println("**********************************************************");
	}
	
	
	void displayItem_OutOfStock() {
		if(stock_Maggie == 0)
			System.out.println(" Out Of Stock Items : Maggie");
		if(stock_Panipuri == 0)
			System.out.println(" Out Of Stock Items : Panipuri");
		if(stock_Masala == 0)
			System.out.println(" Out Of Stock Items : Masala");
		if(stock_OilPouches == 0)
			System.out.println(" Out Of Stock Items  :Oil Pouches");
		if(stock_Dosa == 0)
			System.out.println(" Out Of Stock Items : Dosa");
	}
	
	void displayQuantityItems_Available() {
		System.out.println(" Available Items in stock : ");
		if(stock_Maggie > 0)
			System.out.println(" Maggie : " + stock_Maggie);
		if(stock_Panipuri > 0)
			System.out.println(" Panipuri : " + stock_Panipuri);
		if(stock_Masala > 0)
			System.out.println(" Masala : " + stock_Masala);
		if(stock_OilPouches > 0)
			System.out.println(" Pouches : " + stock_OilPouches);
		if(stock_Dosa > 0)
			System.out.println(" Dosa : " + stock_Dosa);
	}
	
	public static void main(String[] arr) {
		Assignment_9_ShopingSystem shop = new Assignment_9_ShopingSystem();
		shop.setAvailable_Items();
		shop.purchase_Items(30, 44, 19, 23, 83);
		shop.displayItem_OutOfStock();
		shop.displayQuantityItems_Available();
	}

}
