package shital;

class A9_Shop{

	int maggi=50;
	int dosa=43;
	int pouches=39;
	int panipuri=43; 
	int masala=73;
	
	void purchaseItem(int maggiReqQuantity, int dosaReqQuantity, int pouchesReqQuantity, int panipuriReqQuantity, int masalaReqQuanity ){
		System.out.println("Current Stock of Maggi is: " +maggi);
		System.out.println("Current Stock of Dosa is: " +dosa);
		System.out.println("Current Stock of Pouches is: " +pouches);
		System.out.println("Current Stock of Panipuri is: " +panipuri);
		System.out.println("Current Stock of Masala is: " +masala);
		
		System.out.println("\nRequested Quantity of Maggi is : " +maggiReqQuantity);
		System.out.println("Requested Quantity of Dosa is: " +dosaReqQuantity);
		System.out.println("Requested Quantity of Pouches is : " +pouchesReqQuantity);
		System.out.println("Requested Quantity of Panipuri is: " +panipuriReqQuantity);
		System.out.println("Requested Quantity of Masala is: " +masalaReqQuanity);
		
		if(maggi>=maggiReqQuantity)
			maggi=maggi-maggiReqQuantity;
		else
			System.out.println("\nInsufficient Maggi Quantity, Requested Quantity is: " +maggiReqQuantity);
		
		if(dosaReqQuantity<=dosa)
			dosa=dosa-dosaReqQuantity;
		else
			System.out.println("Insufficient Dosa Quantity, Requested Quantity is: " +dosaReqQuantity);
		
		if(pouchesReqQuantity<=pouches)
			pouches=pouches-pouchesReqQuantity;
		else
			System.out.println("Insufficient Pouches Quantity, Requested Quantity is: " +pouchesReqQuantity);
		
		if(panipuriReqQuantity<=panipuri)
			panipuri=panipuri-panipuriReqQuantity;
		else
			System.out.println("Insufficient Panipuri Quantity, Requested Quantity is: "+panipuriReqQuantity);
		
		if(masalaReqQuanity<=masala)
			masala=masala-masalaReqQuanity;
		else
			System.out.println("Insufficient Masala Quantity, Requested Quantityt is: " +masalaReqQuanity);	
	}
	
	void printOutOfStockItem(){
		if(maggi==0)
			System.out.println("\nMaggi Out of Stock");
		if(dosa==0)
			System.out.println("Dosa Out of Stock");
		if(pouches==0)
			System.out.println("Pouches Out of Stock");
		if(panipuri==0)
			System.out.println("Panipuri Out of Stock");
		if(masala==0)
			System.out.println("Masala Out of Stock");
	}
	
	void printAvailableStockItem(){
		if(maggi>0)
			System.out.println("Available Quantity of Maggi is: " +maggi);
		if(dosa>0)
			System.out.println("Available Quantity of Dosa is: " +dosa);
		if(pouches>0)
			System.out.println("Avaialbe Quantity of Pouches is " +pouches);
		if(panipuri>0)
			System.out.println("Available Quantity of Panipuri is: " +panipuri);
		if(masala>0)
			System.out.println("Available Quantity of Masala is: " +masala);
	}
	
	public static void main(String[] args){
		A9_Shop assignment9=new A9_Shop();
		assignment9.purchaseItem(50,15,8,20,5);
		assignment9.printOutOfStockItem();
		assignment9.printAvailableStockItem();
	}
}