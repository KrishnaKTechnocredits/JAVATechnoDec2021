package shivangi;

public class A9_shopSystem {
	int availableMaggie = 50;
	int availableDosa = 43;
	int availablePouches = 39;
	int availablePanipuri = 43;
	int availableMasala = 73;
	
	void purchaseItem(int requestedMaggie, int requestedDosa, int requestedPouches, int requestedPanipuri, int requestedMasala){
		if(requestedMaggie <= availableMaggie){
			availableMaggie = availableMaggie - requestedMaggie;
		}else{
			System.out.println("Insufficient stock for Maggie");
		}
		
		if(requestedDosa <= availableDosa){
			availableDosa = availableDosa - requestedDosa;
		}else{
			System.out.println("Insufficient stock for Dosa");
		}
		
		if(requestedPouches <= availablePouches){
			availablePouches = availablePouches - requestedPouches;
		}else{
			System.out.println("Insufficient stock for pouches");
		}
		
		if(requestedPanipuri <= availablePanipuri){
			availablePanipuri = availablePanipuri - requestedPanipuri;
		}else{
			System.out.println("Insufficient stock for panipuri");
		}
		
		if(requestedMasala <= availableMasala){
			availableMasala = availableMasala - requestedMasala;
		}else{
			System.out.println("Insufficient stock for masala");
		}
	}
	
	void printOutOfStockItem(){
		if(availableMaggie == 0){
			System.out.println("Maggie packaets out of stock");
		}
		if(availableDosa == 0){
			System.out.println("Dosa packaets out of stock");
		}
		if(availablePouches == 0){
			System.out.println("Pouche packaets out of stock");
		}
		if(availablePanipuri == 0){
			System.out.println("Panipuri packaets out of stock");
		}
		if(availableMasala == 0){
			System.out.println("Masala packaets out of stock");
		}
	}
	
	void printAvailableStockItem(){
		if(availableMaggie > 0){
			System.out.println("maggie packets are available in the stock : "+availableMaggie+"");
		}
		if(availableDosa > 0){
			System.out.println("Dosa packets are available in the stock : "+availableDosa+"");
		}
		if(availablePouches > 0){
			System.out.println("Pouch packets are available in the stock : "+availablePouches+"");
		}
		if(availablePanipuri > 0){
			System.out.println("panipuri packets are available in the stock : "+availablePanipuri+"");
		}
		if(availableMasala > 0){
			System.out.println("masala packets available in the stock : "+availableMasala+"");
		}
	}
	
	public static void main(String[] args){
		A9_shopSystem cust1 = new A9_shopSystem();
		cust1.purchaseItem(20, 15, 45, 40, 66);
		cust1.printOutOfStockItem();
		cust1.printAvailableStockItem();
	}
}
