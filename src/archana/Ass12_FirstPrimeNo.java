package archana;

import java.util.Scanner;

public class Ass12_FirstPrimeNo {
	static int Previousprimeno ;
	static int count;
	static void primeNo(int num)
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
     
     static void AllprimeNo(int startNo ,  int endNo  )
   {
	   for (int index = startNo; index <= endNo ; index++)
       {		  
			primeNo(index);	       
       }
	   System.out.println("MAx prime no : "+ Previousprimeno ); 
   }
    
    public static void main(String[] args) {    	
    	Scanner scann=new Scanner(System.in);
    	System.out.println("Enter StartNumber : ");
		int stNumber = scann.nextInt();
		System.out.println("Enter EndNumber : ");
		int EndNumber = scann.nextInt();
		AllprimeNo(stNumber,EndNumber);
		scann.close();
		
	}

}
