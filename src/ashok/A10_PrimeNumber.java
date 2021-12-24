package ashok;

public class A10_PrimeNumber {
	double sum = 0;
	double count = 0;
	double  averge =0;
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
			averge = sum/count;
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
		System.out.println("The Average of Prime number is " + averge);
	}
	
	void countPrimeNumber(int num1, int num2) {
		
		isPrimenumberRange(num1, num2);
		System.out.println("The count of Prime number is " + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A10_PrimeNumber a10_PrimeNumber = new A10_PrimeNumber();
		A10_PrimeNumber a10_PrimeNumber1 = new A10_PrimeNumber();
		A10_PrimeNumber a10_PrimeNumber2 = new A10_PrimeNumber();
		A10_PrimeNumber a10_PrimeNumber3 = new A10_PrimeNumber();
		A10_PrimeNumber a10_PrimeNumber4 = new A10_PrimeNumber();
		System.out.println("Method to find a given number is prime.");
		a10_PrimeNumber1.isPrimenumberCal(13);
		System.out.println("_________________________________");
		System.out.println("Method to find out all prime numbers from given range");
		a10_PrimeNumber2.isPrimenumberRange(1,10);
		System.out.println("_________________________________");
		System.out.println("Method to find sum of all prime number in given range.");
		//a10_PrimeNumber.
		a10_PrimeNumber3.sumPrimeNumber(20,30);
		System.out.println("_________________________________");
		System.out.println("Method to find Average of all prime number in given range.");
		a10_PrimeNumber4.averagePrimeNumber(1,10);
		//a10_PrimeNumber.countPrimeNumber(20,30);
	}

}
