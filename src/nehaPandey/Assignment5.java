package nehaPandey;

class Assignment5 {

	int x;

	void evenNumber(int start, int end) {
		for (x = start; x <= end; x++) {
			if (x % 2 == 0) {
				System.out.println("Even numbers are:" + x);
			}
		}
		System.out.println();
	}

	void divisibleNumber(int start, int end) {
		for (x = start; x <= end; x++) {
			if (x % 5 == 0) {
				System.out.println("Divisible by 5, numbers are:" + x);
			}
		}
		System.out.println();
	}

	void divisibleBy5And3(int start, int end) {
		for (x = start; x <= end; x++) {
			if (x % 5 == 0 && x % 3 == 0) {
				System.out.println("Divisible by 5 & 3, numbers are:" + x);
			}
		}
		System.out.println();
	}

	void divisibleBy7or13(int start, int end) {
		for (x = start; x <= end; x++) {
			if (x % 7 == 0) {
				System.out.println(x + " is divisible by 7 ");
			}
			if (x % 13 == 0) {
				System.out.println(x + " is divisible by 13");
			}
		}
		System.out.println();
	}

	void sum(int start, int end) {
		int c = 0;
		for (x = start; x <= end; x++) {
			c = c + x;
		}
		System.out.println("Sum is " + c);
		System.out.println();
	}

	void diffrence(int start, int end) {
		int d = 0;
		int e = 0;
		for (x = start; x <= end; x++) {
			if (x % 2 == 0) {
				e = e + x;
			}
			if (x % 2 != 0) {
				d = d + x;
			}
		}
		System.out.println("Difference between odd and even:" + (d - e));
		System.out.println();
	}

	void reverseOrder(int start, int end) {
		for (x = end; x >= start; x--) {
			if (x % 2 != 0) {
				System.out.println("Odd numbers in reverse order are " + x);
			}
		}
	}

	public static void main(String[] args) {
		Assignment5 assignment = new Assignment5();
		assignment.evenNumber(10, 15);
		assignment.divisibleNumber(10, 30);
		assignment.divisibleBy5And3(5, 18);
		assignment.divisibleBy7or13(5, 40);
		assignment.sum(10, 20);
		assignment.diffrence(3, 9);
		assignment.reverseOrder(10, 20);
	}
}
