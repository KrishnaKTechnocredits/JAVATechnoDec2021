package apurva;

class Assignment5{
	void displayEvenNumbers(int startIndex, int endIndex){
		System.out.println("Even Numbers are :");
		for(int num= startIndex; num<=endIndex; num++){
			if(num%2==0)
				System.out.println("   "+num);
		}
	}
	void displayDivisibleNumbers(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 5 are :");
		for(int num= startIndex; num<=endIndex; num++){
			if(num%5==0)
				System.out.println("   "+num);	
		}
	}
	void displayDivisiblebyTwoNumbers(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 5 & 3 are :");
		for(int num= startIndex; num<=endIndex; num++){
			if(num%5==0 && num%3==0){
				System.out.println("   "+num);
			}
		}
	}
	void dateRange(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 7 or 13 are :");
		for(int num= startIndex; num<=endIndex; num++){
			if(num%7==0 || num%13==0)
				if(num%7==0)
					System.out.println(num +" is divisible by 7");
				if(num%13==0)
					System.out.println(num +" is divisible by 13");
		}
	}
	void displaySum(int startIndex, int endIndex){
		System.out.println("Sum of all numbers in given range :");
		int sum = 0;
		for(int num = startIndex; num<=endIndex;num++){
			sum = sum+num;	
		}
		System.out.println("    "+sum);
	}
	void displayDifference(int startIndex, int endIndex){
		int even = 0;
		int odd=0;
		int total = 0;	
		for(int num = startIndex; num<=endIndex;num++){
			if(num%2==0)
				even = even + num;
			else
				odd = odd + num;
		}
		total = odd - even;
		System.out.println("Difference of odd and even numbers are :" +total);
	}
	
	void displayOddNumbers(int startIndex, int endIndex){
		System.out.println("odd numbers in reverse order are :");
		for(int num = endIndex; num>startIndex; num--){
			if(num%2!=0)
				System.out.println("  "+num);
		}
		
	}
	
	public static void main(String[] a){
		Assignment5 assignment = new Assignment5();
		assignment.displayEvenNumbers(10,15);
		System.out.println(" --------------------------------- ");
		assignment.displayDivisibleNumbers(10,30);
		System.out.println(" --------------------------------- ");
		assignment.displayDivisiblebyTwoNumbers(5,18);
		System.out.println(" --------------------------------- ");
		assignment.dateRange(5,40);
		System.out.println(" --------------------------------- ");
		assignment.displaySum(1,5);
		System.out.println(" --------------------------------- ");
		assignment.displayDifference(3,9);
		System.out.println(" --------------------------------- ");
		assignment.displayOddNumbers(10,20);
	}
}