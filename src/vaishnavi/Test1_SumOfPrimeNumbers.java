package vaishnavi;

public class Test1_SumOfPrimeNumbers {
	
	int sum =0;
	int count=0;
	int primeNumber;

	void isPrimeNumber(int num) {
		boolean flag = true;
		for(int index = 2;index<=num/2;index++) {
			if(num%index==0) {
			flag = false;
			break;
			}
		}
			if(flag == true) {
			primeNumber++;
			}
	}
	void findSumOfFirstTenPrimeNum(int startNum, int endNum) {
		int sum=0;
		for(int index =startNum;index <= endNum;index++) {
			if(primeNumber < 10) {
				isPrimeNumber(startNum);
				sum=sum+index;

			}
		}
		System.out.println("Sum of first 10 prime number is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_SumOfPrimeNumbers test1_SumOfPrimeNumbers = new Test1_SumOfPrimeNumbers();
		test1_SumOfPrimeNumbers.findSumOfFirstTenPrimeNum(1, 10);

	}

}
