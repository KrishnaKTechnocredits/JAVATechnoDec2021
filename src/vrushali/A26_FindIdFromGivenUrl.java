/*WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Hint : use split()*/

package vrushali;

public class A26_FindIdFromGivenUrl {

	void getIDFromURL(String input) {
		String[] str = input.split("id=");
		System.out.println(str[1]);
	}

	public static void main(String[] args) {
		A26_FindIdFromGivenUrl findIdFromGivenUrl = new A26_FindIdFromGivenUrl();
		findIdFromGivenUrl.getIDFromURL("https://automationbykrishna.com/name=techno/id=123");
	}
}
