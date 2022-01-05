package anjali;

public class Test2_Anjali {
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
		int primeCountt = 0;
		int num = startNum;
		{
		while (primeCountt <= 10 && num <= endNum) {

			if (isPrime(num) == true) {
				sum = sum + num;
				primeCountt++;
			}
			num++;
		}
		}
	}

	public static void main(String[] args) {
		Test2_Anjali anjali_Test1_2 = new Test2_Anjali();
		anjali_Test1_2.findSumOfFirstTenPrimeInARange(1, 50);
		System.out.println("The sum of 10 Prime Numbers :" + anjali_Test1_2.sum);

	}

}


