package tanu;

class Assignment10 {

	int sum=0;
	double avrg;
	static int count;

	void printPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				System.out.println(num + " is not prime");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is prime");
			count++;
			sum = sum + num;
			avrg = sum / count;
		}

	}

	void findPrimeNumberRange(int fnum, int lnum) {
		for (int num = fnum; num <= lnum; num++)
			printPrimeNumber(num);
	}

	void countOfPrimeNumberRange() {
		System.out.println(count);
	}

	void sumOfPrimeNumberRange() {
		System.out.println(sum);
	}

	void averageOfPrimeNumberRange() {
		System.out.println(avrg);
	}

	public static void main(String[] arg) {
		Assignment10 assignment = new Assignment10();
		assignment.printPrimeNumber(6);
		assignment.findPrimeNumberRange(100, 120);
		assignment.countOfPrimeNumberRange();
		assignment.sumOfPrimeNumberRange();
		assignment.averageOfPrimeNumberRange();

	}
}