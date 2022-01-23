/*
WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Output = "123"
 */
package monikaArkade;

public class A26_FindValueOfIdFromUrl {

	String findValueOfId(String input) {
		String[] output = input.split("id=");
		return output[1];
	}
	
	public static void main(String[] args) {
		A26_FindValueOfIdFromUrl sp = new A26_FindValueOfIdFromUrl();
		String input = "https://automationbykrishna.com/name=techno/id=123";
		String id=sp.findValueOfId(input);
		System.out.println(id);
	}
}
