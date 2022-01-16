package rohini;
/*find max prime number from given range. [range : 2 to 100, ans ; 97] [Program-2]*/

public class Rohini_Assignment12_PrimeNum {

	static int maxnum = 0;
	boolean flag = true;

	boolean isprime(int num) {

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				// System.out.println(num);
				return false;

			}
		}
		return flag;

	}

	void findMaxPrimeNum(int startnum, int endnum) {
		for (int num = startnum; num <= endnum; num++) {
			if ((isprime(num)) == true) {
				maxnum = num;
			}

		}
		System.out.println(maxnum);
	}

	public static void main(String[] args) {
		Rohini_Assignment12_PrimeNum primeNum = new Rohini_Assignment12_PrimeNum();
		primeNum.findMaxPrimeNum(2, 99);
		// System.out.println(maxnum);
	}

}
