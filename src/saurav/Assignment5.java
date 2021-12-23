package saurav;
class Assignment5{
	
	void printEvenNumbers(int startIndex, int endIndex){
		System.out.println("Method 1");
		for(int num=startIndex; num<=endIndex; num++){
		   if(num%2==0)
				System.out.println("Even numbers are = "+num);	
		}
	}
	
	void divisibleByFive(int startIndex ,int endIndex){
		System.out.println("Method 2");
		for(int num=startIndex; num<=endIndex; num++){
			if(num%5 == 0)
				System.out.println("Numbers divisible by 5 ="+num);
		}
	}
			
	void divisivleByFiveAndThree(int startIndex,int endIndex){
		System.out.println("Method 3");
		for(int num=startIndex; num<=endIndex; num++){
			if(num%5==0 && num%3==0)
				System.out.println("Number divisible by 5&3 are "+num);
		}
	}	
	
	void divisibleBySevenOrThirteen(int startIndex,int endIndex){
		System.out.println("Method 4");
		for(int num=startIndex; num<=endIndex; num++){
			if(num%7==0 )
				System.out.println(num+" is divisible by 7 ");
			else if(num%13==0)
				System.out.println(num+" is divisible by 13 "  );
		}
	}	
	
	void sumOfNumbers(int startNum, int endNum){
		System.out.println("Method 5");
		int sum=0;
		for(int num=startNum; num<=endNum; num++)
			sum= sum+num;
			System.out.println("Sum is "+ sum);
	}	
	
	void diffOfOddAndEvenNum(int startNum, int endNum){
		System.out.println("Method 6");
		int evenSum= 0;
		int oddSum = 0;
		int totalDiff = 0;
		for(int num=startNum; num<=endNum; num++){
			if(num%2==0)
				evenSum = num+evenSum;
			else if (num%2!=0)
				oddSum = num+oddSum;
		}
		
		totalDiff = oddSum	- evenSum;
			System.out.println(totalDiff);
	}
	
	void printOddNumbers(int startNum, int endNum){
		System.out.println("Method 7");
		for(int num=startNum; num>=endNum; num--)
			if(num%2!=0)
				System.out.println("Odd number is = "+num);
	}
	
    public static void main(String[] a){
		Assignment5 assignment5 = new Assignment5();
		assignment5.printEvenNumbers(10,15)	;
		System.out.println("------------------------------------------");
		assignment5.divisibleByFive(10,30);
		System.out.println("------------------------------------------");
		assignment5.divisivleByFiveAndThree(5,18);
		System.out.println("------------------------------------------");
		assignment5.divisibleBySevenOrThirteen(5,40);
		System.out.println("------------------------------------------");
		assignment5.sumOfNumbers(1,5);
		System.out.println("------------------------------------------");
		assignment5.diffOfOddAndEvenNum(3,9);
		System.out.println("------------------------------------------");
		assignment5.printOddNumbers(20,10);
		System.out.println("------------------------------------------");
	}	
}