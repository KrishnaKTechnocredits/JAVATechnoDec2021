package yogeshNimbalkar;
//Assignment - 5 : 16 Dec 2021
class MathCalculation{
	
	void printEvenNumbers(int startIndex, int endIndex){
		System.out.println("Even numbers are :");
		for(int num = startIndex; num <= endIndex; num++)
			if(num % 2 == 0)
				System.out.println(num);
	}
	
	void printNumDivByFive(int startIndex, int endIndex){
		System.out.println("Divisible by 5, numbers are :");
		for(int num = startIndex; num <= endIndex; num++)
			if(num % 5 == 0)
				System.out.println(num);
	}
	
	void printNumDivBy5And3(int startIndex, int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are :");
		for(int num = startIndex; num <= endIndex; num++)
			if((num % 5 == 0) && (num % 3 == 0))
				System.out.println(num);		
	}
	
	void printNumDivBy7Or13(int startIndex, int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are :");
		for(int num = startIndex; num <= endIndex; num++){
			if(num % 7 == 0) 
				System.out.println(num + " is divisible by 7" );
			else if(num % 13 == 0)
				System.out.println(num + " is divisible by 13" );
		}
	}
	
	void printSum(int startIndex, int endIndex){
		int sum = 0;
		for(int num = startIndex; num <= endIndex; num++)
			sum = sum + num;
		System.out.println("Sum is " + sum);
	}
	
	void printOddEvenDifference(int startIndex, int endIndex){
		int difference=0;
		for(int num = startIndex; num <= endIndex; num++){
			if(num % 2 == 0)
				difference = difference - num;
			else
				difference = difference + num;
		}
		System.out.println("Difference is " + difference);
	}
	
	void printOddNumbers(int startIndex, int endIndex){
		System.out.println("Odd numbers in revers order : ");
		for(int num = endIndex; num >= startIndex; num--)
			if(num % 2 != 0)
				System.out.println(num);
	}
	
	public static void main(String[] args){
		MathCalculation mathcalculation = new MathCalculation();
		mathcalculation.printEvenNumbers(10,15);
		mathcalculation.printNumDivByFive(10,30);
		mathcalculation.printNumDivBy5And3(5,18);
		mathcalculation.printNumDivBy7Or13(5,40);
		mathcalculation.printSum(1,5);
		mathcalculation.printOddEvenDifference(3,9);
		mathcalculation.printOddNumbers(10,20);
	}
}