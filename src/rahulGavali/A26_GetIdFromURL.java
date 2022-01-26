package rahulGavali;

/*Assignment 26: 
20th Jan'2022 WAP to find out the value of id form the given input url. 
String url = "https://automationbykrishna.com/name=techno/id=123"; 
Hint : use split() 
*/

	public class A26_GetIdFromURL {

		String getId(String url) {
			String[] output = url.split("id=");
			return output[output.length-1];
		}

		public static void main(String[] args) {
		A26_GetIdFromURL getId = new A26_GetIdFromURL();
		String url = "https://automationbykrishna.com/name=techno/id=123";
		System.out.println("Value of id in the url is: "+getId.getId(url));

		}

}