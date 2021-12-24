package nasir;
class A9_Shop {
	int availableMaggie = 50;
	int availableDosa =43;
	int availablePouches =39;
	int availablePanipuri=43;
	int availableMasala=73;
	
	void purchaseItem(int maggie1, int dosa1, int pouches1,int panipuri1, int masala1){
		if(availableMaggie>=maggie1 && availableDosa>=dosa1 && availablePouches>=pouches1 && availablePanipuri>=panipuri1 && availableMasala>=masala1){
			availableMaggie=availableMaggie-maggie1;
			availableDosa=availableDosa-dosa1;
			availablePouches=availablePouches-pouches1;
			availablePanipuri=availablePanipuri-panipuri1;
			availableMasala=availableMasala-masala1;
			System.out.println("Stock is available for customer");
		}
		else
			System.out.println("Insufficient Stock");
			System.out.println("..................................................");
	}
	
	void printOutOfStockItem(){
		if(availableMaggie==0)
			System.out.println("Maggie is out of stock");
		if(availableDosa==0)
			System.out.println("Dosa is out of stock");
		if(availablePouches==0)
			System.out.println("Pouches is out of stock");
		if(availablePanipuri==0)
			System.out.println("Panipuri is out of stock");
		if(availableMasala==0)
			System.out.println("Masala is out of stock");
		System.out.println("..................................................");
	}
	
	void printAvailableStockItem(){
		if(availableMaggie>0)
			System.out.println("Maggie is in stock and available quantitiy is "+availableMaggie);
		if(availableDosa>0)
			System.out.println("Dosa is in stock and available quantitiy is "+availableDosa);
		if(availablePouches>0)
			System.out.println("Pouches is in stock and available quantitiy is "+availablePouches);
		if(availablePanipuri>0)
			System.out.println("Panipuri is in stock and available quantitiy is "+availablePanipuri);
		if(availableMasala>0)
			System.out.println("Masala is in stock and available quantitiy is "+availableMasala);	
	}
	
	public static void main(String[]args){
		A9_Shop shop =new A9_Shop();
		shop.purchaseItem(50,4,3,4,73);
		shop.printOutOfStockItem();
		shop.printAvailableStockItem();
	}
	
}