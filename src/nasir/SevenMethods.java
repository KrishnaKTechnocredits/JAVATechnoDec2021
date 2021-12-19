package nasir;
class SevenMethods{
	void evenOdd(int startNumber, int endNumber){
		System.out.println("Output of First Method is shown below :");
		for(int num=startNumber; num<=endNumber;num++){
			if(num%2==0)
				System.out.println(num+" is even number");
			else
				System.out.println(num+" is odd number");		
		}	
		System.out.println("..............................................");
	}
	
	void divisible( int startNumber, int endNumber){
		System.out.println("Output of Second Method is shown below :");
		for(int num=startNumber; num<=endNumber;num++){
			if(num%5==0)
				System.out.println(	num+" divisible by 5");
			}
		System.out.println("..............................................");
	}
	
	void twoDivision( int startNumber, int endNumber){
		System.out.println("Output of third Method is shown below :");
		for(int num=startNumber; num<=endNumber;num++){
			if(num%5==0&& num%3==0)
				System.out.println(	num+" divisible by 5 and 3");
			}
		System.out.println("..............................................");
	}
	
	void thirdDivision( int startNumber, int endNumber){
		System.out.println("Output of Fourth Method is shown below :");
		for(int num=startNumber; num<=endNumber;num++){
			if(num%7==0)
				System.out.println(	num+" divisible by 7");
			if(num%13==0)
				System.out.println(	num+" divisible by 13");
			}
		System.out.println("..............................................");
	}
	
	void sum(int startNumber,int endNumber){
		System.out.println("Output of Fifth Method is shown below :");
		int sum=0;
		for(int num=startNumber; num<=endNumber;num++){
			sum=sum+num;
		}
		System.out.println("Total sum of number is "+sum);	
		System.out.println("..............................................");
	}
	 void difference(int startNumber,int endNumber){
		 System.out.println("Output of sixth Method is shown below :");
		int sumEven=0;
		int sumOdd=0;
		for(int num=startNumber; num<=endNumber;num++){
			if(num%2==0)
				sumEven=sumEven+num;
			if(num%2!=0)
				sumOdd=sumOdd+num;	
		}
		System.out.println("Difference between sum of odd numbers and even numbers is "+(sumOdd-sumEven));	
		System.out.println("..............................................");
	}
	
	void reverseOrder( int startNumber, int endNumber){
		System.out.println("Output of Seventh Method is shown below :");
		for(int num=endNumber; num>=startNumber;num--){
			if(num%2!=0)
			System.out.println(num);
			}
		System.out.println("..............................................");
	}
	
	public static void main(String[]args){
		SevenMethods sevenmethods=new SevenMethods();
		sevenmethods.evenOdd(10,15);
		sevenmethods.divisible(10,30);
		sevenmethods.twoDivision(5,18);
		sevenmethods.thirdDivision(5,40);
		sevenmethods.sum(1,5);
		sevenmethods.difference(3,9);
		sevenmethods.reverseOrder(10,20);
	}
}