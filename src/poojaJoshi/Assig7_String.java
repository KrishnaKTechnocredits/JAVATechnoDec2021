package poojaJoshi;

public class Assig7_String {

	void printevenCharacters(String input) {
		System.out.println("Character at even psoition in string are:");
		for(int index = 0;index<input.length();index++) {
			if((index+1)%2==0)
				System.out.print(input.charAt(index));	
		}
	}

	void printVowels(String input) {
		System.out.println("Vowels in given String are:");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		Assig7_String string = new Assig7_String();
		string.printevenCharacters("technocredits");
		System.out.println();
		string.printVowels("technocredits");
	}
}
