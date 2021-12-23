package yogeshNagar;

public class A10_PrimeNumber {
	int countPrimeNumber;
	int sumPrimeNumber;
	
	void numberIsPrime(int num) {
		boolean flag = true;
		
		for(int index=2; index<=num/2; index++) {			
			if(num%index == 0) {
				flag = false;
				break;
			}	
		}
		if(flag == true) {
			countPrimeNumber++;
			sumPrimeNumber = sumPrimeNumber + num;
			System.out.println(num + " Number is prime");
		}
	}
	
	void printPrimeNumberInGivenRange(int startNum, int lastNum) {
		for(int index =startNum; index<=lastNum; index++) {
			numberIsPrime(index);
		}
	}
	
	void printCountPrimeNumberInRange() {
		System.out.println("Total prime number in range is "+countPrimeNumber);		
	}
	
	void printSumOfPrimeNumberInRange() {
		System.out.println("Sum of prime number in range is "+sumPrimeNumber);			
	}
	
	void printAvgOfPrimeNumberInRange() {
		double avgPrimeNumber = (double)sumPrimeNumber/countPrimeNumber;
		System.out.println("Avarage of prime number in range is "+avgPrimeNumber);
	}
	
	public static void main(String[] args) {
		A10_PrimeNumber primeNum = new A10_PrimeNumber();
		
		System.out.println("-----------Prime Number in range are----------- \n");
		primeNum.printPrimeNumberInGivenRange(2,100);
		System.out.println(" ");
		primeNum.printCountPrimeNumberInRange();
		System.out.println(" ");
		primeNum.printSumOfPrimeNumberInRange();		
		System.out.println(" ");
		primeNum.printAvgOfPrimeNumberInRange();
	}
}
