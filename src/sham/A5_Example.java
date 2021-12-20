package sham;
class A5_Example{

	void evenNo(int startNO,int endNO){
		System.out.println("------EVEN Num--------");
		for(int i=startNO;i<=endNO;i++){
			if(i%2==0)
				System.out.println(i);
		}	
	}
	void divisibleByFive(int startNO,int endNO){
		System.out.println("------Divide by 5--------");
		for(int i=startNO;i<=endNO;i++){
			if(i%5==0)
				System.out.println(i);
		}	
	}
	
	void divisibleByFiveAndThree(int startNO,int endNO){
		System.out.println("------Divide by 3 & 5--------");
		for(int i=startNO;i<=endNO;i++){
			if(i%3==0 && i%5==0)
				System.out.println(i);
		}	 
	}
	
	void divisibleByTherteenAndSeven(int startNO,int endNO){
		System.out.println("------Divide by 7 & 13--------");
		for(int i=startNO;i<=endNO;i++){
			if(i%13==0 || i%7==0){
				//System.out.println(i);
				if(i%7==0){
					System.out.println(i+"  is divisibleBy 7");
				}	
				else if(i%13==0)
					System.out.println(i+" is divisibleBy 13");
		}	}
		
		
	}
	
	void sumOfAll(int startNO, int endNO){
		System.out.println("------Sum of all Num--------");
		int sum=0;
			for(int i=startNO;i<=endNO;i++){
				sum=startNO+endNO;
			}
			System.out.println(sum);
	}
	
	void differenceBetweenSumOfOdd(int startNO, int endNO)
	{
		System.out.println("------difference Between Sum Of Odd--------");
		int even=0;
		int odd=0;
		for(int i=startNO;i<=endNO;i++){
			if(i%2==0)
				even= even+i;
			else
				odd= odd+i;
		}	
		System.out.println(odd-even);
		
	}
	
	void oddNumberReverse(int startNO, int endNO)
	{
		System.out.println("------ODD reverse numbers--------");
		for(int i = endNO;i > startNO; i--){
			if(i%2!=0)
				System.out.println(i);
		}	
	}
	public static void main(String args[]){
		A5_Example assignment= new A5_Example();
		assignment.evenNo(10,15);
		assignment.divisibleByFive(10,30);
		assignment.divisibleByFiveAndThree(5,18);
		assignment.divisibleByTherteenAndSeven(5,40);
		assignment.sumOfAll(1,5);
		assignment.differenceBetweenSumOfOdd(3,9);
		assignment.oddNumberReverse(10,20);
				
		
	}
}