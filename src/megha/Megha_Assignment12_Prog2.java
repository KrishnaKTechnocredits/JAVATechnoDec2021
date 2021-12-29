package megha;

import java.util.Scanner;

public class Megha_Assignment12_Prog2 {

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

	void findMaxPrimeNumFromRange(int startNum, int endNum) {

		int num = startNum;
		int maxPrime = 0;

		while (num <= endNum) {

			if (isPrime(num) == true) {
				maxPrime = num;
			}
			num++;
		}
		System.out.println("Maximum Prime Number is : " + maxPrime);
	}

	public static void main(String[] args) {
		Megha_Assignment12_Prog2 megha_Assignment12 = new Megha_Assignment12_Prog2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start Range of Prime Numbers : ");
		int startNum = sc.nextInt();
		System.out.print("Enter the End Range of Prime Numbers : ");
		int endNum = sc.nextInt();
		megha_Assignment12.findMaxPrimeNumFromRange(startNum, endNum);
		sc.close();

	}

}
