package megha;

import java.util.Scanner;

public class Megha_Test3 {

	int findMaxFromGivenNum(int num) {
		int rem = 0;
		int max = num % 10;
		num = num / 10;

		while (num != 0) {
			rem = num % 10;
			if (max < rem)
				max = rem;
			num = num / 10;
		}

		return max;
	}

	public static void main(String[] args) {
		Megha_Test3 findMax = new Megha_Test3();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of your choice : ");
		int num = sc.nextInt();
		int max = findMax.findMaxFromGivenNum(num);
		System.out.println("The max digit in the given number is : " + max);
		sc.close();
	}
}
