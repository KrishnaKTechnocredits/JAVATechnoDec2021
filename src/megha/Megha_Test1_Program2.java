package megha;

public class Megha_Test1_Program2 {

	int sum;

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

	void findSumOfFirstTenPrimeInARange(int startNum, int endNum) {
		int primeCnt = 0;
		int num = startNum;
		// for(int index = startNum; index<=endNum;index++) {
		while (primeCnt <= 10 && num <= endNum) {

			if (isPrime(num) == true) {
				sum = sum + num;
				primeCnt++;
			}
			num++;
		}

	}

	public static void main(String[] args) {
		Megha_Test1_Program2 megha_Test1 = new Megha_Test1_Program2();
		megha_Test1.findSumOfFirstTenPrimeInARange(1, 50);
		System.out.println("The sum of 10 Prime Numbers :" + megha_Test1.sum);

	}

}
