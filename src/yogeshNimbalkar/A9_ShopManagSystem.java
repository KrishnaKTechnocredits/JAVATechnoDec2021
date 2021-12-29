package yogeshNimbalkar;

public class A9_ShopManagSystem {
	
	static int maggieAvlQty = 50;
	static int dosaAvlQty = 43;
	static int oilpouchAvlQty = 39;
	static int panipuriAvlQty = 43;
	static int masalaAvlQty = 73;
	
	void purchaseItem(int maggieReqQty, int dosaReqQty, int oilpouchReqQty, int panipuriReqQty, int masalaReqQty) {
		if(maggieReqQty <= maggieAvlQty) 
			maggieAvlQty = maggieAvlQty - maggieReqQty;
		else
			System.out.println("Insufficient maggie stock : Requested Quantity is " + maggieReqQty + " and Available Quantity is " + maggieAvlQty);
		if(dosaReqQty <= dosaAvlQty)
			dosaAvlQty = dosaAvlQty - dosaReqQty;
		else
			System.out.println("Insufficient dosa stock : Requested Quantity is " + dosaReqQty + " and Available Quantity is " + dosaAvlQty);
		if(oilpouchReqQty <= oilpouchAvlQty)
			oilpouchAvlQty = oilpouchAvlQty - oilpouchReqQty;
		else
			System.out.println("Insufficient oil pouch stock : Requested Quantity is " + oilpouchReqQty + " and Available Quantity is " + oilpouchAvlQty);
		if(panipuriReqQty <= panipuriAvlQty)
			panipuriAvlQty = panipuriAvlQty - panipuriReqQty;
		else
			System.out.println("Insufficient panipuri stock : Requested Quantity is " + panipuriReqQty + " and Available Quantity is " + panipuriAvlQty);
		if(masalaReqQty <= masalaAvlQty)
			masalaAvlQty = masalaAvlQty - masalaReqQty;
		else
			System.out.println("Insufficient masala stock : Requested Quantity is " + masalaReqQty + " and Available Quantity is " + masalaAvlQty);
	}
	
	void printOutOfStockItem() {
		if(maggieAvlQty == 0)
			System.out.println("Maggie packets are out of stock");
		if(dosaAvlQty == 0)
			System.out.println("Dosa packets are out of stock");
		if(oilpouchAvlQty == 0)
			System.out.println("Oil pouches are out of stock");
		if(panipuriAvlQty == 0)
			System.out.println("Panipuri packets are out of stock");
		if(masalaAvlQty == 0)
			System.out.println("Masala packets are out of stock");
	}
	
	void printAvailableStockItem() {
		if(maggieAvlQty > 0)
			System.out.println("Maggie packets are available in stock, and available Qty is : " + maggieAvlQty);
		if(dosaAvlQty > 0)
			System.out.println("Dose packets are available in stock, and available Qty is : " + dosaAvlQty);
		if(oilpouchAvlQty > 0)
			System.out.println("Oil pouches are available in stock, and available Qty is : " + oilpouchAvlQty);
		if(panipuriAvlQty > 0)
			System.out.println("Panipuri packets are available in stock, and available Qty is : " + panipuriAvlQty);
		if(masalaAvlQty > 0)
			System.out.println("Masala packets are available in stock, and available Qty is : " + masalaAvlQty);
	}
	
	public static void main(String[] args) {
		A9_ShopManagSystem shopManageSystem = new A9_ShopManagSystem();
		shopManageSystem.purchaseItem(30, 35, 40, 43, 20);
		System.out.println();
		shopManageSystem.printOutOfStockItem();
		System.out.println();
		shopManageSystem.printAvailableStockItem();
	}
}
