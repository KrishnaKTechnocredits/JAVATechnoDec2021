/*
WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"
 */
package monikaArkade;

public class A24_Program4 {

	String firstCharacterOfWordWithUpperCase(String input) {
		String[] arr = input.split(" ");
		String output=" ";
		for(int index=0;index<arr.length;index++) {
			String word = arr[index];
			word = word.substring(0, 1).toUpperCase();
			output = word + arr[index].substring(1)+" ";
			System.out.println(output.trim());
		}
		return input;
	}
	public static void main(String[] args) {
		A24_Program4 p4 = new A24_Program4();
		String input = "anvit harsh dipali";
		p4.firstCharacterOfWordWithUpperCase(input);
	}
}
