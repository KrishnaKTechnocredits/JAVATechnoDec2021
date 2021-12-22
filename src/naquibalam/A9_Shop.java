package naquibalam;

public class A9_Shop {
	int iMaggieStock = 50, iDosaStock = 43, iPouchesStock = 39, iPanipuriStock = 43, iMasalaStock = 73;

	void purchaseItem(int purchaseMaggieQ, int purchaseDosaQ, int purchasePouchesQ, int purchasePanipuriQ, int purchaseMasalaQ) {
		if (purchaseMaggieQ <= iMaggieStock) 
			iMaggieStock = iMaggieStock - purchaseMaggieQ;
		else
			System.out.println("Insufficient stock of Maggie to buy");
		
		if (purchaseDosaQ <= iDosaStock) 
			iDosaStock = iDosaStock - purchaseDosaQ;
		else
			System.out.println("Insufficient stock of Dosa to buy");
		
		if (purchasePouchesQ <= iPouchesStock) 
			iPouchesStock = iPouchesStock - purchasePouchesQ;
		else
			System.out.println("Insufficient stock of Oil pouches to buy");
		
		if (purchasePanipuriQ <= iPanipuriStock) 
			iPanipuriStock = iPanipuriStock - purchasePanipuriQ;
		else
			System.out.println("Insufficient stock of Panipuri to buy");
		
		if (purchaseMasalaQ <= iMasalaStock) 
			iMasalaStock = iMasalaStock - purchaseMasalaQ;
		else
			System.out.println("Insufficient stock of Masala to buy");
	}
	
	void printOutOfStockItem() {
		if (iMaggieStock == 0)
			System.out.println("Maggie - Out of stock");
		
		if (iDosaStock == 0)
			System.out.println("Dosa - Out of stock");
		
		if (iPouchesStock == 0)
			System.out.println("Oil Pouches - Out of stock");
		
		if (iPanipuriStock == 0)
			System.out.println("Panipuri - Out of stock");
		
		if (iMasalaStock == 0)
			System.out.println("Masala - Out of stock");
	}
	
	void printAvailableStockItem() {
		System.out.println("Current Stock of Maggie is -> " + iMaggieStock);
		System.out.println("Current Stock of Dosa is > " + iDosaStock);
		System.out.println("Current Stock of Oil Pouches is -> " + iPouchesStock);
		System.out.println("Current Stock of Panipuri is -> " + iPanipuriStock);
		System.out.println("Current Stock of Masala is -> " + iMasalaStock);
	}
	
	public static void main(String[] args) {
		A9_Shop a9_Shop = new A9_Shop();
		a9_Shop.purchaseItem(80, 11, 39, 13, 14);
		a9_Shop.printAvailableStockItem();
		a9_Shop.printOutOfStockItem();
	}
}
