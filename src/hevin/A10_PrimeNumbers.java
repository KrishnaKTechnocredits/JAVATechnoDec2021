package hevin;

public class A10_PrimeNumbers {
	int sum = 0;
	int count = 0;
	double  average =0;
	
	void isPrimenumberCal(int number) {
		boolean bl = true;
		for(int index =2; index <= number/2 ; index++) {
			if(number % index == 0) {
				//System.out.println(number  + "  Number is not prime Number");
				bl = false;
				break;
			}
		}
		if(bl==true) {
			count++;
			System.out.println(number + "  Number is prime number" );
			sum = sum + number;
			average = sum/count;
			//break;
		}
	}
	
	void sumPrimeNumber(int num1, int num2) {
		isPrimenumberRange(num1, num2);

		System.out.println("The sum of Prime number is " + sum);

	}

	void isPrimenumberRange(int fNumber, int lNumber) {
		for(int sNum= fNumber; sNum <= lNumber; sNum++ ) {
			isPrimenumberCal(sNum);
		}
	}

	void averagePrimeNumber(int num1, int num2) {
		isPrimenumberRange(num1, num2);
		System.out.println("The Average of Prime number is " + average);
	}

	void countPrimeNumber(int num1, int num2) {
		isPrimenumberRange(num1, num2);
		System.out.println("Total count of Prime numbers in Given Range : " + count);
	}
	
	public static void main(String[] args) {
		A10_PrimeNumbers m1 = new A10_PrimeNumbers();
		A10_PrimeNumbers m2 = new A10_PrimeNumbers();
		A10_PrimeNumbers m3 = new A10_PrimeNumbers();
		A10_PrimeNumbers m4 = new A10_PrimeNumbers();
		A10_PrimeNumbers m5 = new A10_PrimeNumbers();
		System.out.println("===========================================");
		m1.isPrimenumberCal(17);
		System.out.println("===========================================");
		System.out.println("All prime numbers from given range");
		m2.isPrimenumberRange(30,40);
		System.out.println("===========================================");
		System.out.println("Sum of all prime numbers in given range.");
		m3.sumPrimeNumber(20,40);
		System.out.println("===========================================");
		System.out.println("Average of all prime number in given range.");
		m4.averagePrimeNumber(30,50);
		System.out.println("===========================================");
		System.out.println("Total Count of all prime number in given range.");
		m5.countPrimeNumber(20,30);
	}
}