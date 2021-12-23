package ashish;

public class A7_StringOperations {

	void printCharsAtEvenPosition(String input) {
		System.out.println(" Characters at even position in " + input + " are : ");
		for(int i=0; i<input.length(); i++) {
			if(i%2 == 1)
				System.out.print(" " + input.charAt(i));				
		}
		System.out.println();
	}
	
	void printVowelsFromString(String input) {
		System.out.println(" Vowels in " + input + " are : ");
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U')
				System.out.print(" " + input.charAt(i));				
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7_StringOperations stringOperations = new A7_StringOperations();
		stringOperations.printCharsAtEvenPosition("TECHNOCREDITS");
		stringOperations.printVowelsFromString("TECHNOCREDITS");
	}
}
