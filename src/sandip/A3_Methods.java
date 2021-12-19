package sandip;

class A3_Methods{
	
	void evenNumbers(double start, double end){
		for(double num = start; num <=end; num++){
			if(num%2==0){
				System.out.println(num +" is an even number");  //Even Number
			}
		}
	}
	
	void devideOne(double start, double end){
		for(double num = start; num <=end; num++){
			if(num%5==0){
				System.out.println(num +" is devided by 5");  //Devisible by 5
			}
		}
	}
	
	void devideTwo(double start, double end){
		for(double num = start; num <=end; num++){
			if(num%5==0 && num%3==0){
				System.out.println(num +" is devided by 5 and 3");  //Devided by 5 and 3
			}
		}
	}
	
	void devideThree(double start, double end){
		for(double num = start; num <=end; num++){
			if(num%7==0){
				System.out.println(num +" is devisible by 7");
			}else if(num%13==0){
				System.out.println(num +" is devisible by 13");  //Devisible by 7 or 13
			}
		}
	}
	
	void rangeAddition(double start, double end){
		double total=0;
		for(double num = start; num <=end; num++)
			total=total+num;
			System.out.println(total+ "is the addition");  //addition of range
	}
	
	void diffBetweenSumOfOddAndEven(double start, double end){
		double diff=0;
		double odd=0;
		double even=0;
		for(double num = start; num<=end; num++){
			if(num%2==0)
				even=even + num;
			else
				odd=odd+num;
		}
		diff=odd-even;
		System.out.println(diff+" is the diffrence"); //diff
	}
	
	void oddReverse(int start,int end){
		System.out.println("Odd numbers in reverse are ");
		for(int num = start; num>=end; num--){
			if(num%2!=0)
			System.out.println(num);	//odd reverse
		}
	}		
	
	public static void main(String[]args){
		A3_Methods methods_1=new A3_Methods();
		System.out.println("Following are the prime numbers :");
		methods_1.evenNumbers(12,20);
		System.out.println();
		System.out.println("Following are the numbers devided by 5 :");
		methods_1.devideOne(14,20);
		System.out.println();
		System.out.println("Following numbers are devided by 5 abd 3 :");
		methods_1.devideTwo(15,25);
		System.out.println();
		System.out.println("Following numbers are devided by 7 and 13 :");
		methods_1.devideThree(10,50);
		System.out.println();
		methods_1.rangeAddition(1,5);
		System.out.println();
		methods_1.diffBetweenSumOfOddAndEven(3,9);
		System.out.println();
		methods_1.oddReverse(20,10);
		System.out.println();
	}
}