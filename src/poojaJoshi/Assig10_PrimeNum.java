package poojaJoshi;

public class Assig10_PrimeNum {
	
	int count;
	int sum = 0;

	void isPrimeNumber(int num) {
		boolean flag = true;
		for(int index=2; index<=num/2; index++) {
			if(num % index == 0) {
				flag = false;
				break;
			}
		}
		if(flag==true) {
			System.out.println(num+" is prime number");
			sum = sum + num;
			count++;
		}
	}

	void primeNumberInRange(int fnum, int lnum) {
		for(int startnum = fnum; startnum<= lnum; startnum++) {
			isPrimeNumber(startnum);
		}
	}

	void totalOfPrimeNumber() {
		System.out.println("\nTotal prime numbers are: "+count);
	}

	void sumOfPrimeNumber() {
		System.out.println("Sum of prime numbers: "+sum);
	}

	void avgOfPrimeNumber() {
		int avg = sum/count;
		System.out.println("Average of prime numbers: "+avg);
	}

	public static void main(String[] args) {
		Assig10_PrimeNum primenumber = new Assig10_PrimeNum();
		primenumber.isPrimeNumber(19);
		primenumber.primeNumberInRange(55, 150);
		primenumber.totalOfPrimeNumber();
		primenumber.sumOfPrimeNumber();
		primenumber.avgOfPrimeNumber();
	}
}

