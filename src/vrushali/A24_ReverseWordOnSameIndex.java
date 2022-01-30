/*4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"*/

package vrushali;

import java.util.Arrays;

public class A24_ReverseWordOnSameIndex {

	String getReverseWord(String name) {
		String output = "";
		for (int index = name.length()-1; index >= 0; index--) {
			char ch = name.charAt(index);
			output = output + ch;
		}
		 return  output;
	}
	
	void reverseEachWordOnSameIndex(String name) {
		
		String[] output = name.split(" ");
		for(int index = 0; index < output.length; index++) {
			
			output[index] = getReverseWord(output[index]);
		}
		System.out.println(Arrays.toString(output));
		}

		public static void main(String[] args) {
			A24_ReverseWordOnSameIndex reverseWordOnSameIndex = new A24_ReverseWordOnSameIndex();
			String str = "Hi techno hello";
			System.out.print("Reverse word array for the input string '" + str + "' is: ");
			reverseWordOnSameIndex.reverseEachWordOnSameIndex(str);
			
		}
	}
