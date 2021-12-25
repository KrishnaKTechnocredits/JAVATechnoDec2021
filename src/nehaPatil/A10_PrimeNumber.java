package nehaPatil;

public class A10_PrimeNumber {
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
				
			}

			void primeNumbersInRange(int startNum, int endNum) {
				System.out.println("Prime Numbers in Given range are:");
				for (int index = startNum; index <= endNum; index++) {
					isPrimeNumberLogic(index);

				}
				
			}

			void sumOfPrimNumInRange(int startNum, int endNum) {
				sum=0;
				for (int index = startNum; index <= endNum; index++)
					isPrimeNumberLogic(index);
				System.out.println("Sum of prime numbers in given range " + startNum + " To " + endNum + " is: " + sum);
				
			}

			void countOfPrimeNumInRange(int startNum, int endNum) {
				count=0;
				for (int index = startNum; index <= endNum; index++)
					isPrimeNumberLogic(index);
				System.out.println("Count of prime numbers in given range " + startNum + " To " + endNum + " is: " + count);
				
			}

			void averageOfPrimeNumInRange(int startNum, int endNum) {
				sum=0;
				count=0;
				for (int index = startNum; index <= endNum; index++)
					isPrimeNumberLogic(index);
				System.out.println("Average of prime numbers in given range " + startNum + " To " + endNum + " is: " + sum/count);
				
			}

			public static void main(String[] args) {
				A10_PrimeNumber a10_PrimeNumber = new A10_PrimeNumber();
				a10_PrimeNumber.isPrimeNumber(17);
				a10_PrimeNumber.isPrimeNumber(57);
				a10_PrimeNumber.primeNumbersInRange(1, 20);
				a10_PrimeNumber.sumOfPrimNumInRange(11, 20);
				a10_PrimeNumber.countOfPrimeNumInRange(11, 20);
				a10_PrimeNumber.averageOfPrimeNumInRange(11, 20);
			}
}