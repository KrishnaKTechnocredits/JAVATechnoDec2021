package sandip.Test_1;

public class Program1 {
	int sum;
	int count;

	void isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true && count < 10) {
			System.out.println(num + " is a prime number");
			count++;
			sum = sum + num;
		}
	}

	void primeRange(int startnum, int endnum) {
		for (int index = startnum; index <= endnum; index++) {
			isPrimeNumber(index);
		}
		System.out.println("Count :" + count);
		System.out.println("Sum is :" + sum);
	}

	public static void main(String[] args) {
		Program1 primeNo = new Program1();
		primeNo.primeRange(10, 100);
	}
}
