package megha;

public class Megha_Assignment_10 {

	int count; 
	double avg, sum;

	void isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
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
		Megha_Assignment_10 megha_Assignment = new Megha_Assignment_10();
		megha_Assignment.isPrime(17);
		System.out.println();
		megha_Assignment.findPrimeInARange(100, 120);
		System.out.println();
		megha_Assignment.findCountOfPrimeInARange(50, 100);
		System.out.println();
		megha_Assignment.findSumOfPrimeInARange(150, 180);
		System.out.println();
		megha_Assignment.findAverageOfPrimeInARange(20, 60);
	}

}
