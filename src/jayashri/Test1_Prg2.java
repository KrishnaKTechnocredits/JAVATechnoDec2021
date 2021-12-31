package jayashri;

public class Test1_Prg2 {
	int sum=0;
	int count=0;

	void checkPrimeNum(int i) {
		boolean flag = true;
		for (int index = 2; index <= i / 2; index++) {
			if (i % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			sum = sum + i;
			count++;
			
		}
		
		
	}
	void sumOfPrimNumInRange(int strtNum, int lastNum) {
		sum=0;
		for (int index = strtNum; index <= lastNum; index++)
			checkPrimeNum(index);
		System.out.println("Sum of prime numbers from 1 to 100 : " + sum);
	}

	public static void main(String[] a) {
		Test1_Prg2 test1_prg2 = new Test1_Prg2();
		test1_prg2.sumOfPrimNumInRange(1, 100);
		
	}

}