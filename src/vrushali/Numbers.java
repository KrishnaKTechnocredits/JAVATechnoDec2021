package vrushali;

class Numbers{
	void printEvenNumber(int startNumber, int endNumber){
		System.out.println("Even numbers are: ");
		for(int num = startNumber; num<=endNumber; num++){
			if(num%2==0){
			System.out.println(num);
			}
		}
	}	
	
	void printNumberDivisibleBy5(int startIndex, int endIndex){
		System.out.println("Divisible by 5, numbers are: ");
		for(int num = startIndex; num<= endIndex; num++){
			if(num%5==0){
				System.out.println(num);
			}
		}
	}
	
	void printNumberDivisibleBy5And3(int startIndex, int endIndex){
		for(int num = startIndex; num<= endIndex; num++){
			if(num%5==0 && num%3==0){
				System.out.println("Divisible by 5 & 3, numbers are: " + num);
			}	
		}
	}	
	
	void printNumberDivisibleBy7Or13(int startIndex, int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int num = startIndex; num<= endIndex; num++){
			if(num%7==0){
				System.out.println(num + " is divisible by 7");
			}else if(num%13==0){
				System.out.println(num + " is divisible by 13");
			}
		}
	}
	
	void sumOfNumbers(int startIndex, int endIndex){
		int sum = 0;
		for(int num = startIndex; num<=endIndex; num++){
			sum = sum + num;
		}
		System.out.println("Sum is: " + sum);
	}	
	
	void diffBetweenSumOfOddAndEven(int startIndex, int endIndex){
		int diff = 0;
		int evenNum =0;
		int oddNum = 0;
		for(int num = startIndex; num<=endIndex; num++){
			if(num%2==0){
				evenNum = evenNum + num;
			}else if(num%2==1){
				oddNum = oddNum + num;
			}	
		}
		diff = oddNum - evenNum;
		System.out.println(diff);
	}	
	
	void oddNumReverseOrder(int startIndex, int endIndex){
		for(int num = endIndex; num >= startIndex; num--){
			if(num%2==1){
				System.out.println(num);
			}	
		}	
	}	
	
	public static void main(String[] args){
		Numbers numbers = new Numbers();
		numbers.printEvenNumber(10,15);
		numbers.printNumberDivisibleBy5(10,30);
		numbers.printNumberDivisibleBy5And3(5,18);
		numbers.printNumberDivisibleBy7Or13(5,40);
		numbers.sumOfNumbers(1,5);
		numbers.diffBetweenSumOfOddAndEven(3,9);
		numbers.oddNumReverseOrder(10,20);
	}
}