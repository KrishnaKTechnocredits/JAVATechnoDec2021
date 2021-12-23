package megha;

public class Megha_Assignment_10 {

	int count, sum, avg;

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
			System.out.println(num + " is a Prime Number");
		}
	}

	void findPrimeInARange(int startNum, int endNum) {
		sum = 0;
		count = 0;
		for (int num = startNum; num <= endNum; num++) {
			isPrime(num);
		}
		System.out.println("Count of Prime numbers is : " + count);
		System.out.println("Sum of Prime numbers is : " + sum);
		System.out.println("Average of Prime numbers is : " + avg);
	}

	public static void main(String[] args) {
		Megha_Assignment_10 megha_Assignment = new Megha_Assignment_10();
		megha_Assignment.isPrime(17);
		megha_Assignment.findPrimeInARange(100, 120);
	}

}
