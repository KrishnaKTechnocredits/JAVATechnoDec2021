package technocredits;

public class PrimeNumber {
	int sum, count;
	float primeAvg;
	
	void isPrimeNumber(int num, boolean nonPrimePrintFlag){
		boolean flag = true;
		for(int index=2;index<=num/2;index++) {
			if(num%index == 0) {
				if(nonPrimePrintFlag == true)
					System.out.println(num + " is not a prime number");
				flag = false;
				break;
			}
		}
		if(flag == true) {
			System.out.println(num + " is prime");
			count++;
			sum = sum + num;
		}
	}
	
	void findPrimeNumberInRange(int fnum, int lnum, boolean nonPrimePrintFlag) {
		for(int startNum = fnum; startNum<=lnum; startNum++) {
			isPrimeNumber(startNum, nonPrimePrintFlag);
		}
	}
	
	void totalPrimeNumbersInRange(int fnum, int lnum) {
		count = 0;
		for(int startNum = fnum; startNum<=lnum; startNum++) {
			isPrimeNumber(startNum, false);
		}
		System.out.println("Range is from " + fnum + " to " + lnum + count); // 26
	}
	
	void displaySumOfPrimeNumbersInRange(int fnum, int lnum) {
		//count = 0;
		//sum = 0;
		for(int startNum = fnum; startNum<=lnum; startNum++) {
			isPrimeNumber(startNum, false);
		}
		//System.out.println(sum);
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrimeNumber(44, true);
		primeNumber.findPrimeNumberInRange(2,100,false);
		primeNumber.findPrimeNumberInRange(2,100,true);
	}
}
