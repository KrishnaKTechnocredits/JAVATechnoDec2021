package archana;

public class Ass11_MaxPrimeNo {
	
	static int Previousprimeno ;
	static int count;
     void primeNo(int num)
    {
    	 
    	 boolean isPrime = true;
        for (int index=2; index < num; index++)
        {           
            if (num % index == 0)
            {        
                isPrime = false;
                break;
            }            
        }
        if (isPrime == true)
        {
        	Previousprimeno =num; 
        }       
    	
    }
     
    void AllprimeNo(int startNo ,  int endNo  )
   {
	   for (int index = startNo; index <= endNo ; index++)
       {		  
			primeNo(index);	       
       }
	   System.out.println("MAx prime no : "+Previousprimeno ); 
   }
    
    public static void main(String[] args) {
    	Ass11_MaxPrimeNo ass11=new Ass11_MaxPrimeNo();		
		ass11.AllprimeNo(2, 100);
		
		
	}
}
  
