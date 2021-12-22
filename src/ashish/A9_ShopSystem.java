package ashish;

public class A9_ShopSystem {

	int stockMaggie, stockDosa, stockPouches, stockPanipuri, stockMasala;
	
	void setAvailableQuantity(int maggie, int dosa, int pouches, int panipuri, int masala) {
		stockMaggie = maggie;
		stockDosa = dosa;
		stockPouches = pouches;
		stockPanipuri = panipuri;
		stockMasala = masala;
	}
	
	void purchaseItem(int maggie, int dosa, int pouches, int panipuri, int masala) {
		stockMaggie = stockMaggie - maggie;
		stockDosa = stockDosa - dosa;
		stockPouches = stockPouches - pouches;
		stockPanipuri = stockPanipuri - panipuri;
		stockMasala = stockMasala - masala;
		System.out.println(" Customer bought below items : ");
		if(maggie > 0)
			System.out.println(" Maggie : " + maggie);
		if(dosa > 0)
			System.out.println(" Dosa : " + dosa);
		if(pouches > 0)
			System.out.println(" Pouches : " + pouches);
		if(panipuri > 0)
			System.out.println(" Panipuri : " + panipuri);
		if(masala > 0)
			System.out.println(" Masala : " + masala);
	}
	
	void displayOutOfStockItems() {
		System.out.println(" Below Items are Out Of Stock :");
		if(stockPanipuri == 0)
			System.out.println(" Panipuri");
		if(stockMaggie == 0)
			System.out.println(" Maggie");
		if(stockMasala == 0)
			System.out.println(" Masala");
		if(stockPouches == 0)
			System.out.println(" Pouches");
		if(stockDosa == 0)
			System.out.println(" Dosa");
	}
	
	void displayAvailableItemsWithQuantity() {
		System.out.println(" Below Items are available in stock : ");
		if(stockPanipuri > 0)
			System.out.println(" Panipuri : " + stockPanipuri);
		if(stockMaggie > 0)
			System.out.println(" Maggie : " + stockMaggie);
		if(stockMasala > 0)
			System.out.println(" Masala : " + stockMasala);
		if(stockPouches > 0)
			System.out.println(" Pouches : " + stockPouches);
		if(stockDosa > 0)
			System.out.println(" Dosa : " + stockDosa);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A9_ShopSystem shopSystem = new A9_ShopSystem();
		shopSystem.setAvailableQuantity(50, 43, 39, 43, 73);
		System.out.println();
		shopSystem.displayAvailableItemsWithQuantity();
		System.out.println();
		shopSystem.purchaseItem(50, 23, 0, 33, 0);
		System.out.println();
		shopSystem.displayOutOfStockItems();
		System.out.println();
		shopSystem.displayAvailableItemsWithQuantity();
	}
}
