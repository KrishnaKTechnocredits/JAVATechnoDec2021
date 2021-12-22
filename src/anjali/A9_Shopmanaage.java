package anjali;

    public class A9_Shopmanaage {
	static int  stocks_of_Maggie= 50;
	static int stocks_of_Dosa= 43; 
	static int stocks_of_pouches=39;
	static int stocks_of_panipuri = 43;  
	static int stocks_of_masala= 73 ;
	
    void purchaseItem(int maggie_requested_quantity,int dosa_requested_quantity,
    		          int pouches_requested_quantity,int panipuri__requested_quantity ,int masala_requested_quantity){

    	if(maggie_requested_quantity<=stocks_of_Maggie )
			stocks_of_Maggie=(stocks_of_Maggie-maggie_requested_quantity);
		else
			System.out.println("insufficient Stock");
			
	    
	     if(dosa_requested_quantity<=stocks_of_Dosa )
	    	  stocks_of_Dosa=(stocks_of_Dosa-maggie_requested_quantity);
		 else
			System.out.println("insufficient Stock");
			

	     if(pouches_requested_quantity<=stocks_of_pouches )
	    	  stocks_of_pouches=(stocks_of_pouches-maggie_requested_quantity);
		 else
			System.out.println("insufficient Stock");
			
			
         if(panipuri__requested_quantity<= stocks_of_panipuri )
	    	  stocks_of_panipuri=( stocks_of_panipuri-maggie_requested_quantity);
			
		 else
			System.out.println("insufficient Stock");
			
			
	      if(masala_requested_quantity<= stocks_of_masala )
	    	  stocks_of_masala=( stocks_of_masala-maggie_requested_quantity);
		 else
			 System.out.println("insufficient Stock");
			
			
	 }

	
	
	 void printOutOfStockItem(){
		 if(stocks_of_Maggie ==0) 
		 
			 System.out.println("Maggie is out of stock");
		 
		 if(stocks_of_Dosa ==0) 
		 
			 System.out.println("Dosa is out of stock");
		 
		 if(stocks_of_pouches ==0) 
		 
			 System.out.println("pouches is out of stock");
		 
		 if( stocks_of_panipuri ==0) 
		 
			 System.out.println("panipuri is out of stock");
		 
		 if(stocks_of_masala ==0) 
		 
			 System.out.println("masala is out of stock");
		 
		 
		 
	 }
	 
	void printAvailableStockItem(){
		if(stocks_of_Maggie>0)
			System.out.println("Maggie is avaiable with stock :"+stocks_of_Maggie );
		if(stocks_of_Dosa>0)
			 System.out.println("Dosa is avaiable with stock :"+stocks_of_Dosa );
		if(stocks_of_pouches>0)
			System.out.println("pouches is avaiable with stock :"+stocks_of_pouches );
		if(stocks_of_panipuri>0)
			System.out.println("panipuri is avaiable with stock :"+stocks_of_panipuri );
		if(stocks_of_masala>0)
			System.out.println("masala is avaiable with stock :"+stocks_of_masala );
		 
		
		
	}

	public static void main(String[] args) {
		A9_Shopmanaage customer= new A9_Shopmanaage();
		customer.purchaseItem(10,10,10,10,100);
		customer.printAvailableStockItem();
		customer.printOutOfStockItem();
		
		
		
		
	

	}

}
