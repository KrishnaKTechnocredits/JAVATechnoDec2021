package swati.Test1;

public class PrimeWhile {
	int primeCnt = 0;

	boolean findPrime(int num) {
		int i = 2;

		boolean flag = false;
		while (i < num) {
			if (num % i == 0) {
				flag = true;
				// System.out.println(num + " is not prime");
				break;
			}
			i++;
		}
		if (flag == false) {

			System.out.println(num + " is prime");
		}
		return flag;

	}

	void printRange(int start, int end) {
		while (start < end && primeCnt < 11) {
			boolean flag = findPrime(start);
			start++;
			if (flag == false) {
				primeCnt++;

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeWhile pr = new PrimeWhile();
		// pr.findPrime(7);
		pr.printRange(3, 53);
	}

}
