/*Assignment 24 - 16th Jan 2022*

Program 1. WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5
 */
package shwetaDharmadhikari.string_assignmment24;

public class PrintStringWithLength {

	void findLenghFromString(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			System.out.println(arr[index] + " --> " + wordLength);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello";
		new PrintStringWithLength().findLenghFromString(input);
	}
}
