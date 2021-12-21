package swapnali;

class MathOperation{

	void printEven(int startNumber,int endNumber){
		for(int num=startNumber;num<=endNumber;num++)
		{
			if(num%2==0){
				System.out.println("Even numbers are: "+num);
			}
		}
	}
	
	void NumDivisibleBy5(int startNumber, int endNumber){
		for(int num=startNumber;num<=endNumber;num++)
		{
			if(num%5==0){
				System.out.println("Numbers divisible by 5 are: "+num);
			}
		}
	}
	
	void NumDivisibleBy5And3(int startNumber, int endNumber){
		for(int num=startNumber;num<=endNumber;num++)
		{
			if(num%3==0 && num%5==0){
				System.out.println("Numbers divisible by 5 and 3 are: "+num);
			}
		}
	}
	
	void NumDivisibleBy7And13(int startNumber, int endNumber){
		for(int num=startNumber;num<=endNumber;num++)
		{
			if(num%7==0 || num%13==0){
				if(num%7==0)
					System.out.println("Number divisible by  7 is "+num);
				else
					System.out.println("Number divisible by 13 is "+num);
			}
		}
	}
	
	void sumOfNumber(int startNumber,int endNumber){
		int sum=0;
		for(int num=startNumber;num<=endNumber;num++){
			sum=sum+num;
		}
		System.out.println("Sum of all given numbers is "+sum);
		
	}
	void sumOfOddEven(int startNumber,int endNumber){
		int evenSum=0,oddSum=0;
		for(int num=startNumber;num<=endNumber;num++){
			if(num%2==0)
			evenSum=evenSum+num;
			else
			oddSum=oddSum+num;
		}
		System.out.println(oddSum - evenSum);
	}
	
	void oddNumber(int startNumber,int endNumber){
		for(int num=endNumber;num>=startNumber;num--){
			if(num%2!=0)
				System.out.println("Reverse of odd numbers is: "+num);
		}
	}
	
	public static void main(String[] args){
		MathOperation ops=new MathOperation();
		ops.printEven(10,15);
		ops.NumDivisibleBy5(10,30);
		ops.NumDivisibleBy5And3(5,18);
		ops.NumDivisibleBy7And13(5,40);
		ops.sumOfNumber(1,5);
		ops.sumOfOddEven(3,9);
		ops.oddNumber(10,20);
	}


}