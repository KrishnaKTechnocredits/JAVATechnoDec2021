package nishika;

public class A10_Primenumber {

	int count=0;
	int sum=0;
	
	void isPrimeNumber(int num) {
		boolean flag=true;
		for(int index=2;index<=num/2;index++) {
			if(num%index == 0) {
				flag=false;
				break;}
		}
		if(flag==true) {
			System.out.println(num+" is prime number");
			sum=sum+num;
			count++;}
	}
	
	void primeNumberInRange(int firstnum, int lastnum) {
		for(int index=firstnum;index<=lastnum;index++) {
			isPrimeNumber(index);
		}
	}
	
	void totalPrimeNumber() {
		System.out.println("_________Total prime numbers are:________ "+count);
	}
	
	void sumOfPrimeNumber() {
		System.out.println("Sum of prime numbers:____ "  +sum);
	}
	
	void avgOfPrimeNumber() {
		int avg = sum/count;
		System.out.println("Average of prime numbers:_______ "+avg);
	}
	
	public static void main(String[] args) {
		A10_Primenumber  primeNumber = new A10_Primenumber();
		primeNumber.isPrimeNumber(31);
		System.out.println("________________________________");
		primeNumber.primeNumberInRange(30,80);
		primeNumber.totalPrimeNumber();
		primeNumber.sumOfPrimeNumber();
		primeNumber.avgOfPrimeNumber();
	}
}
