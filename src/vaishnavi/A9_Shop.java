package vaishnavi;

public class A9_Shop {
	
	int availableStockOfMaggie = 50;
	int availableStockOfDosa = 43 ;
	int availableStockOfOilPouches = 39 ;
	int availableStockOfPanipuri = 43 ;  
	int availableStockOfMasala = 73 ;

	void purchaseItem(int requestedStockOfMaggie, int requestedStockOfDosa, int requestedStockOfOilPouches, int requestedStockOfPanipuri, int requestedStockOfMasala){
		if(requestedStockOfMaggie <= availableStockOfMaggie){
			availableStockOfMaggie = availableStockOfMaggie - requestedStockOfMaggie;
		}else{
			System.out.println("Maggie packets are out of stock. ");
		}
		if(requestedStockOfDosa <= availableStockOfDosa){
			availableStockOfDosa = availableStockOfDosa - requestedStockOfDosa;
		}else{
			System.out.println("Dosa packets are out of stock. ");
		}
		if(requestedStockOfOilPouches <= availableStockOfOilPouches){
			availableStockOfOilPouches = availableStockOfOilPouches - requestedStockOfOilPouches;
		}else{
			System.out.println("Oil pouches are out of stock. ");
		}
		if(requestedStockOfPanipuri <= availableStockOfPanipuri){
			availableStockOfPanipuri = availableStockOfPanipuri - requestedStockOfPanipuri;
		}else{
			System.out.println("Panipuri packets are out of stock. ");
		}
		if(requestedStockOfMasala <= availableStockOfMasala){
			availableStockOfMasala = availableStockOfMasala - requestedStockOfMasala;
		}else{
			System.out.println("Masala packets are out of stock. ");
		}
		
	}
	
		void printOutOfStockItem(){
			if(availableStockOfMaggie == 0){
				System.out.println("Maggie packaets are out of stock. ");
			}
			if(availableStockOfDosa == 0){
				System.out.println("Dosa packaets are out of stock. ");
			}
			if(availableStockOfOilPouches == 0){
				System.out.println("Oil pouches are out of stock. ");
			}
			if(availableStockOfPanipuri == 0){
				System.out.println("Panipuri packaets are out of stock. ");
			}
			if(availableStockOfMasala == 0){
				System.out.println("Masala packaets are out of stock. ");
			}
		}

		void printAvailableStockItem(){
			if(availableStockOfMaggie > 0){
				System.out.println(" Maggie packets in stock : "+availableStockOfMaggie+"");
			}
			if(availableStockOfDosa > 0){
				System.out.println("Dosa packets in stock : "+availableStockOfDosa+"");
			}
			if(availableStockOfOilPouches > 0){
				System.out.println("Oil pouches in stock : "+availableStockOfOilPouches+"");
			}
			if(availableStockOfPanipuri > 0){
				System.out.println("Panipuri packets in stock : "+availableStockOfPanipuri+"");
			}
			if(availableStockOfMasala > 0){
				System.out.println("Masala packets in stock : "+availableStockOfMasala+"");
			}
	}
	public static void main(String[] args) {
		A9_Shop a9_shop=new A9_Shop();
		a9_shop.purchaseItem(10, 20, 30, 40, 50);
		a9_shop.printOutOfStockItem();
		a9_shop.printAvailableStockItem();
	}

}
