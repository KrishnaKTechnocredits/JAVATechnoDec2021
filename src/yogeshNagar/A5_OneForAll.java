package yogeshNagar;

class A5_OneForAll{
	
	void printEvenNumber(int startNumber, int endNumber){
		System.out.println("Programme 1: Even Numbers are:");
		
		for(int num = startNumber;num<=endNumber;num++){
			if((num%2)==0)
				System.out.println(num);			
		}
	}
	
	void printNumberDivisibleByFive(int startNumber, int endNumber){
		System.out.println("Programme 2: Number Divisible by 5 are :");
		
		for(int num = startNumber;num<=endNumber;num++){
			if((num%5)==0)
				System.out.println(num);			
		}
	}
	
	void printNumberDivisibilityByFiveandThree(int startNumber, int endNumber){
		System.out.println("Programme 3: Number Divisible by 5 & 3 are :");
		
		for(int num = startNumber;num<=endNumber;num++){
			if((num%5)==0 && (num%3)==0)
				System.out.println(num);			
		}
	}
	
	void printNumberDivisibilityBySevenOrThrteen(int startNumber, int endNumber){
		System.out.println("Programme 4: Number Divisible by 7 or 13:");
		
		for(int num = startNumber;num<=endNumber;num++){
			if((num%7)==0)
				System.out.println(num + " is Divisible by 7");	
			else if((num%13)==0)
				System.out.println(num + " is Divisible by 13");
		}
	}
	
	void printSumOfGivenNumber(int startNumber, int endNumber){		
		int sum =0;
		
		for(int num = startNumber;num<=endNumber;num++)
			sum = sum+num;
		System.out.println("Programme 5: Sum of numbers between given range: " + sum);
	}
	
	void printdiffrenceOfOddAndEvenNumber(int startNumber, int endNumber){
		int even =0;
		int odd =0;
		
		for(int num = startNumber;num<=endNumber;num++){
			if(num%2==0)
				even = even+num;
			else
				odd = odd+num;
		}
		int result = odd - even;
		System.out.println("Programme 6: difference between sum of odd and even numbers are: "+ result);
	}
	
	void printOddNumberReverse(int startNumber, int endNumber){
		System.out.println("Programme 7: Odd Numbers in reverse between range:");
		
		for(int num = endNumber;num >= startNumber;num--){
			if((num%2)!= 0)
				System.out.println(num);			
		}
	}	
	
	public static void main(String[] args){
		A5_OneForAll oneForAll = new A5_OneForAll();
		oneForAll.printEvenNumber(10,15);
		oneForAll.printNumberDivisibleByFive(10,30);
		oneForAll.printNumberDivisibilityByFiveandThree(5,18);
		oneForAll.printNumberDivisibilityBySevenOrThrteen(5,40);
		oneForAll.printSumOfGivenNumber(1,5);
		oneForAll.printdiffrenceOfOddAndEvenNumber(3,9);
		oneForAll.printOddNumberReverse(10,20);
	}
}