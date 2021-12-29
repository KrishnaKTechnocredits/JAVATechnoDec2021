package pranoti;

public class T1_PrimeNumberSum {
	boolean isPrimeNumber(int num) {
		boolean isPrime=true;
		for(int index=2;index<=num/2;index++) {
			if(num % index == 0) {
				isPrime=false;
				break;
			}
		}
	return isPrime;
	}
	
	void sumOfPrimNum(int num1) {
		int sum=0;
		int primeCount=1;
		for(int num = 2; primeCount <=num1; num++) {
			boolean primeFlag = isPrimeNumber(num);
			if(primeFlag == true) {
			primeCount++;
			sum =sum+num;
			}
		}
		System.out.println("Sum of first prime numbers is  " +num1+ " is :" +sum);
		} 
	
	public static void main(String[] args) {
		T1_PrimeNumberSum primeNumberSum =new T1_PrimeNumberSum();
		primeNumberSum.sumOfPrimNum(10);
	
	}
}
