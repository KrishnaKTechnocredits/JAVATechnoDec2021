package kalyani;

public class A10_PrimeNum {
	int sum;
	int count;
	float avg;

	void isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			count++;
			sum = sum + num;
			avg = sum / count;
			System.out.println(num + " is a Prime numbers");
		}

	}
	
	void findPrimeNumberInRange (int fnum, int lnum) {
		for (int startNum=fnum;startNum<=lnum;startNum++) {
			isPrime(startNum);
		}
	}	

	void totalPrimeNumInRange (int fnum, int lnum) {
		count = 0;
		findPrimeNumberInRange (fnum,lnum);
		System.out.println("Total Prime no is :");
		System.out.println(count);
	}
	
	void sumPrimeNumInRange (int fnum, int lnum) {
		count = 0;
		findPrimeNumberInRange (fnum,lnum);
		System.out.println("Sum of Prime no is :");
		System.out.println(sum);
	}
	
	void avgPrimeNumInRange (int fnum, int lnum) {
		count = 0;
		sum = 0;
		avg = 0;
		findPrimeNumberInRange (fnum,lnum);
		System.out.println("avg of Prime no is :" +avg);
		
	}
	
	public static void main(String args[]) {
		A10_PrimeNum primeNum= new A10_PrimeNum();
		primeNum.isPrime(17);
		System.out.println("----------------------------------------------------------------");
		primeNum.findPrimeNumberInRange(100, 120);
		System.out.println("----------------------------------------------------------------");
		primeNum.totalPrimeNumInRange(50, 100);
		System.out.println("----------------------------------------------------------------");
		primeNum.sumPrimeNumInRange(150,40);
		System.out.println("----------------------------------------------------------------");
		primeNum.avgPrimeNumInRange(20,60);
		}
}
