/* Assignment 26 : 20th Jan'2022

WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Output = "123"

Hint : use split()
 */
package shwetaDharmadhikari.assignment26;

public class PrintIdFromGivenUrl {

	void findIdFromUrl(String str) {

		String[] arr = str.split("id=");
		System.out.println("Output: "+arr[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintIdFromGivenUrl().findIdFromUrl("https://automationbykrishna.com/name=techno/id=123");
		;
	}

}
