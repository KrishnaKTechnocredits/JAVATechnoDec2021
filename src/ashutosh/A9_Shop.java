package ashutosh;

public class A9_Shop {
	
	static int maggiStock=50;
	static int dosaStocks=43;
	static int oilPouches=39;
	static int panipuriStock=43;
	static int masalaPackets=73;
	
	void purchaseItem(int maggi, int dosa, int oilPouch, int panipuri, int masalaPacket) {
		
		if (maggi >maggiStock) {
			
			System.out.println("Insufficient stock of Maggi");
		}
		
		else {
			
			maggiStock=maggiStock-maggi;
			
		}
		
		
		if (dosa >dosaStocks) {
			
			System.out.println("Insufficient stock of Dosa");
		}
		
		else {
			
			dosaStocks=dosaStocks-dosa;
			
		}
		
		if (oilPouch >oilPouches) {
			
			System.out.println("Insufficient stock of Oil pouches");
		}
		
		else {
			
			oilPouches=oilPouches-oilPouch;
			
		}
		
		if (panipuri>panipuriStock) {
			
			System.out.println("Insufficient stock of Panipuri");
		}
		
		else {
			
			panipuriStock=panipuriStock-panipuri;
			
		}
		
		if (masalaPacket >masalaPackets) {
			
			System.out.println("Insufficient stock of Masala packets");
		}
		
		else {
			
			masalaPackets=masalaPackets-masalaPacket;
			
		}	
			
	}
	
	void printOutOfStockItem() {
		
		if (maggiStock==0) {
			
			System.out.println("Maggi is out of stock");
		}
		
		if (dosaStocks==0) {
			
			System.out.println("Dosa is out of stock");
		}
		
		if (oilPouches==0) {
			
			System.out.println("Oil pouches are out of stock");
		}
		
		if (panipuriStock==0) {
			
			System.out.println("Panipuri is out of stock");
		}
		
		if (masalaPackets==0) {
			
			System.out.println("Masala packets are out of stock");
		}
				
		
	}
	
	void printAvailableStockItem() {
		
		
		if (maggiStock>0) {
			
			System.out.println("Maggi is in the stock");
		}
		
		if (dosaStocks>0) {
			
			System.out.println("Dosa is in the stock");
		}
		
		if (oilPouches>0) {
			
			System.out.println("Oil pouches are in the stock");
		}
		
		if (panipuriStock>0) {
			
			System.out.println("Panipuri is in the stock");
		}
		
		if (masalaPackets>0) {
			
			System.out.println("Masala packets are in the stock");
		}					
		
	}

	public static void main(String[] args) {
		
		A9_Shop shop =new A9_Shop();
		
		shop.purchaseItem (50,43,300,4,5);
		
		shop.printOutOfStockItem();
		
		shop.printAvailableStockItem();
		
	}
	
}	
	
	


