package sham;

public class Test4_Word_Prime {

	static boolean isPrime(int numLength) {		
		if (numLength == 1) {
			return false;
		}
		for (int i = 2; i <= numLength / 2; i++) {
			if (numLength % i == 0) {
				return false;
			}

		}
		return true;

	}

	void findWordLengthIsPrime(String sentence ) {
		
		String[] stringArr = sentence.split(" ");

		for (String word : stringArr) {

			if (isPrime(word.length())) {
				
				System.out.print(word+" ");
			}
		}
	}

	public static void main(String[] args) {
		Test4_Word_Prime wordPrime1 = new Test4_Word_Prime();
		String sentence1 ="I love my India";
		System.out.println("Example 1 Output: ");
		wordPrime1.findWordLengthIsPrime(sentence1);
		
		Test4_Word_Prime wordPrime2 = new Test4_Word_Prime();
		String sentence2 ="I would like to have a cup of tea";
		System.out.println();
		System.out.println("Example 2 Output: ");
		wordPrime2.findWordLengthIsPrime(sentence2);
		
		

	}

}
