package vivek;

class Assignment5{
	
	void printEvenNumber(int startNumber, int endNumber){
		System.out.println("Even numbers are:");
		for(int num = startNumber;num< endNumber; num++)
		{
			if(num%2==0)
			System.out.println(num);
		}
	}
	void divisbleByFive(int startNumber,int endNumber){
		System.out.println("divisible by 5, numbers are:");
		for(int num = startNumber; num <= endNumber; num++)
		{
			if(num%5 == 0)
			System.out.println(num);
		}
	}
	void divisiblyByFiveAndThree(int startNumber,int endNumber){
		System.out.println("divisible by 5&3,numbers are:");
		for(int num = startNumber;num<=endNumber;num++)
		{
			if(num%5==0 && num%3==0)
			System.out.println(num);
		}
	}
	void divisiblyBySevenOrThirteen(int startNumber,int endNumber){
		System.out.println("divisible by 7 or 13, numbers are:");
		for(int num = startNumber;num<=endNumber;num++)
		{
			if(num%7 == 0)
			System.out.println(num + "is divisble by 7");
			else if (num % 11 ==0)
			System.out.println(num + "is divisible by 13");
		}
	}
	void sumOfNumbers(int startNumber, int endNumber){
		int sum =0;
		for(int num =startNumber;num<=endNumber;num++)
		{
			sum = sum + num;
		}
		System.out.println("sum of numbers is:" + sum);
	}
	void diffBetweenOddEven(int startNumber, int endNumber){
		
		int evenSum =0;
		int oddSum =0;
		
		for(int num =startNumber;num<=endNumber;num++)
		{
			if(num%2==0)
				evenSum= evenSum + num;
			else
				oddSum = oddSum + num;
		}
		int diff= oddSum - evenSum;
		System.out.println("difference of odd and even number is:" + diff);
	}
	void oddNumberReverseOrder(int startNumber,int endNumber){
		System.out.println("reverse odd numbers are:");
		for(int num = endNumber;num>=startNumber;num--)
		{
			if(num%2!=0)
					System.out.println(num);
		}
	}
	
	public static void main(String[] args)
	{
		Assignment5 assignment5 = new Assignment5();
		assignment5.printEvenNumber(10,15);
		assignment5.divisbleByFive(10,30);
		assignment5.divisiblyByFiveAndThree(5,18);
		assignment5.divisiblyBySevenOrThirteen(5,40);
		assignment5.sumOfNumbers(1,5);
		assignment5.diffBetweenOddEven(3,9);
		assignment5.oddNumberReverseOrder(10,20);
	}
}