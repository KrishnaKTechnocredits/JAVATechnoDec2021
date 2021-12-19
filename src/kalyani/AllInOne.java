package kalyani;

class AllInOne {
	
	void evenNum(int startNumber, int endNumber){
		System.out.println("Even numbers are:");
			for(int num = startNumber; num<=endNumber; num++) {
				if(num%2 ==0)
					System.out.println(num);
			}
	}
	
	void divNumFive (int startNumber, int endNumber) {
		System.out.println("Divisible by 5, numbers are:");
			for(int num = startNumber; num<=endNumber; num++) {
				if(num%5 ==0)
				System.out.println(num);
		}
	}
	
	void divNumFiveAndThree(int startNumber, int endNumber) {
		System.out.println("Divisible by 5 & 3, numbers are:");
			for(int num = startNumber; num<=endNumber; num++) {
				if(num%5 ==0 && num%3==0)
					System.out.println(num);
			}
	}
	
	void divNumSevenOrThirteen(int startNumber, int endNumber) {
		System.out.println("Divisible by 7 or 13, numbers are:");
			for(int num = startNumber; num<=endNumber; num++) {
				if(num%7 ==0)
					System.out.println(num+ " is divisible by 7");
				else if(num%13==0)
					System.out.println(num+ " is divisible by 13");
			}
	}
	
	void diffOfOddandEvenSum(int startNumber, int endNumber) {
		int temp1=0, temp2=0;
		int diff;
		System.out.println("difference between sum of odd numbers and even numbers in a given range");
			for(int num = startNumber; num<=endNumber; num++) {
				if(num%2 ==0) 
					temp1 =temp1+num;
				else
					temp2 =temp2+num;
		}	
		diff = temp2-temp1;
		System.out.println(diff);
	}
	
	void oddNumRev(int startNumber, int endNumber){
		System.out.println("Reverse odd no. are:");
			for(int num = startNumber; num>=endNumber; num--){
				if(num%2!=0)
				System.out.println(num);			
			}
	}
	
	void sumOfAllNum(int startNumber, int endNumber) {
		int sum = 0;
		System.out.println("Sum of all numders in range are:");
			for(int num = startNumber; num<=endNumber; num++) {
				sum = sum+num;
			}
		System.out.println(sum);
	}
		
	public static void main (String args[]) {
		AllInOne allinone = new AllInOne();
		allinone.evenNum(10,15);
		allinone.divNumFive(10,30);
		allinone.divNumFiveAndThree(5,18);
		allinone.divNumSevenOrThirteen(5,40);
		allinone.sumOfAllNum(1,5);
		allinone.oddNumRev(20,10);
		allinone.diffOfOddandEvenSum(3,9); 
	}
}	