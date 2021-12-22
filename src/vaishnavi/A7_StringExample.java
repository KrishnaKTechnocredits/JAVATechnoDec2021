package vaishnavi;

public class A7_StringExample {
	void printCharAtEvenPosition(String name) {
		System.out.println("The characters in even spaces are : ");
		for(int index = 0; index<name.length(); index++) {
			if((index+1)%2 == 0) {
				System.out.print(name.charAt(index));
			}
		}
	}

	void printVowelsCharacters(String name) {
		System.out.println("The vowels are in given string are : ");
		for(int index = 0; index<name.length(); index++) {
			char ch = name.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
				System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		A7_StringExample a7_StringExample = new A7_StringExample();
		a7_StringExample.printCharAtEvenPosition("technocredits");
		System.out.println();
		a7_StringExample.printVowelsCharacters("technocredits");
	}
}