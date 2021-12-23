package debasmita;

public class A9_Shop {
	   int maggi = 50;
	   int dosa = 43;
	   int oilPouches = 39;
	   int panipuri = 43;
	   int masalas = 73;
	   
	   void purchaseItem(int mReq,int dReq,int oReq,int pReq,int maReq) {
	      if(mReq<=maggi){
		    maggi=maggi-mReq;
		    System.out.println("Shopper Purchases "+mReq+" maggies from shop and available maggies are: "+maggi);
		  }
		  else {
		    System.out.println("Insufficient quantity,Requested: "+maReq+" Available: "+maggi);
		  }
	      
		  if(dReq<=dosa){
		    dosa=dosa-dReq;
		    System.out.println("Shopper Purchases "+dReq+" dosas from shop and available dosas are: "+dosa);
		  }
		  else{
		    System.out.println("Insufficient quantity,Requested: "+dReq+" Available: "+dosa);  
		  }
		  
		  if(oReq<=oilPouches) {
		    oilPouches=oilPouches-oReq;
		    System.out.println("Shopper Purchases "+oReq+" oilpouches from shop and available oilPouches are: "+oilPouches);
		  }
		  else{
		    System.out.println("Insufficient quantity,Requested: "+oReq+" Available: "+oilPouches);
          }
		  
          if(pReq<=panipuri) {
		    panipuri=panipuri-pReq;
		    System.out.println("Shopper Purchases "+pReq+" panipuris from shop and available panipuris are: "+panipuri);
		  }
		  else {
		    System.out.println("Insufficient quantity,Requested: "+pReq+" Available: "+panipuri);
		  }

          if(maReq<=masalas){
		    masalas=masalas-maReq;
		    System.out.println("Shopper Purchases "+maReq+" masalas from shop and available masalas are: "+masalas);
		  }
		  else{
		    System.out.println("Insufficient quantity,Requested: "+maReq+" Available: "+masalas); 
          }			
	   }
	   void printOutOfStockItem() {
		  if(maggi==0)
			System.out.println("Maggi is out of stock");
		  if(dosa==0)
			System.out.println("dosa is out of stock");
		  if(oilPouches==0)
			System.out.println("oilPouches is out of stock");
		  if(panipuri==0)
			System.out.println("panipuri is out of stock");
		  if(masalas==0)
			System.out.println("masalas are out of stock");
	   }
	   void printAvailableStockItem() {
		  if(maggi>0)
			System.out.println("Item Maggi is available");
		  if(dosa>0)
			System.out.println("Item Dosa is available");
		  if(oilPouches>0)
			System.out.println("Item Oilpouches are available");
		  if(panipuri>0)
			System.out.println("Item Panipuri is available");
		  if(masalas>0)
			System.out.println("Item Masalas are available");
	   }
	   public static void main(String[] args) {
		  A9_Shop shopper = new A9_Shop();
		  shopper.purchaseItem(15,23,10,18,42);
		  shopper.printOutOfStockItem();
		  shopper.printAvailableStockItem();
		  shopper.purchaseItem(35,10,15,25,20);
		  shopper.printOutOfStockItem();
		  shopper.printAvailableStockItem();
	   }
}
