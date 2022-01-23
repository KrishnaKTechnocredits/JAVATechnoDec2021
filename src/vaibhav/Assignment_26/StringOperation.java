/* Assignment 26 : 20th Jan'2022

WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Output = "123"

Hint : use split()

*/

package vaibhav.Assignment_26;

public class StringOperation {

	void expectedOutput(String str) {
		String[] expectedOutput = str.split("id=");
		System.out.println("Input URL 		: " + str);
		System.out.println("Expeccted output	:" +  " id = "+expectedOutput[1]);
	}

	public static void main(String[] args) {
		StringOperation stringOperation = new StringOperation();
		String inputURL = "https://automationbykrishna.com/name=techno/id=123";
		stringOperation.expectedOutput(inputURL);
	}
}
