package ashwini;

import java.util.Scanner;

class A12_Program2
{
		boolean isPrime(int num) {
		boolean flag = true;
		if (num == 1)
			return false;

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void findMaxPrimeNumFromRange(int fnum, int lnum) {

		int num = fnum;
		int maxPrime = 0;

		while (num <= lnum) {

			if (isPrime(num) == true) {
				maxPrime = num;
			}
			num++;
		}
		System.out.println("Maximum Prime Number is : " + maxPrime);
	}

	public static void main(String[] args) {
		A12_Program2 p2=new A12_Program2();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first num : ");
		int fnum = sc.nextInt();
		System.out.print("enter last num : ");
		int lnum = sc.nextInt();
		p2.findMaxPrimeNumFromRange(fnum, lnum);
		sc.close();

	}
}
