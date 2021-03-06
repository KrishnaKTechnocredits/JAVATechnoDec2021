package vishakha;

class A5_Assignment5{

	void evenNumber(int startIndex, int endIndex){
		System.out.println("Even nos. are as follows :");
		for(int num= startIndex; num<=endIndex; num++){
			if(num%2==0)
				System.out.println("  "+num);
		}
	}
	void divisibleNumbers(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 5 are as follows :");
		for(int num= startIndex; num<=endIndex; num++){
			if(num%5==0)
				System.out.println("  "+num);
		}
	}
	void divisibleByTwoNumbers(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 5 & 3 are as follows :");
		for(int num= startIndex; num<=endIndex; num++){
			if(num%5==0 && num%3==0){
				System.out.println("  "+num);
			}
		}
	}
	void dateRange(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 7 or 13 are as follows :");
		for(int num= startIndex; num<=endIndex; num++){
			if(num%7==0 || num%13==0)
				if(num%7==0)
					System.out.println(num +" is divisible by 7");
				if(num%13==0)
					System.out.println(num +" is divisible by 13");
		}
	}
	void Sum(int startIndex, int endIndex){
		System.out.println("Summ of all numbers in given range :");
		int sum = 0;
		for(int num = startIndex; num<=endIndex; num++){
			sum = sum+num;
		}
		System.out.println("  "+sum);
	}
	void Difference(int startIndex, int endIndex){
		int even = 0;
		int odd = 0;
		int total = 0;
		for(int num = startIndex; num<=endIndex; num++){
			if(num%2==0)
				even = even + num;
			else
				odd = odd + num;
			}
			total = odd - even;
			System.out.println("Difference between odd and even numbers is :" +total);
		}
		
		void oddNumbers(int startIndex, int endIndex){
			System.out.println("Odd numbers in reverse order are :");
			for(int num = endIndex; num>startIndex; num--){
				if(num%2!=0)
					System.out.println("  "+num);
			}
		}
		
		
		public static void main(String[] args){
		A5_Assignment5 assignment = new A5_Assignment5();
		assignment.evenNumber(10,15);
		System.out.println("---------------------");
		assignment.divisibleNumbers(10,30);
		System.out.println("---------------------");
		assignment.divisibleByTwoNumbers(5,18);
		System.out.println("----------------------");
		assignment.dateRange(5,40);
		System.out.println("----------------------");
		assignment.Sum(1,5);
		System.out.println("----------------------");
		assignment.Difference(3,9);
		System.out.println("----------------------");
		assignment.oddNumbers(10,20);
	}
}
			
			
			
			
			