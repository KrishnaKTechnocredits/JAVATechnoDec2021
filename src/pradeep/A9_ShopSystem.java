package pradeep;

public class A9_ShopSystem {
	int maggieAvailableQ = 50;
	int dosaAvailableQ = 43;
	int oilPouchesAvailableQ = 39;
	int panipuriAvailableQ =43;
	int masalaAvailableQ = 73;
	
	void itemList() {
		System.out.println("Select Item from the list\n" + "Maggie, Dosa, OilPouches, Panipuri, Masala\n ");
	}
	
	void purchaseItem(String itemRequested, int requestedQ) {
		boolean flag = false;
		//Maggie
		if(itemRequested == "Maggie") {
			flag = true;
			if(requestedQ <= maggieAvailableQ) {
				maggieAvailableQ = maggieAvailableQ - requestedQ;				
			}else
				System.out.println(itemRequested + " is in  insufficeint Quantity");
		}
		
		//Dosa
		if(itemRequested == "Dosa") {
			flag = true;
			if(requestedQ <= dosaAvailableQ) {
				dosaAvailableQ = dosaAvailableQ - requestedQ;				
			}else
				System.out.println(itemRequested + " is in  insufficeint Quantity");
		}
		
		//OilPouches
		if(itemRequested == "OilPouches") {
			flag = true;
			if(requestedQ <= oilPouchesAvailableQ) {
				oilPouchesAvailableQ = oilPouchesAvailableQ - requestedQ;				
			}else
				System.out.println(itemRequested + " is in  insufficeint Quantity");
		}
		
		//Panipuri
		if(itemRequested == "Panipuri") {
			flag = true;
			if(requestedQ <= panipuriAvailableQ) {
				panipuriAvailableQ = panipuriAvailableQ - requestedQ;				
			}else
				System.out.println(itemRequested + " is in  insufficeint Quantity");
		}
		
		//Masala
		if(itemRequested == "Masala") {
			flag = true;
			if(requestedQ <= masalaAvailableQ) {
				masalaAvailableQ = masalaAvailableQ - requestedQ;				
			}else
				System.out.println(itemRequested + " is in  insufficeint Quantity");
		}
		
		if(flag==false)
			System.out.println(itemRequested + " name is not correct. call itemList() method for correct name");
	}
	
	void printOutOfStock() {
		if(maggieAvailableQ == 0) {
			System.out.println("Maggie is out of stock");
		}
		
		if(dosaAvailableQ == 0) {
			System.out.println("Dosa is out of stock");
		}
		
		if(oilPouchesAvailableQ == 0) {
			System.out.println("Oil Pouches is out of stock");
		}
		
		if(panipuriAvailableQ == 0) {
			System.out.println("Panipuri is out of stock");
		}
		
		if(masalaAvailableQ == 0) {
			System.out.println("Masala is out of stock");
		}
	}
	
	void printAvailableStockItem(){
		if(maggieAvailableQ > 0)
			System.out.println("Maggie is available with Quantity "+ maggieAvailableQ);
		if(dosaAvailableQ > 0)
			System.out.println("Dosa is available with Quantity "+ dosaAvailableQ);
		if(oilPouchesAvailableQ > 0)
			System.out.println("Oil Pouches is available with Quantity "+ oilPouchesAvailableQ);
		if(panipuriAvailableQ > 0)
			System.out.println("Panipuri is available with Quantity "+ panipuriAvailableQ);
		if(masalaAvailableQ > 0)
			System.out.println("Masala is available with Quantity "+ masalaAvailableQ);
	}
	
	public static void main(String[] args) {
		A9_ShopSystem user1 = new A9_ShopSystem();
		user1.itemList();
		user1.purchaseItem("Maggie",50);
		user1.purchaseItem("OilPouches",15);
		user1.purchaseItem("dosa",12);
		user1.purchaseItem("Panipuri",10);
		user1.purchaseItem("Masala",10);
		user1.printOutOfStock();
		user1.printAvailableStockItem();
	}
}
