package monikaArkade;

public class A9_Assignment9 {

	int initialStockOfMaggie = 50;
	int initialStockOfDosa = 43;
	int initialStockOfOilPouches = 39;
	int initialStockOfPanipuri = 43;
	int initialStockOfMasala = 73;
	
	void purchaseItem(int requestedMaggie,int requestedDosa,int requestedOilPouches,int requestedPanipuri,int requestedmsala) {
		if(requestedMaggie <= initialStockOfMaggie) 
			initialStockOfMaggie = initialStockOfMaggie - requestedMaggie;
		else
			System.out.println("Insufficient quantity , requested quantity is : "+requestedMaggie+" and available Maggie quantity is : "+initialStockOfMaggie);
		
		if(requestedDosa <= initialStockOfDosa) 
			initialStockOfDosa = initialStockOfDosa - requestedDosa;
		else
			System.out.println("Insufficient quantity , requested quantity is : "+requestedDosa+" and available Dosa quantity is : "+initialStockOfDosa);
		
		if(requestedOilPouches <= initialStockOfOilPouches) 
			initialStockOfOilPouches = initialStockOfOilPouches - requestedOilPouches;
		else
			System.out.println("Insufficient quantity , requested quantity is : "+requestedOilPouches+" and available Oil pouches quantity is : "+initialStockOfOilPouches);
		
		if(requestedPanipuri <= initialStockOfPanipuri) 
			initialStockOfPanipuri = initialStockOfPanipuri - requestedPanipuri;
		else
			System.out.println("Insufficient quantity , requested quantity is : "+requestedPanipuri+" and available panipuri packet quantity is : "+initialStockOfPanipuri);
		
		if(requestedmsala <= initialStockOfMasala) 
			initialStockOfMasala = initialStockOfMasala - requestedmsala;
		else
			System.out.println("Insufficient quantity , requested quantity is : "+requestedmsala+" and available masala packet quantity is : "+initialStockOfMasala);
	}
	
	void printOutOfStock() {
		boolean flag = true;
		if(initialStockOfMaggie == 0) {
			System.out.println("Maggie Out of stock");
			flag = false;
		}
		
		if(initialStockOfDosa == 0) {
			System.out.println("Dosa Packets Out of stock");
			flag = false;
		}
		
		if(initialStockOfOilPouches == 0) {
			System.out.println("Oil Pauches Out of stock");
			flag = false;
		}
		
		if(initialStockOfPanipuri == 0) {
			System.out.println("Panipuri Packets Out of stock");
			flag = false;
		}
		
		if(initialStockOfMasala == 0) {
			System.out.println("Masala Packets Out of stock");
			flag = false;
		}
		
		if(flag == true) {
			System.out.println("None of sold out");
		}
	}
	
	void printAvailableStockItem() {
		boolean availableFlag = true;
		if(initialStockOfMaggie > 0) {
			System.out.println("Maggie available with quantity : "+initialStockOfMaggie);
			availableFlag = false;
		}
		
		if(initialStockOfDosa > 0) {
			System.out.println("Dosa packets available with quantity : "+initialStockOfDosa);
			availableFlag = false;
		}
		
		if(initialStockOfOilPouches > 0) {
			System.out.println("Oil Pouches available with quantity : "+initialStockOfOilPouches);
			availableFlag = false;
		}
		
		if(initialStockOfPanipuri > 0) {
			System.out.println("Panipuri packets available with quantity : "+initialStockOfPanipuri);
			availableFlag = false;
		}
		
		if(initialStockOfMasala > 0) {
			System.out.println("Masala packets available with quantity : "+initialStockOfMasala);
			availableFlag = false;
		}
		
		if(availableFlag == true)
			System.out.println("None of available");
	}
	
	public static void main(String[] args) {
		A9_Assignment9 shop1 = new A9_Assignment9();
		shop1.printAvailableStockItem();
		System.out.println("-----------------------");
		shop1.purchaseItem(50, 5, 20, 40, 75);
		System.out.println("-----------------------");
		shop1.printOutOfStock();
	}
}
