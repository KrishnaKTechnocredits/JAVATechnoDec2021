package vrushali;

public class A7_printCharAtEvenPosition {

	void printCharEvenPosition(String input) {
		System.out.print("all characters at even position: ");
		for(int index = 0; index < input.length(); index++) {
			if(index%2!=0) {
				System.out.print(input.charAt(index));
			}
		}
		System.out.println("");
	}

	void printVowels(String input) {
		System.out.print("vowels from given string " + input + " are: ");
		for(int index = 0; index <input.length(); index++) {
			if((input.charAt(index)== 'a')  || (input.charAt(index)== 'e') || (input.charAt(index)== 'i')|| (input.charAt(index)== 'o')||(input.charAt(index)== 'u')){
				System.out.print(input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		A7_printCharAtEvenPosition printCharAtEvenPosition = new A7_printCharAtEvenPosition();
		printCharAtEvenPosition.printCharEvenPosition("Technocredits");
		printCharAtEvenPosition.printVowels("Technocredits");
	}
}

