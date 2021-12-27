package nasir;

public class Test2_Program {

	// find sum of first 10 prime numbers in given range
	static int count;
	static int sum;

	boolean setPrimeNumber(int startNumber) {
		boolean flag = true;
		for (int index = 2; index < startNumber; index++) {
			if (startNumber % index == 0) {
				flag = false;
				// output=index;
				break;
			}
		}
		// if(flag==true)
		return flag;
	}

	void setRange(int startRange, int endRange) {

		for (int index = startRange; index <= endRange; index++) {
			boolean ans = setPrimeNumber(index);
			if (ans == true) {
				count++;
				System.out.println(index + " is prime number");

				sum = sum + index;
			}
			if (count == 10) {
				System.out.println("First 10 Prime number sum in given range is "+sum);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Test2_Program test2_program = new Test2_Program();
		test2_program.setRange(10, 100);
	}

}
