package vrushali;

public class Shop {
	
	int maggiAvailable = 50;
	int dosaAvailable = 43;
	int pouchesAvailable = 39;
	int panipuriAvailable = 43;
	int masalasAvailable = 73;
	
	void purchaseItem(int maggiRequested, int dosaRequested, int pouchesRequested, int panipuriRequested, int masalasRequested) {
		if(maggiRequested <= maggiAvailable) 
			maggiAvailable = maggiAvailable - maggiRequested;
		else
			System.out.println("Insufficient stock, requested quantity maggi is " +maggiRequested+ " and available quantity is " +maggiAvailable);
		
		if(dosaRequested <= dosaAvailable) 
			dosaAvailable = dosaAvailable - dosaRequested;
		else
			System.out.println("Insufficient stock, requested quantity of dosa is " +dosaRequested+ " and available quantity is " +dosaAvailable);
		
		if(pouchesRequested <= pouchesAvailable) 
			pouchesAvailable = pouchesAvailable - pouchesRequested;
		else
			System.out.println("Insufficient stock, requested quantity of pouches are " +pouchesRequested+ " and available quantity is " +pouchesAvailable);
		
		if(panipuriRequested <= panipuriAvailable) 
			panipuriAvailable = panipuriAvailable - panipuriRequested;
		else
			System.out.println("Insufficient stock, requested quantity of panipuri is " +panipuriRequested+ " and available quantity is " +panipuriAvailable);
		
		if(masalasRequested <= masalasAvailable) 
			masalasAvailable = masalasAvailable - masalasRequested;
		else
			System.out.println("Insufficient stock, requested quantity of masalas are " +masalasRequested+ " and available quantity is " +masalasAvailable);
		
	}
	
	void printOutOfStockItem() {
		if(maggiAvailable == 0)
			System.out.println("Maggi is out of Stock");
		if(dosaAvailable == 0)
			System.out.println("Dosa isout of Stock");
		if(pouchesAvailable == 0)
			System.out.println("Pouches are out of Stock");
		if(panipuriAvailable == 0)
			System.out.println("Panipuris are out of Stock");
		if(masalasAvailable == 0)
			System.out.println("Masalas are out of Stock");
	}
	
	void printAvailableStockItem() {
		if (maggiAvailable > 0)
			System.out.println("Maggi is avaialble with quantity " + maggiAvailable);
		if(dosaAvailable > 0)
			System.out.println("Dosa are available with quantity "+ dosaAvailable);
		if(pouchesAvailable > 0)
			System.out.println("Pouches are available with quantity " + pouchesAvailable);
		if(panipuriAvailable > 0)
			System.out.println("Panipuri is available with quanity " + panipuriAvailable);
		if(masalasAvailable > 0)
			System.out.println("Masalas are available with quantity " + masalasAvailable);
		if(maggiAvailable > 0 && dosaAvailable > 0 && pouchesAvailable > 0 && panipuriAvailable> 0 && masalasAvailable>0)
			System.out.println("All the requested item are available");
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.purchaseItem(20, 23, 16, 13, 77);
		shop.purchaseItem(30, 23, 23, 33, 76);
		shop.printOutOfStockItem();
		shop.printAvailableStockItem();
	}
}
