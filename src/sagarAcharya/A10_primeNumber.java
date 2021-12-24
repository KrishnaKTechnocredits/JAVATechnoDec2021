package sagarAcharya;

public class A10_primeNumber {
	int sum = 0;
	int count = 0;
	
	void primeNumber(int num){
		boolean primeFlag = true;
		for(int index = 2;index<=num/2;index++){
			if(num % index == 0){
				//System.out.println(num +" is not a prime number.");
				primeFlag = false;
				break;
			}
		}
		if(primeFlag == true) {
			System.out.println(num + " is a prime number.");
			sum = sum + num;
			count++;
		}
	}
	
	void primeRange(int firstNum, int secondNumber){
		System.out.println("Prime in range is :" );
		for(int index = firstNum;index<=secondNumber;index++){
			primeNumber(index);
		}
	}
	
	void countPrimeRange(int firstCountNum, int secondCountNumber){
		count = 0;
		for(int index = firstCountNum;index<=secondCountNumber;index++){
			primeNumber(index);
		}
		System.out.println(count);
	}
	
	void sumPrimeRange(int firstSumNum, int secondSumNumber){
		sum = 0;
		for(int index = firstSumNum;index<=secondSumNumber;index++){
			primeNumber(index);
		}
		System.out.println(sum);
	}
	
	void averagePrimeRange(int firstANum, int secondANum) {
		count = 0;
		sum = 0;
		for(int index = firstANum;index<=secondANum;index++) {
			primeNumber(index);
		}
		int average = sum / count;
		System.out.println("Average of all prime number is :" + average);
	}
	
	public static void main(String[] args){
	A10_primeNumber a10_primenumber = new A10_primeNumber();
	a10_primenumber.primeNumber(17);
	a10_primenumber.primeRange(10, 80);
	a10_primenumber.countPrimeRange(10, 80);
	a10_primenumber.sumPrimeRange(10, 80);
	a10_primenumber.averagePrimeRange(10, 80);
	}
}
