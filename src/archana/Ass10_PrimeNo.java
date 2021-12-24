package archana;

class Ass10_PrimeNo
{
	static int sum ;
	static int count;
     void primeNo(int num)
    {
    	 boolean isPrime = true;
        for (int index=2; index <= num/2; index++)
        {           
            if (num % index == 0)
            {
                //System.out.println("Not a prime no.");               
                isPrime = false;
                break;
            }            
        }
        if (isPrime == true)
        {
        	System.out.println(num ); 
        	sum = sum + num;
        	count++;
        }

    }
     void countPrimeno( )
     {
    	 System.out.println("Total prime no in a given range are : "+count);  

     }
    void AllprimeNo(int startNo ,  int endNo  )
   {
	   for (int index = startNo; index <= endNo ; index++)
       {		  
			primeNo(index);	       
       }

   }
    void AvgprimeNo(int sum, int count)
    {
    	System.out.println("Avarage of prime no is :" +(sum/count));
    }
    public static void main(String[] args) {
		Ass10_PrimeNo ass10=new Ass10_PrimeNo();
		System.out.println("Prime no : "); 
		ass10.primeNo(17);		
		System.out.println("-----------------------------");
		System.out.println("Prime no ni given range 100 to 200 are :"); 
		ass10.AllprimeNo(100, 200);
		System.out.println("-----------------------------");
		ass10.countPrimeno();
		System.out.println("-----------------------------");
		System.out.println("Sum of prime no : "+ sum);  
		System.out.println("-----------------------------");
		ass10.AvgprimeNo(sum,count);
	}
  
}
