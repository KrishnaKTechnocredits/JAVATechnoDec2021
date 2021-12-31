package technocredits;

public class ReturnTypeExample1 {
	
	double getLengthOfString(String input) {
		int strLength = input.length();
		System.out.println(input + " and length is " + strLength);
		return strLength;
	}
	
	int getLengthOfString1(String input) {
		int strLength = input.length();
		if(strLength % 2 == 0) {
			System.out.println("Krishna");
			return 0;
		}else {
			System.out.println("Maulik");
			return 1;
		}
		//System.out.println("Hi");
	}
	
	int getFirstOccurenceOfChar(String input, char ch) {
		int charIndex = -1;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == 'c') {
				charIndex = index;
				break;
			}
		}
		return charIndex;
	}
	
	int printGivenOccurenceOfChar(String input, char ch, int occ) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == 'c') {
				count++;
				if(count == occ) {
					return index;
				}
			}
		}
		return -1;
	}
	
	int printFirstOccurenceOfChar1(String input, char ch) {
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == 'c') {
				return index;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		ReturnTypeExample1 returnTypeExample1 = new ReturnTypeExample1();
		double temp = returnTypeExample1.getLengthOfString("technocredits");
		int index = returnTypeExample1.getFirstOccurenceOfChar("technocredits", 'b');
		if(index == -1)
			System.out.println("technocredits doenst have b in it");
		//PrimeNumber primeNumber = new PrimeNumber();
		//primeNumber.isPrimeNumber(len, true);
	}
}
