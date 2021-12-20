package pradeep;

public class A7_PrintEvenCharVowel {
	 
	void printEvenChar(String input) {
		String evenChar = "";
		for(int index=0; index<input.length(); index++) {
			if(index%2 != 0) {
				evenChar = evenChar + input.charAt(index);
			}
		}
		System.out.println(evenChar);
	}
	
	void printVowel(String input) {
		String vowel="";
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == 'a'||(input.charAt(index) == 'e')||(input.charAt(index) == 'i')||(input.charAt(index) == 'o')||(input.charAt(index) == 'u')) {
				vowel = vowel + input.charAt(index);
			}
		}
		System.out.println(vowel);
	}

	public static void main(String[] args) {
		A7_PrintEvenCharVowel printCharVowel = new A7_PrintEvenCharVowel();
		System.out.println("Charator at Even position are:");
		printCharVowel.printEvenChar("technocredits");
		System.out.println("Vowels in given String are:");
		printCharVowel.printVowel("technocredits");
	}
}
