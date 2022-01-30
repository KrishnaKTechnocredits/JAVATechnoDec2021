package poojaRajguru;

public class Test3_MaxDigitFromGivenNumber {

	void max() {
		int max = 0;
		int no = 6832774;
		while (no > 0) {
			int rem = no % 10;
			if (max < rem) {
				max = rem;
			}
			no = no / 10;
		}
		System.out.println("" + max);
	}

	public static void main(String[] args) {
		Test3_MaxDigitFromGivenNumber m = new Test3_MaxDigitFromGivenNumber();
		m.max();		
	}
}
