package swati.Test1;

public class Test2_Prime {

	boolean findPrime(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	int findPrimeRange(int start, int end) {
		int count = 0;
		int sum = 0;
		for (int i = start; i <= end; i++) {
			boolean flag = findPrime(i);
			if (flag == true) {
				// System.out.println(i +" is not prime number");
			} else {

				count++;

				System.out.println(i + " is prime number");
				if (count <= 10) {
					sum = sum + i;
				}

			}
		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2_Prime prime = new Test2_Prime();
		int sum = prime.findPrimeRange(3, 40);
		System.out.println(sum);
	}

}
