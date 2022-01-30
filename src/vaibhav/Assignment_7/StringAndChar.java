/* Assignment - 7 : 19th Dec'2021
  
Create only one program having the following 2 methods. 
1.Print all characters at an even position from the given string.
input  : technocredits
output : ehordt

2. Print only vowels from a given string.
input  : technocredits
output : eoei

*/

package vaibhav.Assignment_7;

public class StringAndChar {

	void charAtEvenPosition(String str) {
		String temp = "";
		for (int index = 0; index <= str.length() - 1; index++) {
			if (index % 2 != 0)
				temp = temp + str.charAt(index);
		}
		System.out.println("String with the characters at an even position is : " + temp);
	}

	void vowelString(String str) {
		String temp = "";
		for (int index = 0; index <= str.length() - 1; index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u')
				temp = temp + str.charAt(index);
		}
		System.out.println("Vowels in the string are : " + temp);
	}

	public static void main(String[] args) {
		StringAndChar stringAndChar = new StringAndChar();
		stringAndChar.charAtEvenPosition("technocredits");
		stringAndChar.vowelString("technocredits");
	}
}