package shamli;

public class Test4Program2 {
	
	void findWordWitPrimeLength(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			if (isPrime(wordLength))
				System.out.print(arr[index] + " ");
		}
	}

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
	
	public static void main(String[] args) {
		Test4Program2 test4program2= new Test4Program2();
		String str1 ="I love my India";
		String str2 ="I would like to have a cup of tea";
		System.out.println("Prime length Words from '"+str1 +"' are :");
		test4program2.findWordWitPrimeLength(str1);
		System.out.println();
		System.out.println("Prime length Words from '"+str2 +"' are :");
		test4program2.findWordWitPrimeLength(str2);
	}
}
