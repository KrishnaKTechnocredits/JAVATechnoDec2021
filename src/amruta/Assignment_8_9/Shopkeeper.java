package amruta.Assignment_8_9;
/*	Assignment - 9 : 22nd Dec'2021
Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) purchaseItem() method -> Only one Customer came for shopping, he picked different items with different quantities, 
print a message “Insufficient stock" if a particular item quantity is less than requested quantity, 
or otherwise deduct requested quantity from total quantity. 
2) printOutOfStockItem() method-> Create a method which shows only those items which are "Out of stock".
3) printAvailableStockItem() method -> Create a method which shows only those items which are "Available in stock" & respective quantities.

NOTE : Partial selling is not allowed.   */


class Shopkeeper{
	
	static int totalMaggiePacketQuantity;
	static int totalDosaPacketQuantity;
	static int totalOilPacketQuantity;
	static int totalPanipuriPacketQuantity;
	static int totalMasalaPacketQuantity;
	
	void setIntialquantity(int initialMaggieQuant, int initialDosaQuant, int initialOilQuant, int initialPanipuriQuant, int initialMasalaQuant) {
		totalMaggiePacketQuantity = initialMaggieQuant;
		totalDosaPacketQuantity = initialDosaQuant;
		totalOilPacketQuantity = initialOilQuant;
		totalPanipuriPacketQuantity = initialPanipuriQuant;
		totalMasalaPacketQuantity = initialMasalaQuant;
	}
	
	void purchaseItem(int reqmaggiepacket, int reqdosapacket, int reqoilpacket, int reqpanipuripacket, int reqmasalpacket){
		System.out.println("--------------------- Maggie Packets ---------------------");
		if(totalMaggiePacketQuantity >= reqmaggiepacket) {
			totalMaggiePacketQuantity = totalMaggiePacketQuantity - reqmaggiepacket;
			System.out.println("\nOrder served to customer.");
			
		}else{
			System.out.println("\nWe have minimum quantity of Maggie packets than you requested.");	
		}
		
		System.out.println("\n--------------------- Dosa Packets ---------------------");
		if(totalDosaPacketQuantity >= reqdosapacket) {
			totalDosaPacketQuantity = totalDosaPacketQuantity - reqdosapacket;
			System.out.println("\nOrder served to customer.");
			
		}else{
			System.out.println("\nWe have minimum quantity of Dosa packets than you requested.");	
		}
		
		System.out.println("\n--------------------- Oil Packets ---------------------");
		if(totalOilPacketQuantity >= reqoilpacket) {
			totalOilPacketQuantity = totalOilPacketQuantity - reqoilpacket;
			System.out.println("\nOrder served to customer.");
			
		}else{
			System.out.println("\nWe have minimum quantity of Oil packets than you requested.");		
		}
		
		System.out.println("\n--------------------- Panipuri Packets ---------------------");
		if(totalPanipuriPacketQuantity >= reqpanipuripacket) {
			totalPanipuriPacketQuantity = totalPanipuriPacketQuantity - reqpanipuripacket;
			System.out.println("\nOrder served to customer.");
			
		}else{
			System.out.println("\nWe have minimum quantity of Panipuri packets than you requested.");	
		}
		
		System.out.println("\n--------------------- Masala Packets ---------------------");
		if(totalMasalaPacketQuantity >= reqmasalpacket) {
			totalMasalaPacketQuantity = totalMasalaPacketQuantity - reqmasalpacket;
			System.out.println("\nOrder served to customer.");
			
		}else{
			System.out.println("\nWe have minimum quantity of Masala packets than you requested.");		
		}
	}	
	
	void availableStockofProduct() {
		System.out.println("\n---------------- Available Products ----------------");	
		if(totalMaggiePacketQuantity > 0)
			System.out.println("Available Maggie Packets are : "+totalMaggiePacketQuantity);
		
		if(totalDosaPacketQuantity > 0)
			System.out.println("Available Dosa Packets are : "+totalDosaPacketQuantity);
		
		if(totalOilPacketQuantity > 0)
			System.out.println("Available Oil Packets are : "+totalOilPacketQuantity);
		
		if(totalPanipuriPacketQuantity > 0)
			System.out.println("Available Panipuri Packets are : "+totalPanipuriPacketQuantity);
		
		if(totalMasalaPacketQuantity > 0)
			System.out.println("Available Masala Packets are : "+totalMasalaPacketQuantity);
	}
	
	void outOfStockProduct() {
		System.out.println("\n---------------- Out of Stock Products ----------------");
		if(totalMaggiePacketQuantity == 0)
			System.out.println("\nMaggie Packets are out of stock.");
		
		if(totalDosaPacketQuantity == 0)
			System.out.println("Dosa Packets are out of stock.");
			
		if(totalOilPacketQuantity == 0)
			System.out.println("Oil Packets are out of stock.");
			
		if(totalPanipuriPacketQuantity == 0)
			System.out.println("Panipuri Maggie Packets are out of stock.");
			
		if(totalMasalaPacketQuantity == 0)
			System.out.println("Masala Packets are out of stock.");
	}
	
	public static void main(String[] args){
		Shopkeeper shopkeeper1 = new Shopkeeper();
		shopkeeper1.setIntialquantity(50,43,39,43,73);
		shopkeeper1.purchaseItem(30,60,39,50,73);
		shopkeeper1.availableStockofProduct();
		shopkeeper1.outOfStockProduct();
	}
}