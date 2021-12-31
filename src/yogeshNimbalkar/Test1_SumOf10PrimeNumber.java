package yogeshNimbalkar;

public class Test1_SumOf10PrimeNumber {

	boolean isPrime(int num) {
		boolean flag = true;
		for(int index=2; index<=(num/2);index++)
			if(num % index == 0) {
				flag = false;
				break;
			}
//		if(flag == true)
//			System.out.println(num);
		return flag;
	}
	
	void getSumofPrimeNumber(int startIndex, int endIndex) {
		int sum = 0, primecount=0;
		boolean res;
		while(primecount <10 && startIndex<=endIndex) {
			res = isPrime(startIndex);
			if(res == true) {
				sum = sum + startIndex;
				primecount ++;
			}
			startIndex++;
		}
		System.out.println("Sum of first 10 prime number in given range = " + sum);
		
	}
	
	public static void main(String[] args) {
		Test1_SumOf10PrimeNumber sumofprimenumber = new Test1_SumOf10PrimeNumber();
		sumofprimenumber.getSumofPrimeNumber(2,100);
	}
}
