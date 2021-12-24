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
		System.out.println(" Customer Transaction : ");
		if(maggie > 0 && maggie <= stockMaggie) {
			stockMaggie = stockMaggie - maggie;
			System.out.println(" Maggie : " + maggie);
		}else if(maggie != 0){
			System.out.println(" Requested quantity of maggie : " + maggie + " is not available");
		}
		if(dosa > 0 && dosa <= stockDosa) {
			stockDosa = stockDosa - dosa;
			System.out.println(" Dosa : " + dosa);
		}else if(dosa != 0){
			System.out.println(" Requested quantity of dosa : " + dosa + " is not available");
		}
		if(pouches > 0 && pouches <= stockPouches) {
			stockPouches = stockPouches - pouches;
			System.out.println(" Pouches : " + pouches);
		}else if(pouches != 0){
			System.out.println(" Requested quantity of pouches : " + pouches + " is not available");
		}
		if(panipuri > 0 && panipuri <= stockPanipuri) {
			stockPanipuri = stockPanipuri - panipuri;
			System.out.println(" Panipuri : " + panipuri);
		}else if(panipuri != 0){
			System.out.println(" Requested quantity of panipuri : " + panipuri + " is not available");
		}
		if(masala > 0 && masala <= stockMasala) {
			stockMasala = stockMasala - masala;
			System.out.println(" Masala : " + masala);
		}else if(masala != 0){
			System.out.println(" Requested quantity of masala : " + masala + " is not available");
		}
	}
	
	void displayOutOfStockItems() {
		System.out.println(" Below Items are Out Of Stock :");
		boolean flag = true;
		if(stockPanipuri == 0) {
			flag = false;
			System.out.println(" Panipuri");
		}
		if(stockMaggie == 0) {
			flag = false;
			System.out.println(" Maggie");
		}
		if(stockMasala == 0) {
			flag = false;
			System.out.println(" Masala");
		}
		if(stockPouches == 0) {
			flag = false;
			System.out.println(" Pouches");
		}
		if(stockDosa == 0) {
			flag = false;
			System.out.println(" Dosa");
		}	
		if(flag == true)
			System.out.println(" Yipeee !! Nothing to show here ! ");
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
		shopSystem.purchaseItem(55, 23, 0, 33, 0);
		System.out.println();
		shopSystem.displayOutOfStockItems();
		System.out.println();
		shopSystem.displayAvailableItemsWithQuantity();
	}
}