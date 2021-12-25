package jagdish;

public class A10_Assignment_PrimeNo {

	int sum = 0;
	int count = 0;

	void isPrimeNumProgramLogic(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Given Number is Prime " + num);
			sum = sum + num;
			count++;
		}
	}

	void findPrimeNumberinRange(int startno, int endnum) {
		for (int index = startno; index <= endnum; index++) {
			isPrimeNumProgramLogic(index);
		}
		System.out.println("");
	}

	void sumPrimNumInRange(int startNum, int endnum) {
		sum = 0;
		for (int index = startNum; index <= endnum; index++)
			isPrimeNumProgramLogic(index);
		System.out.println("Sum of prime numbers for Requested Range " + startNum + " To " + endnum + " is: " + sum);
		System.out.println(" ");
	}

	void countPrimeNumInRange(int startNum, int endnum) {
		count = 0;
		for (int index = startNum; index <= endnum; index++)
			isPrimeNumProgramLogic(index);
		System.out.println("Count of prime numbers in given range " + startNum + " To " + endnum + " is: " + count);
		System.out.println(" ");
	}

	void averagePrimeNumInRange(int startNum, int endnum) {
		sum = 0;
		count = 0;
		for (int index = startNum; index <= endnum; index++)
			isPrimeNumProgramLogic(index);
		System.out.println(
				"Average of prime numbers in given range " + startNum + " To " + endnum + " is: " + sum / count);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		A10_Assignment_PrimeNo a10_assignment_primenumber = new A10_Assignment_PrimeNo();
		a10_assignment_primenumber.isPrimeNumProgramLogic(17);
		a10_assignment_primenumber.findPrimeNumberinRange(50, 100);
		a10_assignment_primenumber.sumPrimNumInRange(51, 70);
		a10_assignment_primenumber.countPrimeNumInRange(10, 25);
		a10_assignment_primenumber.averagePrimeNumInRange(11, 20);
	}
}
