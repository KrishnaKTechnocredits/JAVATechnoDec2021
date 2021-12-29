package tanu;

class Assignment9{

static int totalMaggie = 50;
static int totalDosa = 43;
static int totalOilPouches = 39;
static int totalPanipuri = 43;
static int totalMasala = 79;

int Availableitem1;
int Requestedqty1;
static int totalstock=500;


 void purchaseItem(String customerItem,int requestedQuantity){
	 if(customerItem == "Maggi"){
			if(totalMaggie>=requestedQuantity)
				totalMaggie = totalMaggie-requestedQuantity;
				else
				 System.out.println("insufficient stock of "+ customerItem);
		}
	 else if(customerItem == "Dosa"){
			if(totalDosa>=requestedQuantity)
				totalDosa = totalDosa-requestedQuantity;
				else
					System.out.println("insufficient stock of "+ customerItem);
		}
	 else if(customerItem == "Paanipuri"){
			if(totalPanipuri>=requestedQuantity)
				totalPanipuri = totalPanipuri-requestedQuantity;
				else
					System.out.println("insufficient stock of "+ customerItem);
		}
	 else if(customerItem == "OilPouches"){
			if(totalOilPouches>=requestedQuantity)
				totalOilPouches = totalOilPouches-requestedQuantity;
				else
					System.out.println("insufficient stock of "+ customerItem);
		}
	 else if(customerItem == "Masala"){
			if(totalMasala>=requestedQuantity)
				totalMasala = totalMasala-requestedQuantity;
				else
					System.out.println("insufficient stock of "+ customerItem);
		}	 

}
 void printOutOfStockItem(){
	if(totalMaggie<=0){
		System.out.println("Maggie is Out of Stock");
	}
	if(totalDosa<=0){
		System.out.println("Dosa is Out of Stock");
	}
	if(totalPanipuri<=0){
		System.out.println("Panipuri is Out of Stock");
	}
	if(totalOilPouches<=0){
		System.out.println("OilPouches is Out of Stock");
	}
	if(totalMasala<=0){
		System.out.println("Masala is Out of Stock");
	}
}
 void printAvailableStockItem(){
	if(totalMaggie>0){
		System.out.println("Maggie is available "+totalMaggie);
	}
	if(totalDosa>0){
		System.out.println("Dosa is available "+totalDosa);
	}
	if(totalPanipuri>0){
		System.out.println("Panipuri is available " + totalPanipuri);
	}
	if(totalOilPouches>0){
		System.out.println("Oilpouchs is available " + totalOilPouches);
	}
	if(totalMasala>0){
		System.out.println("Masala is available " + totalMasala);
	}

 }
	
 public static void main(String[] arg){
  Assignment9 customer = new Assignment9();
  customer.purchaseItem("Maggi",30);
  customer.purchaseItem("Dosa", 50);
  customer.purchaseItem("Paanipuri", 43);
  Assignment9 shop = new Assignment9();
  shop.printOutOfStockItem();
  shop.printAvailableStockItem();
}
}