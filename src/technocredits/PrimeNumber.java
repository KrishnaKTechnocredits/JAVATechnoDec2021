package technocredits;

public class PrimeNumber {

	void isPrimeNumber(int num){
		boolean flag = true;
		for(int index=2;index<=num/2;index++) {
			if(num%index == 0) {
				System.out.println(num + " is not a prime number");
				flag = false;
				break;
			}
		}
		if(flag == true)
			System.out.println(num + " is prime");
	}
	
	void findPrimeNumberInRange(int fnum, int lnum) {
		for(int startNum = fnum; startNum<=lnum; startNum++) {
			isPrimeNumber(startNum);
		}
	}
	
	void totalPrimeNumbersInRange(int fnum, int lnum) {
		for(int startNum = fnum; startNum<=lnum; startNum++) {
			isPrimeNumber(startNum);
		}
		System.out.println(); // 26
	}
	
	void displaySumOfPrimeNumbersInRange(int fnum, int lnum) {
		for(int startNum = fnum; startNum<=lnum; startNum++) {
			isPrimeNumber(startNum);
		}
		//System.out.println(sum);
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrimeNumber(44);
		primeNumber.findPrimeNumberInRange(2,100);
	}
}
