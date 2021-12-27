package megha;

import java.util.Scanner;

public class Megha_Assignment12_Prog4 {
	int remainder = 0;
	int revNum = 0;

	void reverseGivenNumber(int num) {

		while (num > 0) {
			remainder = num % 10;
			revNum = revNum * 10 + remainder;
			num = num / 10;
		}

		System.out.println("The Reverse Number of " + num + " is : " + revNum);

	}

	public static void main(String[] args) {
		Megha_Assignment12_Prog4 megha_Assignment12 = new Megha_Assignment12_Prog4();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		megha_Assignment12.reverseGivenNumber(num);
		sc.close();

	}

}
