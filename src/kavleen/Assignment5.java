package kavleen;

class SevenMethods{
  
  void printEvenNumbers(int startNumber , int endNumber){
	  
      for(int num = startNumber ; num<= endNumber; num++){
	       if(num % 2 == 0)
			   System.out.println( num+ " is even num");
		   else
			   System.out.println( num+ " is odd num" );
	  }
  }
  
   void divisible(int startNumber , int endNumber ){
     
	   for (int num = startNumber ; num<= endNumber ; num++){
	         if (num%5==0)
				  System.out.println(num + "divisible by 5 ");
			  else
				  System.out.println(num + "not divisible by 5");		  
	   }
   }
   
    void divisibleOne(int startNumber , int endNumber){
	    
		for (int num = startNumber ; num<= endNumber ; num++){
			 if(num%5==0 && num%3==0)
				 System.out.println(num + "is divisible by 3 & 5");
		}
	}
	
	void divisibleTwo(int startNumber , int endNumber){
	   
	   for(int num= startNumber; num<=endNumber ; num++){
		   if(num%7==0) 
			   System.out.println(num + "is divisible by 7");
		   if(num%13==0)
			   System.out.println(num + "is divisible by 13");
	    }
	}
    void sum (int startNumber , int endNumber){
		int sum = 0;
		System.out.println("Sum is 15");
		for(int num=startNumber ; num <= endNumber ; num++){
			sum = sum + num ;
		}
		System.out.println(sum + "is the total sum");
	}
	
	public static void main(String [] args){
		SevenMethods sevenMethods = new SevenMethods();
		sevenMethods.printEvenNumbers(10,15);
		sevenMethods.divisible(10,20);
		sevenMethods.divisibleOne(5,18);
		sevenMethods.divisibleTwo(5,40);
		sevenMethods.sum(1,15);
		
	}
    
}
