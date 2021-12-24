package pranoti;

public class A10_PrimeNumber {
	int count=0 ,sum=0;
	void isPrimeNumber(int num) {
		boolean flag = true;
		for(int index = 2; index <= num/2; index++) {
			if(num % index == 0) {
				System.out.println(num + " is not prime number");
				flag=false;
				break;
			}
		}
		if(flag == true)
			System.out.println(num +" is Prime number");
		System.out.println("-------------------------------------------");
	}
	
	void findonlyPrimeNumber(int num){
		boolean flag = true;
		for (int index = 2; index <= num/2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is prime number");
			sum = sum + num;
			count++;
			
		}
	}
	
	void findPrimeNumberInRange(int firstNum, int lastNum) {
		System.out.println("Prime numbers in given range " + firstNum + " To " +lastNum + " are : ");
		for(int index = firstNum; index<=lastNum; index++) {
			findonlyPrimeNumber(index);
		}
	}
	
	void primeNumberCount(int firstNum, int lastNum) {
		System.out.println("-------------------------------------------");
		count=0;
		for (int index = firstNum; index <= lastNum; index++) {
			findonlyPrimeNumber(index);
			}
		System.out.println("Total prime numbers in given range " + firstNum + " To " +lastNum + " is: " + count);
		
	}
	
	void sumOfPrimeNumbers(int firstNum, int lastNum) {
		System.out.println("-------------------------------------------");
		sum=0;
		count=0;
		for (int index = firstNum; index <= lastNum; index++) {
			findonlyPrimeNumber(index);
			}
		System.out.println("Sum of prime numbers in given range " + firstNum + " To " +lastNum + " is: " + sum);
		
	}
	
	void findAvgOfPrimeNumbers(int firstNum, int lastNum) {
		System.out.println("-------------------------------------------");
		sum=0;
		count=0;
		for (int index = firstNum; index <= lastNum; index++) {
			findonlyPrimeNumber(index);
			}
		System.out.println("Average of prime numbers in given range " + firstNum + " To " +lastNum + " is: " + (sum/count));
		
	}

	public static void main(String[] args) {
		A10_PrimeNumber primeNumber = new A10_PrimeNumber();
		primeNumber.isPrimeNumber(7);
		primeNumber.isPrimeNumber(15);
		primeNumber.findPrimeNumberInRange(10, 20);
		primeNumber.primeNumberCount(10, 20);
		primeNumber.sumOfPrimeNumbers(30, 40);
		primeNumber.findAvgOfPrimeNumbers(50, 70);
	}

}
