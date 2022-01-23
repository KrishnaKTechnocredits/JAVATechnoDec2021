/*Assignment 26 : 20th Jan'2022

WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Output = "123"

Hint : use split()
*/

package pallavi;

public class A26_ExtractString {

	void extractStr(String input) {
		String[] output = input.split("id=");
		System.out.println("id is : " + output[output.length - 1]);
	}

	public static void main(String[] args) {
		String input = "https://automationbykrishna.com/name=techno/id=123";
		System.out.println(input);
		new A26_ExtractString().extractStr(input);
	}
}
