package prajakta;

public class A9_assignment {
       int maggie = 50;
       int dosa = 39;
       int panipuri = 60;
       int masala = 200;
       
       void purchaseItem(int pmaggie, int pdosa, int ppanipuri, int pmasala) {
    	   
    	     if(maggie >= pmaggie) {
    	    	    maggie = maggie - pmaggie;
    	     }
    	     else {
    	    	    System.out.println("Maggie insufficient stock to deliver "+pmaggie+" Available stock is "+maggie+" Only");
    	    	  }
    	     if(dosa >= pdosa) {
    	    	     dosa = dosa - dosa;
    	     }
    	     else {
    	    	     System.out.println("Dosa insufficient stock to deliver "+pdosa+" Available stock is "+dosa+" Only");
    	     }
    	     if(ppanipuri >= ppanipuri) {
    	    	     panipuri = panipuri - ppanipuri;
    	    	     System.out.println("Panipuri insufficient stock to deliver "+ppanipuri+" Available stock is "+ppanipuri+" Only");
    	     }
    	     if(masala >= pmasala) {
    	    	     masala = masala - pmasala;
    	    	     System.out.println("Masala insufficient stock to deliver "+pmasala+" Available stock is "+pmasala+" Only");
    	     }
    	}
       
        void printAvailableStockItem() {
        	 System.out.println("Maggie current stock "+maggie+" " );
        	 System.out.println("Dosa current stock "+dosa+" ");
        	 System.out.println("Panipuri current stock "+panipuri+" ");
        	 System.out.println("Masala current stock "+masala+"");
        }
        
        public static void main(String[] args) {
            A9_assignment a9_assignment = new A9_assignment();
        	a9_assignment.purchaseItem(50,0,20,30);
        	a9_assignment.printAvailableStockItem();
        	a9_assignment.printOutOfStockItem();
        	
			
		}

		private void printOutOfStockItem() {
			// TODO Auto-generated method stub
		
			
		}
}
