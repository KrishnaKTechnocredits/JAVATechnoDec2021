package monikaArkade;

public class Test1_SumOfPrimeNumbers {
	int count;
	int sum=0;
	
	void primeNumberInRange(int firstnum, int lastnum) {
		for(int startnum=firstnum;startnum<=lastnum;startnum++) {
			if(startnum%2!=0 && count<=10) {
				//System.out.println(startnum);
				sum = sum + startnum;
				count++;
			}
		}
	}
	
	void sumOfPrimeNumber() {
		System.out.println("Sum of 1st 10 numbers prime numbers : "+sum);
	}

	public static void main(String[] args) {
		Test1_SumOfPrimeNumbers primeNumber = new Test1_SumOfPrimeNumbers();
		primeNumber.primeNumberInRange(10, 100);
		primeNumber.sumOfPrimeNumber();
	}
}
