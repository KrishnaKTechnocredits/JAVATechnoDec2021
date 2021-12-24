package archana;

public class Ass9_StockMaintain {
	int maggie = 50;
	int dosa = 43;
	int oilPouches = 39;
	int panipuri = 43;
	int masala = 73;
	
	void purchaseItem(int mag,int dos,int oil,int puri,int masa) {
	    boolean stock =true;	
	   if(maggie < mag ) {
		   stock = false;		   
	   }
	   if(dosa < dos ) {
		   stock = false;		   
		}
	   if(oilPouches < oil ) {
		   stock = false;		   
		}
	   if(panipuri < puri ) {
		   stock = false;		   
	   }
	   if(masala < masa ) {
		   stock = false;		   
		}
	   if(stock == false ){
		   System.out.println("Insufficient stock");
	   }
	   
	}
	void printOutOfStockItem(int mag,int dos,int oil,int puri,int masa) {
		 boolean stock = true;
		 String itemname="";
		 int cnt =0 ;
		 if(maggie > mag){
			   stock = true;
			   
		   }
		   dosa=0;
		   if(dosa == dos ) {
			   stock = false;
			   itemname = "Dosa";
			   cnt++;
			}
		   if(oilPouches > oil){
			   
			   stock = true;
		   }
		   if(panipuri > puri ) {
			   stock = true;		   
		   }
		   
		   masala=0;
		   if(masala == masa ) {
			   stock = false;
			   itemname = itemname +" and "+ "Masala";
			   cnt++;
			}
		   
		   if( (stock == false) &&   (cnt>=0)){			   
			   System.out.println(itemname+ " Out of  stock");
		   }
		
	}
    void printAvailableStockItem(int mag,int dos,int oil,int puri,int masa) {
    	
   	 if(maggie > mag){
   		maggie =maggie-mag ;
   		System.out.println("Available maggie :"+ maggie);  
		   
	   }
	   dosa=43;
	   if(dosa > dos ) {
		   dosa =dosa-dos ;
	   		System.out.println("Available dosa :"+ dosa); 
		}
	   if(oilPouches > oil){
		   
		   oilPouches =oilPouches-oil ;
	   		System.out.println("Available oilPouches :"+ oilPouches); 
	   }
	   if(panipuri > puri ) {
		   panipuri =panipuri-puri ;
	   		System.out.println("Available panipuri :"+ panipuri); 		   
	   }
	   
	   masala=73;
	   if(masala > masa ) {
		   masala =masala-masa ;
	   		System.out.println("Available masala :"+ masala); 
		}
	   
	   
    }
	public static void main(String[] args) {
		Ass9_StockMaintain ass9=new Ass9_StockMaintain();
		ass9.purchaseItem(60,40,40,30,75);
		System.out.println("--------------------------------------------------");
		ass9.printOutOfStockItem(40,0,20,10,0);
		System.out.println("--------------------------------------------------");
		ass9.printAvailableStockItem(10,20,15,12,10);
		System.out.println("--------------------------------------------------");
		
	}
}