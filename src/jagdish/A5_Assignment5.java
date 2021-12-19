package jagdish;
class Assignment5{
	 
	void printEvenNumbers(int startNumber,int endNumber){
		System.out.println("Even No are:");
		for( int index =startNumber; index <= endNumber; index++){
			if(index % 2==0) 
				System.out.println(index);
		}	        				
	}
	
	void printDivisibleNumbers(int startNumber, int endNumber ){
		System.out.println("DivisibleNumber are:");
		for( int index =startNumber; index <=endNumber ; index++){
			if( index% 5==0 ) 
				System.out.println(index);
		}				
	}
	
	void printDivisibleNumbersby5and3(int startNumber, int endNumber ){
		System.out.println("DivisibleNumber by 5 &3  are:"); 
		for( int index =startNumber; index <=endNumber ; index++){
			if( index% 5==0 && index % 3 ==0) 
				System.out.println(index);
		}				
	}
	
	void printDivisibleNumber(int startNumber, int endNumber ){
		System.out.println("DivisibleNumber are:"); 
		for(int index =startNumber; index <=endNumber ; index++){
			if( index% 7==0 || index%13==0 ) {
				if(index%13==0)
					System.out.println(index + " is divisible by 13");
				else
					System.out.println(index +" is divisible by 7");
			}
		}			
	}
		
	void printOddNumbers(int endNumber, int startNumber ){
		System.out.println("Odd No are:");
		for(int index =endNumber; index >=startNumber ; index--){
			if( index % 2!=0 ) 
				System.out.println(index);
		}				
	}
	
	void differenceOddEven(int startNumber, int endNumber){
		System.out.println("The Difference of Odd and Even is: ");
		int even =0;
		int odd = 0;
		
		for(int index =startNumber; index<=endNumber ; index++){
			if(index % 2 ==0)
			  even = even+index;
		  else 
			  odd = odd +index;
		}   
		  System.out.println(odd - even);
	}
	
	void sumOfNumber(int startNumber,int endNumber ){
		int sum = 0;
		int index = startNumber;
		for( ; index <=endNumber ; index++){
			 sum = sum + index;
			 System.out.println("Output of Sum :-" +sum);
		}				
	}
	
	public static void main(String [] args){
		Assignment5 assignment5 = new Assignment5();
		assignment5.printEvenNumbers(30,50);
		assignment5.printDivisibleNumbers(10,30);
		assignment5.printDivisibleNumbersby5and3(5,18);
		assignment5.printOddNumbers(50,30);
		assignment5.printDivisibleNumber(5,40);
		assignment5.sumOfNumber(70,80);
		assignment5.differenceOddEven(3,9);
	}
}