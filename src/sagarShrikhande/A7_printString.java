package sagarShrikhande;

public class A7_printString {

	void printEvenChars(String input) {
		System.out.println("characters at even index are: ");
		for(int index = 0; index<input.length(); index++) {
			if(index%2 == 0)
				System.out.print(input.charAt(index)+ " ");
		}
	}	
	
	void printVowels(String input) {
		System.out.println(" ");
		System.out.println("vowels are: ");
		for(int index = 0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U' )
				System.out.print(ch+" ");
			}
	}
	
	public static void main(String[] args) {
		A7_printString a7_printString = new A7_printString();
		a7_printString.printEvenChars("TechnoCredits");
		a7_printString.printVowels("Technocredits");
	}

}
