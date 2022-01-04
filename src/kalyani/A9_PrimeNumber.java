package kalyani;

public class A9_PrimeNumber {
	int sum;
	void isNumPrime (int num) {
		boolean flag=true;
		for (int index=2;index<=num/2;index++) {
			if(num%index==0) {
				flag=false;
				break;
			}
		}
		System.out.println(num + " is prime");
		if(flag==true) 
			sum= sum+num;
	}
	
	void findPrimeNumberInRange (int fnum, int lnum) {
		for (int startNum=fnum;startNum<=lnum;startNum++) {
			isNumPrime(startNum);
		}
		System.out.println("----------------------------------------------------------------");
	}	

	void totalPrimeNumInRange (int fnum, int lnum) {
		for (int startNum=100;startNum<=200;startNum++) {
			isNumPrime(startNum);
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total of Prime no is :");
		System.out.println(sum);
	}
	
	public static void main(String args[]) {
		A9_PrimeNumber primeNum= new A9_PrimeNumber();
		primeNum.isNumPrime(6);
		System.out.println("----------------------------------------------------------------");
		primeNum.findPrimeNumberInRange(10, 20);
		primeNum.totalPrimeNumInRange(100, 200);
		}
}
