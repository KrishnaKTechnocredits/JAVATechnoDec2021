/*
Assignment - 6 : 18th Dec'21

Create a single program for following requirements.
1. Create a method to print all characters of given input.
input : techno
output : t
             e
	     c
	     h
	     n
	     o
Hint : 
void display(String input){

}

2. Create a method to print all characters of given input in reverse order.
input : techno
output : o
              n
	      h
	      c
	      e
	      t
Hint:
void reverse(String input){

}

3. Create a method to find occurance of given character from input string.
input : akanksha
        'a'
output : a -> 3
Hint : 
void findCharFreq(String input, char ch){

}

*/

package vaibhav.Assignment_6;

public class StringAndChar {

	void allCharInString(String str) {
		System.out.println("All charaters in the given string are as below :");
		for (int index = 0; index < str.length(); index++) {
			System.out.println(str.charAt(index));
		}
		System.out.println("----------------------------------------------");
	}

	void allCharInStringInReverseOrder(String str) {
		System.out.println("All charaters in reverse order in the given string are as below :");
		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.println(str.charAt(index));
		}
		System.out.println("----------------------------------------------");
	}

	void freqOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println("Frequency of character '" + ch + "' in a given String '" + str + "' is " + count);

	}

	public static void main(String[] args) {
		StringAndChar stringAndChar = new StringAndChar();
		stringAndChar.allCharInString("Techno");
		stringAndChar.allCharInStringInReverseOrder("Techno");
		stringAndChar.freqOfChar("akanksha", 'a');
	}

}
