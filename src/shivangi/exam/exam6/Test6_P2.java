/*
Test6 -program2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits
*/
package shivangi.exam.exam6;

import java.util.Arrays;

public class Test6_P2 {
	
	void findStringWithMaxWordLength(String input) {
		String[] wordArr = input.split(" ");
		System.out.println("Given input array is : " + Arrays.toString(wordArr));
		int maxLength = 0;
		String maxString = "";
		for(int index=0; index<wordArr.length; index++) {
			if(maxLength < wordArr[index].length()) {
				maxLength = wordArr[index].length();
				maxString = wordArr[index];
			}
		}
		System.out.println("Max string is : " + maxString + ", which length is : " + maxLength);
	}
	
	public static void main(String[] args) {
		Test6_P2 p2 = new Test6_P2();
		p2.findStringWithMaxWordLength("good morning technocredits hi hello");
	}
}
