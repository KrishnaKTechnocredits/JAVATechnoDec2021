package apurva;

public class A7_Even_wovels {
	
	void displayEvenCharacters(String s) {
		System.out.println("Even number characters in the given string is :");
		for(int index=0;index<s.length();index++) {
			if(index%2!=0)
			System.out.println(s.charAt(index));
		}
	}
	void displayVowels(String s) {
		char ch = '\u0000';
		System.out.println("Vowels in the current string are");
		for(int index=0;index<s.length();index++) {
			if(s.charAt(index)=='a'||s.charAt(index)=='e'||s.charAt(index)=='i'||s.charAt(index)=='o'||s.charAt(index)=='u') {
				
				System.out.println(s.charAt(index));
			}
		}
	}
	
	public static void main(String[] a) {
		A7_Even_wovels evenVowels = new A7_Even_wovels();
		evenVowels.displayEvenCharacters("Technocredits");
		System.out.println("---------------------------------------");
		evenVowels.displayVowels("Technocredits");
	}

}
