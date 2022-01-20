/*Assignment 26 : 20th Jan'2022

WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Output = "123"

Hint : use split()
 */
package anjali;

public class Anjali_Assignment26 {
	
	String  findValueOfIdFromGivenUrl(String name){
		String []arr=name.split("id=");
	    return arr[1];
	}

	public static void main(String[] args) {
		 Anjali_Assignment26  anjali_Assignment26 = new  Anjali_Assignment26();
		 String output=anjali_Assignment26.findValueOfIdFromGivenUrl("https://automationbykrishna.com/name=techno/id=123");
		 System.out.println(("\"" +output+"\"") );
		 //example of escapting characater =>if I want id word in double quotes then System.out.println( "Expected \"id\" value " +output+"\"");
	}
}
