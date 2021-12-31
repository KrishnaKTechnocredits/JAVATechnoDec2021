package pradeep;

public class A10_PrimeNumbers {
	int count, sum;
		
	void findPrimeNumber(int num) {
		boolean flag = true;
		for(int index = 2; index <= num/2; index++) {
			if(num%index == 0) {
				//System.out.println(num+ " is not a Prime Number");
				flag =false;
				break;
			}
		}
		if(flag==true) {
			System.out.println(num + " is Prime Number");
			sum= sum + num;
			count++;
		}
	}
	
	void findPrimeNumberInRange(int fNum, int lNum) {
		for(int startNum = fNum; startNum <= lNum; startNum++) {
			findPrimeNumber(startNum);
		}
	}
	
	void countPrimeNumberInRange(int fNum, int lNum) {
		count=0;
		for(int startNum = fNum; startNum <= lNum; startNum++) {
			findPrimeNumber(startNum);
		}
		System.out.println("Total number of Prime Number is " + count);
	}
	
	void sumOfPrimeInRange(int fNum, int lNum) {
		sum=0;
		for(int startNum = fNum; startNum <= lNum; startNum++) {
			findPrimeNumber(startNum);
		}
		System.out.println("Sum of Prime number is " + sum);
	}
	
	void avgOfPrimeNumberInRange(int fNum, int lNum) {
		count=0; 
		sum=0;
		int avg;
		for(int startNum = fNum; startNum <= lNum; startNum++) {
			findPrimeNumber(startNum);
		}
		avg= sum/count;
		System.out.println("Average of all Prime number is " + avg);
	}

	
	public static void main(String[] args) {
		A10_PrimeNumbers a10_PrimeNumbers =new A10_PrimeNumbers();
		System.out.println("*****method to find a given number is prime.****");
		a10_PrimeNumbers.findPrimeNumber(19);
		System.out.println("*****method to find out all prime numbers from given range.****");
		a10_PrimeNumbers.findPrimeNumberInRange(10,20);
		System.out.println("*****method to find out how many prime numbers are there in given range.****");
		a10_PrimeNumbers.countPrimeNumberInRange(10, 20);
		System.out.println("*****method to find sum of all prime number in given range.****");
		a10_PrimeNumbers.sumOfPrimeInRange(10,20);
		System.out.println("*****method to find average of all prime numbers in given range.****");
		a10_PrimeNumbers.avgOfPrimeNumberInRange(10,20);
	}
}
