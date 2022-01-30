/*6 WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"*/

package vrushali;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

import javax.swing.plaf.InputMapUIResource;

public class A24_ReverseWord {

	String reverseString(String name) {
		String output = "";
		for (int index = name.length()-1; index >= 0; index--) {
			char ch = name.charAt(index);
			output = output + ch;
		}
		return  output;
	}

	String capitalizeFirstChar(String name) {
		char ch = Character.toUpperCase(name.charAt(0));
		String output = ch+ name.substring(1);
		return output;
	}

	void reverseStringWithFirstLetterAsCapital(String input) {
		String[] output = input.split(" ");
		for(int index = 0; index < output.length; index ++) {
			output[index] = reverseString(output[index]);
			output[index] = capitalizeFirstChar(output[index]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		A24_ReverseWord reverseWord = new A24_ReverseWord();
		reverseWord.reverseStringWithFirstLetterAsCapital("Vrushali Sagar Shital");
	}

}
