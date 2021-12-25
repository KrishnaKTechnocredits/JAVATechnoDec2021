package ashish;

public class Test1_PrimeNumberOperations {

	void sumOfFirstNPrimes(int start, int end, int n) {
		// TODO Auto-generated method stub
		int primeCount = 0, sum = 0, num = start;
		boolean primeNotFound = true;
		while(primeCount <= n && num <= end) {
			if(isPrime(num) == true) {
				primeCount++;
				sum = sum + num;
				primeNotFound = false;
			}
			num++;
		}
		if(primeNotFound == true)
			System.out.println(" No Prime Numbers Found in Range (" + start + "," + end + ")");
		else
			System.out.println(" Sum of First " + n + " Prime Numbers in Range (" + start + "," + end + ") is : " + sum);
	}
	
	boolean isPrime(int number) {
		boolean flag = true;
		for(int i=2; i<(number/2); i++) {
			if(number % i == 0)
				flag = false;			
		}
		if(flag == true)
			System.out.println(" " + number);
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_PrimeNumberOperations primeNumberOperations = new Test1_PrimeNumberOperations();
		System.out.println();
		primeNumberOperations.sumOfFirstNPrimes(14,16,10);
		System.out.println();
		primeNumberOperations.sumOfFirstNPrimes(5,40,10);
	}
}
