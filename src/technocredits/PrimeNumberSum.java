package technocredits;

public class PrimeNumberSum {

	boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	void getSumOfPrimeNumbersInRange(int startRange, int endRange) {
		int sum = 0;
		for(int num=startRange; num<=endRange; num++) { // 1 //4
			boolean flag = isPrimeNumber(num); // 2
			if(flag == true) {
				System.out.println(num + " is prime");
				sum = sum + num;
			}
		}
		System.out.println("Sum of all prime number, " + sum);
	}
	
	public static void main(String[] args) {
		PrimeNumberSum primeNumberSum = new PrimeNumberSum();
		primeNumberSum.getSumOfPrimeNumbersInRange(2, 100);
	}
	
}
