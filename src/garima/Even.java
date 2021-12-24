package garima;

class Even {
	void evenNum(int startNum, int endNum) {
		System.out.println("Even number");
		for (int num = startNum; num <= endNum; num++) {
			if (num % 2 == 0)
				System.out.println(num);
		}
	}

	void divideNum(int startNum, int endNum) {
		System.out.println("divisible by 5");
		for (int num = startNum; num <= endNum; num++) {
			if (num % 5 == 0)
				System.out.println(num);
		}
	}

	void divisibleFiveAndThree(int startNum, int endNum) {
		System.out.println("divisible by 5 and divisible by 3");
		for (int num = startNum; num <= endNum; num++) {
			if (num % 5 == 0 && num % 3 == 0)
				System.out.println(num);
		}
	}

	void divisibleSevenAndThirteen(int startNum, int endNum) {
		System.out.println("divisible by 7 or 13");
		for (int num = startNum; num <= endNum; num++) {
			if (num % 7 == 0 || num % 13 == 0) {
				if (num % 7 == 0)
					System.out.println(num + " is divisible by 7");
			} else if (num % 13 == 0)
				System.out.println(num + " is divisible by 13");
		}
	}

	void oddNumberReverse(int startNum, int endNum) {
		System.out.println("odd numbers in reverse order");
		for (int num = endNum; num > startNum; num--) {
			if (num % 2 != 0)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Even even = new Even();
		even.evenNum(10, 15);
		even.divideNum(10, 30);
		even.divisibleFiveAndThree(5, 18);
		even.divisibleSevenAndThirteen(5, 40);
		even.oddNumberReverse(10, 20);
	}
}