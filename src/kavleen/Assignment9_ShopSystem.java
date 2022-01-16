package kavleen;

public class Assignment9_ShopSystem {
 
	int Maggie = 50;
	int Dosa = 43;
	int pouches = 49;
	int panipuri = 43;
	int masala = 73;
	
	void purchaseItem(int Maggie1 , int Dosa1 , int pouches1 , int panipuri1 , int masala1) {
		
		if(Maggie>=Maggie1 && Dosa>=Dosa1 && pouches>=pouches1 && panipuri>=panipuri1 && masala>=masala1) {
			Maggie = Maggie-Maggie1;
			Dosa = Dosa-Dosa1;
			pouches = pouches-pouches1;
			panipuri = panipuri-panipuri1;
			masala = masala-masala1;
			System.out.println("Stock is available for the customer");
			}
		else 
			System.out.println("Insufficient Stock");
	}
	void printOutOfStock() {
		if (Maggie == 0 ) 
			System.out.println("Maggie is out of stock");
		if(Dosa == 0)
			System.out.println("Dosa is out of stock");
		if (pouches==0)
			System.out.println("pouches is out of stock");
		if (panipuri==0)
			System.out.println("Panipuri is out of stock");
		if (masala==0)
			System.out.println("Masala is out of stock");
				
	}
    void printAvailableStockItem() {
    	if(Maggie>0)
    		System.out.println("Maggie in stock and the available qty is " + Maggie);
    	if(Dosa>0)
    		System.out.println("Dosa is in stock and the available qty is "+ Dosa);
    	if (pouches>0)
    		System.out.println("Pouches is in stock and the available qty is "+ pouches);
    	if(panipuri>0)
    		System.out.println("Panipuri is in stock and the available qty is "+ panipuri);
    	if(masala>0)
    		System.out.println("Masala is in stock and the available qty is " + masala);
    		
    }
    public static void main (String [] args) {
    	
    	Assignment9_ShopSystem Shop = new Assignment9_ShopSystem();
    	Shop.purchaseItem(50,4,3,4,73);
    	Shop.printOutOfStock();
    	Shop.printAvailableStockItem();
    }
}
