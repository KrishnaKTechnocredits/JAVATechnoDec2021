	/*Assignment - 9 : 22nd Aug'2021
	Create a system (Shop) which maintains each item's quantity.

	a. Initial stocks of Maggie: 50 Maggie packets 
	b. Initial stocks of Dosa : 43 packets 
	c. Initial stocks of pouches : 39 oil packets 
	d. Initial stocks of panipuri : 43 packets  
	e. Initial stocks of masala’s : 73 packets.

	Expectation: 
	1) purchaseItem() method -> Only one Customer came for shopping, he picked different items with different quantities, print a message “Insufficient stock" if a particular item quantity is less than requested quantity, or otherwise deduct requested quantity from total quantity. 
	2) printOutOfStockItem() method-> Create a method which shows only those items which are "Out of stock".
	3) printAvailableStockItem() method -> Create a method which shows only those items which are "Available in stock" & respective quantities.

	NOTE : Partial selling is not allowed.*/

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
			System.out.println("insufficient Stock of Maggie");
			
	    
	     if(dosa_requested_quantity<=stocks_of_Dosa )
	    	  stocks_of_Dosa=(stocks_of_Dosa-dosa_requested_quantity);
		 else
			System.out.println("insufficient Stock of dosa ");
			

	     if(pouches_requested_quantity<=stocks_of_pouches )
	    	  stocks_of_pouches=(stocks_of_pouches-pouches_requested_quantity);
		 else
			System.out.println("insufficient Stock of pouches");
			
			
         if(panipuri__requested_quantity<= stocks_of_panipuri )
	    	  stocks_of_panipuri=( stocks_of_panipuri-panipuri__requested_quantity);
			
		 else
			System.out.println("insufficient Stock of panipuri");
			
         //if we not allow to add -minus entry
          if (masala_requested_quantity<0) 
        	 System.out.println("The return facility is not avaiable");
        
          else if(masala_requested_quantity<= stocks_of_masala )
	    	  stocks_of_masala=( stocks_of_masala-masala_requested_quantity);
          
	     
		  else
			 System.out.println("insufficient Stock of masala");
	   
			
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
		customer.purchaseItem(10,20,39,42,-10);
		customer.printAvailableStockItem();
		customer.printOutOfStockItem();
		
		
		
		
	

	}

}
