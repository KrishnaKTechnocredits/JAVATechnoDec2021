package yogeshNagar;

public class A9_ShopManagementSystem {
	int availableMaggie = 50;
	int availableDosa = 43;
	int availableOilPouches = 39;
	int availablePaniPuri = 43;
	int availableMasala = 73;
	
	void purchaseItem(int requestedMaggie, int requestedDosa, int requestedOilPouches, int requestedPaniPuri, int requestedMasala) {
		
		if(requestedMaggie <= availableMaggie) {
			System.out.println("Requested Maggie is "+ requestedMaggie);
			availableMaggie = availableMaggie - requestedMaggie;
			System.out.println("After sell available Maggie is "+ availableMaggie);	
		}else
			System.out.println("Maggie is out of stok as requested quantity is "+ requestedMaggie + " but available quantity in stoke is "+ availableMaggie);
		
		if(requestedDosa <= availableDosa) {
			System.out.println("Requested Dosa is "+ requestedDosa);
			availableDosa = availableDosa - requestedDosa;
			System.out.println("After sell available Dosa is "+ availableDosa);	
		}else
			System.out.println("Dosa is out of stok as requested quantity is "+ requestedDosa + " but available quantity in stoke is "+ availableDosa);
		
		if(requestedOilPouches <= availableOilPouches) {
			System.out.println("Requested Oil is "+ requestedOilPouches);
			availableOilPouches = availableOilPouches - requestedOilPouches;
			System.out.println("After sell available Oil Pouches is "+ availableOilPouches);		
		}else
			System.out.println("Oil Pouches is out of stok as requested quantity is "+ requestedOilPouches + " but available quantity in stoke is "+ availableOilPouches);
		
		if(requestedPaniPuri <= availablePaniPuri) {
			System.out.println("Requested Pani Puri is "+ requestedPaniPuri);
			availablePaniPuri = availablePaniPuri - requestedPaniPuri;
			System.out.println("After sell available Pani Puri is "+ availablePaniPuri);	
		}else
			System.out.println("Pani Puri is out of stok as requested quantity is "+ requestedPaniPuri + " but available quantity in stoke is "+ availablePaniPuri);
		
		if(requestedMasala <= availableMasala) {
			System.out.println("Requested Masala is "+ requestedMasala);
			availableMasala = availableMasala - requestedMasala;
			System.out.println("After sell available Masala is "+ availableMasala);		
		}else
			System.out.println("Masala is out of stok as requested quantity is "+ requestedMasala + " but available quantity in stoke is "+ availableMasala);	
	}
	
	void printOutOfStockItem() {
		if(availableMaggie==0)
			System.out.println("Maggie is out of stock");
		if(availableDosa==0)
			System.out.println("Dose is out of stock");
		if(availableMasala==0)
			System.out.println("Masala is out of stock");
		if(availableOilPouches==0)
			System.out.println("Oil Pouch is out of stock");
		if(availablePaniPuri==0)
			System.out.println("Pani Puri is out of stock");
	}
	void printAvailableStockItem() {
		if(availableMaggie>0)
			System.out.println("Maggie is Available in stock and quantity is "+ availableMaggie);
		if(availableDosa>0)
			System.out.println("Dose is Available in stock and quantity is " + availableDosa);
		if(availableMasala>0)
			System.out.println("Masala is Available in stock and quantity is "+ availableMasala);
		if(availableOilPouches>0)
			System.out.println("Oil Pouch Available in of stock and quantity is "+ availableOilPouches);
		if(availablePaniPuri>0)
			System.out.println("Pani Puri Available in stock and quantity is "+ availablePaniPuri);
	}
	
	public static void main(String[] args) {
		System.out.println("----Out of Stock Item--------\n");
		A9_ShopManagementSystem shopSystem1 = new A9_ShopManagementSystem();
		shopSystem1.purchaseItem(50, 43, 39, 43, 73);
		shopSystem1.printOutOfStockItem();
		shopSystem1.printAvailableStockItem();
		
		System.out.println("\n");
		System.out.println("----Requested item greater then available stock--------\n");
		A9_ShopManagementSystem shopSystem2 = new A9_ShopManagementSystem();
		shopSystem2.purchaseItem(60, 60, 60, 60, 80);
		shopSystem2.printOutOfStockItem();
		shopSystem2.printAvailableStockItem();
		
		System.out.println("\n");
		System.out.println("----Requested item Equal or less then available stock--------\n");
		A9_ShopManagementSystem shopSystem3 = new A9_ShopManagementSystem();
		shopSystem3.purchaseItem(30, 7, 20, 5, 15);
		shopSystem3.printOutOfStockItem();
		shopSystem3.printAvailableStockItem();
	}
}
