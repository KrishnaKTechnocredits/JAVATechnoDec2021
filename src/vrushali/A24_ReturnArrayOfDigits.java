/*3. WAP to return array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"*/

package vrushali;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A24_ReturnArrayOfDigits {

	String[] ArrayOfWordsContaingDigits(String name){

		String[] str = name.split(" ");
		for(int index = 0; index < str.length; index++) {
			String word = str[index];
			int wordLength = str[index].length();
			int digitCount = 0;
			String temp = "";
			for(int innerIndex = 0;  innerIndex< wordLength; innerIndex++) {
				char ch= word.charAt(innerIndex);
				if(Character.isDigit(ch)) {
					digitCount++;
					temp+=ch;
				}
							}			
			str[index] = temp;
		}
		return str;
	}

	public static void main(String[] args) {
		A24_ReturnArrayOfDigits returnArrayOfDigits = new A24_ReturnArrayOfDigits();
		String str = "Te1c2h C94re3";
		String[] arr = returnArrayOfDigits.ArrayOfWordsContaingDigits(str);
		System.out.println(Arrays.toString(arr));
	}
}
