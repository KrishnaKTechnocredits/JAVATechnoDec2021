package anvit;

public class A10_PrimeNumbers {
	double sum;
	int total;
	double avg;
	
	void primeNumbers(int num) {
		boolean flag=true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				//System.out.println(num + " is not a prime number");
				flag=false;
				break;
			}
		}
		if(flag==true) {
			sum = sum + num;
			total++;
			avg = sum/total;
			System.out.println(num + " is a prime number");
		}
	}
	
	void primeNumbersInRange(int snum, int endnum) {
		for(int startnum = snum; startnum<=endnum; startnum++) {
			primeNumbers(startnum);
		}
	}
	
	void sumOfPrimeNumbers(int snum, int endnum) {
		sum = 0;
		for(int startnum = snum; startnum<=endnum; startnum++) {
			primeNumbers(startnum);
		}
			System.out.println("sum of all prime numbers is "+ sum);
	}
	
	void totalPrimeNumbers(int snum, int endnum) {
		total = 0;
		for(int startnum = snum; startnum<=endnum; startnum++) {
			primeNumbers(startnum);
		}
			System.out.println("Total prime numbers are "+ total);
	}
	
	void averageOfAllPrimeNumbers(int snum, int endnum) {
		avg = 0;
		sum=0;
		total=0;
		for(int startnum = snum; startnum<=endnum; startnum++) {
			primeNumbers(startnum);
		}
			System.out.println("Average of  prime numbers are "+ avg );
	}
	
	public static void main(String[] args) {
		A10_PrimeNumbers A10primenumbers = new A10_PrimeNumbers();
		A10primenumbers.primeNumbers(13);
		System.out.println();
		A10primenumbers.primeNumbersInRange(3,5);
		System.out.println();
		A10primenumbers.sumOfPrimeNumbers(43,50);
		System.out.println();
		A10primenumbers.totalPrimeNumbers(7,30);
		System.out.println();
		A10primenumbers.averageOfAllPrimeNumbers(10,34);
	}
}