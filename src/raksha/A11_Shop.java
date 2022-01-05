package raksha;

class A11_Shop{

	int available_maggie = 50;
	int available_kurkure = 43;
	int available_chips = 39;
	int available_panipuri = 43;
	int available_masala = 73;


	void purchaseItem(int requested_maggie,int requested_kurkure,int requested_chips,int requested_panipuri,int requested_masala){
		if(requested_maggie<=available_maggie){
			available_maggie = available_maggie-requested_maggie;
			System.out.println("Now Available packets of Maggie are : " +available_maggie);
		}
		else
			System.out.println("Insufficient Stock for Maggie : Requested quantity is " +requested_maggie +" and Available quantity is "  +available_maggie);
		
		if(requested_kurkure<=available_kurkure){
			available_kurkure = available_kurkure-requested_kurkure;
			System.out.println("Now Available packets of Kurkure are : " +available_kurkure);
		}
		else
			System.out.println("Insufficient Stock for Kurkure : Requested quantity is " +requested_kurkure +" and Available quantity is "  +available_kurkure);
				
		if(requested_chips<=available_chips){
			available_chips = available_chips-requested_chips;
			System.out.println("Now Available packets of Chips are : " +available_chips);
		}
		else
			System.out.println("Insufficient Stock for Chips  : Requested quantity is " +requested_chips +" and Available quantity is "  +available_chips);
				
		if(requested_panipuri<=available_panipuri){
			available_panipuri = available_panipuri-requested_panipuri;
			System.out.println("Now Available packets of PaniPuri are : " +available_panipuri);
		}
		else
			System.out.println("Insufficient Stock for PaniPuri : Requested quantity is " +requested_panipuri +" and Available quantity is "  +available_panipuri);
				
		if(requested_masala<=available_masala){
			available_masala = available_masala-requested_masala;
			System.out.println("Now Available packets of Masala's are : " +available_masala);
		}
		else
			System.out.println("Insufficient Stock for Masala : Requested quantity is " +requested_masala +" and Available quantity is "  +available_masala);
	}
	
	void printOutOfStockItem(){
		if(available_maggie==0)
			System.out.println("Maggie Packet are Out Of Stock ");
		if(available_kurkure==0)
			System.out.println("Kurkure packet are Out Of Stock ");
		if(available_chips==0)
			System.out.println("Chips packet are Out Of Stock ");
		if(available_panipuri==0)
			System.out.println("PaniPuri packet are Out Of Stock ");
		if(available_masala==0)
			System.out.println("Masala packet are Out Of Stock ");
	}
	
	void printAvailableStockItem(){
		if(available_maggie>0)
			System.out.println("Maggie Packet Available are: " +available_maggie + " Packets");
		if(available_kurkure>0)
			System.out.println("Kurkure Packet Available are: " +available_kurkure + " Packets");
		if(available_chips>0)
			System.out.println("Chips Packet Available are: " +available_chips + " Packets");
		if(available_panipuri>0)
			System.out.println("PaniPuri Packet Available are: " +available_panipuri + " Packets");
		if(available_masala>0)
			System.out.println("Masala Packet Available are: " +available_masala + " Packets");
	}

	public static void main(String[] args){
		A11_Shop shop = new A11_Shop();
		System.out.println("-----------------------------------------");
		System.out.println("Purchase Details for User are given below : ");
		shop.purchaseItem(50,43,19,23,53);
		System.out.println("-----------------------------------------");
		System.out.println("Purchase Details for User with higher quantity are given below : ");
		shop.purchaseItem(60,50,50,50,80);
		System.out.println("-----------------------------------------");
		System.out.println("Below items are out of stock : ");
		shop.printOutOfStockItem();
		System.out.println("-----------------------------------------");
		System.out.println("Below items are available : ");
		shop.printAvailableStockItem();
	}


}
