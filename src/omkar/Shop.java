package omkar;

public class Shop {
	
	int Maggie = 50 , Dossa= 43, Pouches = 39 , panipuri = 43 , masala = 73 ;
	//String maggieM, dossaD, pouchesP , panipuriP , masalaM;
	
	void purchaseItem(int maggieM, int dossaD, int pouchesP , int panipuriP , int masalaM) {
		Maggie=Maggie-maggieM;
		
		
	}
	void printOutOfStockItem() {
		
		
	}
	
	void printAvailableStockItem() {
		
		System.out.println(Maggie);
	}

	public static void main(String[] args) {
		Shop s = new Shop();
		s.purchaseItem(5,13,28,9,23);
		s.printOutOfStockItem();
		s.printAvailableStockItem();

	}

}
