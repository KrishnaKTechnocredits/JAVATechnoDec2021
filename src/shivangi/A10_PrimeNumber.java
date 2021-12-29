package shivangi;

public class A10_PrimeNumber {
	
	int count, sum, avg;
	
	void isPrimeNum(int num) {
		boolean flag = true;
		for(int index=2; index<=num/2; index++) {
			if(num%index==0) {
				//System.out.println(num + " is not a prime number");
				flag = false;
				break;
			}
		}
		if(flag == true) {
			count++;
			sum = sum+num;
			avg = sum/count;
			System.out.println(num + " is prime number");
		}
	}
	
	void primeInRange(int fNum, int lNum){
		for(int num = fNum; num <= lNum; num++){
			isPrimeNum(num);
		}
	}
	
	void findCountOfPrimeInARange(int fNum, int lNum) {
		count = 0;
		primeInRange(fNum, lNum);
		System.out.println("Count of prime numbers between "+fNum+" and "+lNum+" is : "+count+"");
	}
	
	void totalSumOfPrimeNumInRange(int fNum, int lNum){
		sum = 0;
		primeInRange(fNum, lNum);
		System.out.println("Sum of Prime number between "+fNum+" and "+lNum+" is : "+sum+"");
	}
	
	void avgOfPrimeNumInRange(int fNum, int lNum) {
		count = 0;
		sum = 0;
		avg = 0;
		primeInRange(fNum, lNum);
		System.out.println("Average of prime number in range is : "+avg+"");
	}
	
	public static void main(String[] args) {
		A10_PrimeNumber primeNumber = new A10_PrimeNumber();
		primeNumber.isPrimeNum(53);
		System.out.println();
		primeNumber.primeInRange(10, 20);
		System.out.println();
		primeNumber.findCountOfPrimeInARange(2, 10);
		System.out.println();
		primeNumber.totalSumOfPrimeNumInRange(10, 15);
		System.out.println();
		primeNumber.avgOfPrimeNumInRange(10, 15);
	}
}