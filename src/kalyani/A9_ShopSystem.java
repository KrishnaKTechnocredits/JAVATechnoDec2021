package kalyani;

public class A9_ShopSystem {
	int maggi = 50;
	int dosa = 43;
	int oilPouches = 39;
	int panipuri = 43;
	int masalas = 73;
		   
		void purchaseItem(int maggieReq,int dossReq,int oilPouchesReq,int panipuriReq,int masalaReq) {
		     if(maggieReq<=maggi){
			    maggi=maggi-maggieReq;
			   System.out.println("Shopper Purchases "+maggieReq+" maggies from shop and available maggies are: "+maggi);
			 }
			 else 
			   System.out.println("Insufficient quantity,Requested: "+maggieReq+" Available: "+maggi);
		
		     if(dossReq<=dosa){
			    dosa=dosa-dossReq;
			   System.out.println("Shopper Purchases "+dossReq+" dosas from shop and available dosas are: "+dosa);
			 }
			 else
			   System.out.println("Insufficient quantity,Requested: "+dossReq+" Available: "+dosa);  
			  
			 if(oilPouchesReq<=oilPouches) {
			   oilPouches=oilPouches-oilPouchesReq;
			   System.out.println("Shopper Purchases "+oilPouchesReq+" oilpouches from shop and available oilPouches are: "+oilPouches);
			 }
			 else
			   System.out.println("Insufficient quantity,Requested: "+oilPouchesReq+" Available: "+oilPouches);
	          
			 if(panipuriReq<=panipuri) {
			   panipuri=panipuri-panipuriReq;
			   System.out.println("Shopper Purchases "+panipuriReq+" panipuris from shop and available panipuris are: "+panipuri);
			  }
			 else 
			   System.out.println("Insufficient quantity,Requested: "+panipuriReq+" Available: "+panipuri);
			
			 if(masalaReq<=masalas){
			   masalas=masalas-masalaReq;
			   System.out.println("Shopper Purchases "+masalaReq+" masalas from shop and available masalas are: "+masalas);
			 }
			 else
			    System.out.println("Insufficient quantity,Requested: "+masalaReq+" Available: "+masalas); 
	          		
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
			 A9_ShopSystem shopsystem = new A9_ShopSystem();
			 shopsystem.purchaseItem(20,13,10,45,42);
			 shopsystem.printOutOfStockItem();
			 shopsystem.printAvailableStockItem();
			 shopsystem.purchaseItem(75,22,15,15,70);
			 shopsystem.printOutOfStockItem();
			 shopsystem.printAvailableStockItem(); 
		   }
	}   


