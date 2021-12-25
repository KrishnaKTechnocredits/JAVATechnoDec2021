package sandip.Test_1;

public class Program1 {
	int sum;
	int count;

	void isPrimeNumber(int startnum, int endnum) {
		for (int index = startnum; index <= endnum / 2; index++) {
			boolean flag = true;
			if (index % 2 == 0) {
				flag = false;
			}
			if (flag == true) {
				System.out.println(index + "is a prime number");
				count++;
				sum = sum + index;
			}
			if (count >= 10) {
				break;
			}
		}
		System.out.println("Count :" + count);
		System.out.println("Sum is :" + sum);
	}

	public static void main(String[] args) {
		Program1 primeNo = new Program1();
		primeNo.isPrimeNumber(10, 100);
	}
}
