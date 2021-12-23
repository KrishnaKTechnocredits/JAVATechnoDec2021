package nishika;

class A5_assignment5{
	
	void evenNumber(int startIndex , int endIndex){
		System.out.println("------------------------method 1 ----------------------");
		for(int num=startIndex ; num<=endIndex;num++){
			if(num%2==0)
				System.out.println( "even num is = "+ num);	
		}
	}
	
	void divisibleByFive(int startIndex , int endIndex){
		System.out.println("------------------------method 2 ----------------------");
		for(int num=startIndex ; num<=endIndex;num++){
			if(num%5==0)
				System.out.println( "divide by five num is = "+ num);
			
		}
	}
	
	void divisibleByFiveThree(int startIndex , int endIndex){
		System.out.println("------------------------method 3 ----------------------");
		for(int num=startIndex ; num<=endIndex;num++){
			if(num%3==0 && num%5==0)
				System.out.println( "Num divide by five and three is = "+ num);
			
		}
	}
	
	void divisibleBySevenAndThirteen(int startIndex , int endIndex){
		System.out.println("------------------------method 4 ----------------------");
		for(int num=startIndex ; num<=endIndex;num++){
			if(num%7==0)
				System.out.println(num+"  is divide by 7");
			else if (num%13==0)
				System.out.println(num+"  is divide by 13");
		}
	}
	
	void sumTotal(int startIndex , int endIndex){
		System.out.println("------------------------method 5 ----------------------");
		int sum=0;
		for(int num=startIndex ; num<=endIndex;num++){
			sum = num+sum;
		}System.out.println( "sum  = "+sum);
	}
	
	void oddNumber(int startIndex , int endIndex){
		System.out.println("------------------------method 7----------------------");
		for(int num=startIndex ; num>=endIndex; num--){
			if(num % 2 != 0){
				System.out.println(" odd num is" +num);
			}
		}
	}
	
		public static void main(String[] args){
		A5_assignment5 a5_assignment5 = new A5_assignment5();	
		a5_assignment5.evenNumber(10,15);
		a5_assignment5.divisibleByFive(10,30);
		a5_assignment5.divisibleByFiveThree(5,18);
		a5_assignment5.divisibleBySevenAndThirteen(5,40);
		a5_assignment5.sumTotal(1,5);	
		a5_assignment5.oddNumber(20,10);	
	}
}