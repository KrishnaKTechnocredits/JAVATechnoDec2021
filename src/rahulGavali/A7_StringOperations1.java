/*Assignment - 7: 19th Dec'2021  
Create only one program having following 2 methods. 
1.Print all characters at even position from given string.
input : technocredits
output : ehordt
2. Print only vowels from given string.
input : technocredits
output : eoei*/

package rahulGavali;

public class A7_StringOperations1 {
	void evenPositionChars(String input) {
		System.out.print("Even position characters in the given string: ");
		for(int index = 0 ; index < input.length() ; index++) {
			if(index % 2 != 0)
				System.out.print(input.charAt(index));
		}
		System.out.println();
	}
	
	void printVowels(String input) {
		System.out.print("Vowels in the given string: ");
		for(int index = 0 ; index < input.length() ; index++) {
			if(input.charAt(index)== 'a' || 
					input.charAt(index)== 'e' || 
					input.charAt(index)== 'i' ||
					input.charAt(index)== 'o' || 
					input.charAt(index)== 'u') {
				System.out.print(input.charAt(index));
			}
		}
	}
	
	public static void main(String[] args) {
		A7_StringOperations1 stringOperation = new A7_StringOperations1();
		stringOperation.evenPositionChars("technocredits");
		stringOperation.printVowels("technocredits");
	}
}


