package tanu;

class TestProgram2 {
	int index;
	int sum;
	int count;

	void primeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			sum = sum + num;
			count++;
			if(count == 10)
			{
				System.out.println(sum);
			}
						
		}

	}

	void sumOfFirstTenPrimeNumberRange(int fnum, int lnum) {
		for (int num = fnum; num <= lnum; num++) {
			primeNumber(num);
		}


	}

	public static void main(String[] arg) {
		TestProgram2 testprogram = new TestProgram2();
		testprogram.sumOfFirstTenPrimeNumberRange(100, 200);
	}

}