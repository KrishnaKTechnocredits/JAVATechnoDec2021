package monikaArkade;

class A5_Assignment5{
	
	void printEvenNumbers(int startNumber, int endNumber){
		System.out.println("Even Numbers: ");
		
		for(int num = startNumber; num<=endNumber; num++){
			if((num%2)==0)
				System.out.println(num);
		}
    }
	
	void printDivisibleNumbers(int startNumber, int endNumber){
		System.out.println("Numbers divisible by 5: ");
		
		for(int num = startNumber; num<=endNumber; num++){
			if((num%5)==0)
				System.out.println(num);
		}
    }
	
	void printDivisibleNumbersByThreeFive(int startNumber, int endNumber){
		System.out.println("Numbers divisible by 3 & 5: ");
		
		for(int num = startNumber; num<=endNumber; num++){
			if(((num%5)==0)&&((num%3)==0))
				System.out.println(num);
		}
    }
	
	void printDivisibleNumbersBySevenOrThrteen(int startNumber, int endNumber){
		System.out.println("Numbers divisible by 7 or 13: ");
		
		for(int num = startNumber; num<=endNumber; num++){
			if((num%7)==0)
				System.out.println(num +" divisible by 7");
			else if((num%13)==0)
				System.out.println(num +" divisible by 13");
		}
    }
	
	void sumOfAllNumbers(int startNumber, int endNumber){
		int sum=0;
		
		for(int num = startNumber; num<=endNumber; num++)
			sum = sum + num;
		System.out.println("Sum of all numbers : "+sum);
	}
	
	void differencebetweenoddevensum(int startNumber, int endNumber){
		int even =0;
		int odd = 0;
		
		for(int num = startNumber; num<=endNumber; num++)
			if((num%2)==0)
				even = even + num;
			else
				odd = odd + num;
		
		int result = odd-even;
		System.out.println("Difference between sum of odd numbers and even numbers : "+result);
	}
	
	void oddNumberInReverse(int startNumber, int endNumber){
		
		for(int num = endNumber; num>=startNumber; num--)
			if((num%2)!=0)
				System.out.println(num);			
	}
	
	public static void main(String[] args){
		A5_Assignment5 assignment5 = new A5_Assignment5();
		assignment5.printEvenNumbers(10,15);
		assignment5.printDivisibleNumbers(10,30);
		assignment5.printDivisibleNumbersByThreeFive(5,18);
		assignment5.printDivisibleNumbersBySevenOrThrteen(5,40);
		assignment5.sumOfAllNumbers(1,5);
		assignment5.differencebetweenoddevensum(3,9);
		assignment5.oddNumberInReverse(10,20);
	}
}