package priya;

public class A10_PrimeNum {	
	/*
	Assignment - 10 : 23rd Dec'2021
	Write a program with following methods.
	1. create a method to find a given number is prime.
	2. create a method to find out all prime numbers from given range.
	3. create a method to find out how many prime numbers are there in given range.
	4. create a method to find sum of all prime number in given range.
	5. create a method to find average of all prime numbers in given range
	*/
			int count;
			double avg, sum;

			void isPrime(int num) {
				boolean flag = true;
				for (int index = 2; index <= num / 2; index++) {
					if (num % index == 0) {
						System.out.println(num + " is a not prime numbers");
						flag = false;
						break;
					}
				}
				if (flag == true) {
					count++;
					sum = sum + num;
					avg = sum / count;
					System.out.println(num + " is a Prime numbers");
				}

			}

			void findPrimeInARange(int startNum, int endNum) {
				for (int num = startNum; num <= endNum; num++) {
					isPrime(num);
				}
			}

			void findCountOfPrimeInARange(int startNum, int endNum) {
				count = 0;
				findPrimeInARange(startNum, endNum);
				System.out.println("Count of Prime numbers is : " + count);
			}

			void findSumOfPrimeInARange(int startNum, int endNum) {
				sum = 0;
				findPrimeInARange(startNum, endNum);
				System.out.println("Sum of Prime numbers is : " + sum);
			}

			void findAverageOfPrimeInARange(int startNum, int endNum) {
				avg = 0;
				count = 0;
				sum = 0;
				findPrimeInARange(startNum, endNum);
				System.out.println("Average of Prime numbers is : " + avg);
			}

			public static void main(String[] args) {
				A10_PrimeNum megha_Assignment = new A10_PrimeNum();
				megha_Assignment.isPrime(10);
				System.out.println("--------------------");
				megha_Assignment.isPrime(17);
				System.out.println("--------------------");
				megha_Assignment.findPrimeInARange(10, 20);
				System.out.println("--------------------");
				megha_Assignment.findCountOfPrimeInARange(10,20);
				System.out.println("--------------------");
				megha_Assignment.findSumOfPrimeInARange(10, 20);
				System.out.println("--------------------");
				megha_Assignment.findAverageOfPrimeInARange(10, 20);
			}
	}