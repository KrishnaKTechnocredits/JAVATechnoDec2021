package naquibalam;

public class A7_StringOperation {
	
	void evenPositionCheck(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 != 0) {
				output = output + input.charAt(i);
			}
		}
		System.out.println("Even position characters in string [" + input + "] is [" + output + "]");
	}
	
	void vovelCheck(String input) {
		char c1 = 'a', c2 = 'e', c3 = 'i', c4 = 'o', c5 = 'u';
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char characterAtIndex = input.charAt(i);
			if ((characterAtIndex == c1) || (characterAtIndex == c2) || (characterAtIndex == c3) || (characterAtIndex == c4) || (characterAtIndex == c5)) {
				output = output + input.charAt(i);			
			}
		}
		System.out.println("Vovel characters in string [" + input + "] is [" + output + "]");
	}

	public static void main(String[] args) {
		A7_StringOperation a7_StringOperation = new A7_StringOperation();
		System.out.println("-------------------------------------------------------------------------");
		a7_StringOperation.evenPositionCheck("technocredits");
		System.out.println("-------------------------------------------------------------------------");
		a7_StringOperation.vovelCheck("technocredits");
		System.out.println("-------------------------------------------------------------------------");
	}
}
