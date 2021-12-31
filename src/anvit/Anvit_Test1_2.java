package anvit;

public class Anvit_Test1_2 {
	int sum;

	boolean isPrime(int num) {
		boolean flag=true;
		if (num==1)
			return false;

		for (int index=2; index<=num/2; index++) {
			if (num%index == 0) {
				flag=false;
				break;
			}
		}

		return flag;

	}

	void sumOfFirstTenPrimeNum(int start, int end) {
		int primeCnt = 0;
		int num = start;
		while (primeCnt<=10 && num<=end) {
			if(isPrime(num) == true) {
				sum=sum+num;
				primeCnt++;
			}
			num++;
		}

	}

	public static void main(String[] args) {
		Anvit_Test1_2 anvit2 = new Anvit_Test1_2();
		anvit2.sumOfFirstTenPrimeNum(100,200);
		System.out.println("sum of 10 prime numbers is " + anvit2.sum);

	}
}
