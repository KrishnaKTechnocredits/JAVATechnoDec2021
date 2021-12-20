package ashutosh;

class ConditionalLoopEx{
	
	void printEvenNumbers(int startNumber, int endNumber){
		for(int num=startNumber;num<=endNumber;num++){
			if (num%2==0){
			System.out.println("Even number in given range is " + num);
			}
		}	
	}
	
	void printDivBy5(int startNumber, int endNumber){
		for(int num=startNumber;num<=endNumber;num++){
			if (num%5==0){
			System.out.println("Number divisible by 5 in given range is " + num);
			}
		}	
	}

	void printDivBy5And3(int startNumber, int endNumber){
		for(int num=startNumber;num<=endNumber;num++){
			if (num%5==0&&num%3==0){
			System.out.println("Number divisible by 5 and 3 in given range is " + num);
			}
		}	
	}
	
	void printDivBy7Or13(int startNumber, int endNumber){
		for(int num=startNumber;num<=endNumber;num++){
			if (num%7==0){
			System.out.println("Number divisible by 7 in given range is " + num);
			}
			if (num%13==0){
			System.out.println("Number divisible by 13 in given range is " + num);
			}		
		}	
	}
	
	void printSum(int startNumber, int endNumber){
		int sum=0;
		for(int num=startNumber;num<=endNumber;num++){
			sum=sum+num;
		}	
			System.out.println("Sum of numbers in given range is " + sum);		
			
	}
	
	void printDiff(int startNumber, int endNumber){
		int odd=0;
		int even=0;
		for(int num=startNumber;num<=endNumber;num++){
			if (num%2!=0){
				odd=odd+num;
			}
			else {
			even=even+num;
			}
		}
		System.out.println("Diff between odd and even numbers are " + (odd-even));									
	}
	
	void printOddNum(int startNumber, int endNumber){
		for(int num=endNumber;num>=startNumber;num--){
			if (num%2!=0){
			System.out.println("Odd numbers in reverse number is " + num);		
			}
		}			
	}
	
	public static void main (String [] args){
	ConditionalLoopEx conditionalloopex = new ConditionalLoopEx();
	conditionalloopex.printEvenNumbers(5,10);
	conditionalloopex.printDivBy5(5,10);
	conditionalloopex.printDivBy5And3(5,50);
	conditionalloopex.printDivBy7Or13(5,50);
	conditionalloopex.printSum(5,10);
	conditionalloopex.printDiff(5,10);
	conditionalloopex.printOddNum(5,10);	
	}
}