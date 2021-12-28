package abhishek;
import java.util.Scanner;
class Assignment12_p2 {
	int maxPrime = 0;
	int isPrimeNumberLogic(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			maxPrime = num;

		}
		return maxPrime;
	}


	void primeNumbersInRange(int startNum, int endNum) {

		for (int index = endNum; index >= startNum; index--) {
			maxPrime= isPrimeNumberLogic(index);
			if(maxPrime !=0)
				break;

		}
		System.out.println("Max Prime Num is: "+ maxPrime);
	}

	public static void main(String[] args) {
		Assignment12_p2 assignment12_p2 = new Assignment12_p2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number of range: ");
		int startNum = sc.nextInt();
		System.out.println("Enter End number of range: ");
		int endNum = sc.nextInt();
		assignment12_p2.primeNumbersInRange(startNum, endNum);
		sc.close();
	}

}