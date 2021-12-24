package abhishek;
class Assignment10 {
	int sum = 0;
	int count = 0;
	
	void isPrimeNumberLogic(int num) {
		boolean flag = true;
		for(int index = 2; index <= num/2; index++) {
			if (num%index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is prime number");
			sum = sum + num;
			count++;
		}
	}
	void isPrimeNumber(int num) {
		boolean flag = true;
		for(int index = 2; index <= num/2; index++) {
			if (num%index == 0) {
				System.out.println(num + " is not prime number");
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is prime Number");
		}
		System.out.println("############");
	}

	void primeNumbersInRange(int startNum, int endNum) {
		System.out.println("Prime Numbers in Given range are:");
		for (int index = startNum; index <= endNum; index++) {
			isPrimeNumberLogic(index);

		}
		System.out.println("############");
	}

	void sumOfPrimNumInRange(int startNum, int endNum) {
		sum=0;
		for (int index = startNum; index <= endNum; index++)
			isPrimeNumberLogic(index);
		System.out.println("Sum of prime numbers in given range " + startNum + " To " + endNum + " is: " + sum);
		System.out.println("############");
	}

	void countOfPrimeNumInRange(int startNum, int endNum) {
		count=0;
		for (int index = startNum; index <= endNum; index++)
			isPrimeNumberLogic(index);
		System.out.println("Count of prime numbers in given range " + startNum + " To " + endNum + " is: " + count);
		System.out.println("############");
	}

	void averageOfPrimeNumInRange(int startNum, int endNum) {
		sum=0;
		count=0;
		for (int index = startNum; index <= endNum; index++)
			isPrimeNumberLogic(index);
		System.out.println("Average of prime numbers in given range " + startNum + " To " + endNum + " is: " + sum/count);
		System.out.println("############");
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.isPrimeNumber(17);
		assignment10.isPrimeNumber(37);
		assignment10.primeNumbersInRange(1, 10);
		assignment10.sumOfPrimNumInRange(11, 20);
		assignment10.countOfPrimeNumInRange(21, 30);
		assignment10.averageOfPrimeNumInRange(31, 40);
	}
}



			
			
			
			
		