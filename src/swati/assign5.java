package swati;
public class assign5 {

	void printEven(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println("even number " + i);

			}
		}
		System.out.println("--------");

	}

	void divby5(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 5 == 0) {
				System.out.println("Divisible by 5 " + i);
			}
		}

		System.out.println("--------");
	}

	void divby3and5(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Divisble by 3 and 5 are " + i);
			}
		}
		System.out.println("--------");

	}

	void divby7or13(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 7 == 0 || i % 13 == 0) {
				System.out.println("Divisble by 7 and 13 are " + i);
			}
		}
		System.out.println("--------");
	}

	void sumOfInt(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("Sum is " + sum);
		System.out.println("--------");
	}

	void odd(int start, int end) {
		int even = 0;
		int odd = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "even");
				even = even + i;

			} else {
				System.out.println(i + "odd");
				odd = odd + i;

			}

		}

		System.out.println("difference between odd and even is " + Math.abs(even - odd));
		System.out.println("--------");
	}

	void revOdd(int start, int end) {
		for (int i = end; i >= start; i--) {
			if (i % 2 != 0) {
				System.out.println(i + " is odd");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign5 num = new assign5();
		num.printEven(10, 15);
		num.divby5(10, 30);
		num.divby3and5(5, 30);
		num.divby7or13(5, 40);
		num.sumOfInt(1, 5);
		num.odd(3, 9);
		num.revOdd(10, 20);
	}

}
