package priya;

public class Test1_P2 {
	
		int countPrimeNumber;
		
		void numberIsPrime(int num) {
			boolean flag = true;
			
			for(int index=2; index<num/2; index++) {			
				if(num%index == 0) {
					flag = false;
					break;
				}	
			}
			if(flag == true) {
				countPrimeNumber++;
			}
		}
		
		
		void printPrimeNumberInGivenRange(int startNum, int lastNum) {
			int sumOfNumber=0;
			for(int index =startNum; index<=lastNum; index++) {
				if(countPrimeNumber<10) {			
					numberIsPrime(index);
					sumOfNumber = sumOfNumber+index;				
				}			
			}
			System.out.println(sumOfNumber);
		}
		
		public static void main(String[] args) {
			Test1_P2 sumPrime = new Test1_P2();
			sumPrime.printPrimeNumberInGivenRange(100, 200);
			
		}
		
}
