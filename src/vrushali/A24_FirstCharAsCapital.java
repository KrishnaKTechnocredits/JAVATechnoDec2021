/*5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"
*/

package vrushali;

import java.util.Arrays;

public class A24_FirstCharAsCapital {
	
	String makeFirstLetterToCapital(String name) {
		char ch = Character.toUpperCase(name.charAt(0));
		name = ch + name.substring(1);
		return name;
	}
	
	void convertFirstLetterOfWordToCapital(String name) {
		String[] arr = name.split(" ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = makeFirstLetterToCapital(arr[index]);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		A24_FirstCharAsCapital firstCharAsCapital = new A24_FirstCharAsCapital();
		String str = "anvit harsh dipali";
		firstCharAsCapital.convertFirstLetterOfWordToCapital(str);
	}
}
