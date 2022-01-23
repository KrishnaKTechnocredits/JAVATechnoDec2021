/*Assignment 26 : 20th Jan'2022

WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Output = "123"

Hint : use split()*/

package shivangi;

public class A26_FindValueOfIdFromGivenURL {
	
	String findValueOfIdFromGivenUrl(String input){
		String[] output = input.split("id=");
		return output[1];
	}
	
	public static void main(String[] args) {
		A26_FindValueOfIdFromGivenURL a6 = new A26_FindValueOfIdFromGivenURL();
		String finalOutput = a6.findValueOfIdFromGivenUrl("https://automationbykrishna.com/name=techno/id=123");
		System.out.println("The value of ID from given URL is : " + finalOutput);
	}
}
