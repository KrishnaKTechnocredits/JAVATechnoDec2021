package vivek;

public class SumOfPrimeNumbers {


	static boolean checkPrime(int numberToCheck)
	{
		if(numberToCheck == 1) {
			return false;
		}
		for (int i = 2; i <= numberToCheck/2; i++) {
			if (numberToCheck % i == 0) {
				return false;
			}
		}
		return true;
	}


	static int primeSum(int s, int e)
	{
		int primeCount =0;
		int sum = 0;
		for (int i = s; i <= e && primeCount <10; i++) {
			boolean isPrime = checkPrime(i);
			if (isPrime) {
				sum = sum + i;
				primeCount++;
			}
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println(primeSum(1, 50));
	}
}
